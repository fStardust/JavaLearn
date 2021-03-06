package com.fs.a_array;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		remove(array, 3);
		
		System.out.println(Arrays.toString(array));
	}
	
	/*
	存在一个数组，数组中的元素为
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		要求:
			1. 0是无效元素，仅占位使用
		需求:
			在当前数组中删除指定下标的元素
		例如:
			指定下标5
			结果 {1, 3, 5, 7, 9, 13, 15, 17, 19, 0} 
			0占位！！！
	思考：
		将下标为n的元素从数组中移除，下标n之后的元素整体向左移动
		从n后一个有效元素开始向前覆盖 --> arr[i] = arr[i+1]
		前置赋值，并在最后补上占位元素--0
	方法分析：
		public static
		返回值类型:
			boolean
		方法名：
			remove
		形式参数列表:
			1. 删除数组的数组
			2. 指定删除数据的下标位置
	方法声明：
		public static boolean remove(int[] arr, int index)
	*/
	/**
	 * 删除数组中指定下标元素的内容
	 * @param arr 源数据数组，int类型
	 * @param index 指定删除的下标位置
	 * @return 删除操作成功返回true 失败返回false
	 */
	public static boolean remove(int[] arr, int index)  {
		// 参数合法性判断
		if (index < 0 || index > arr.length - 1) {
			System.out.println("Input Parameter is Invalid");
			return false;
		}
		
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		//
		arr[arr.length - 1] = 0;
		return true;
	}
}
