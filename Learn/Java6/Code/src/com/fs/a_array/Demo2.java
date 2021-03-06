package com.fs.a_array;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 0};
		
		add(array, 5, 20);
		
		// 打印数组元素的值
		System.out.println(Arrays.toString(array));
	}
	
	/*
	存在一个数组，数组中的元素为
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 0};
		要求
			1. 0是无效元素，仅占位使用
			2. 当前数组中【有效元素】个数为9
		需求
			在该数组中的指定下标位置放入指定元素
	思考：
		在数组下标为n的位置插入元素，从下标n之后的元素整体向右移动
		从最后一个有效元素开始向后覆盖 --> arr[i] = arr[i-1]
		后置赋值，防止有效数据被覆盖
	【重点】
		1. 空数据，无效数据思想
		2. 数据的移动过程，粗加工，细打磨过程
		3. 时间消耗问题
		
	方法分析:
		pubilc static
		返回值类型：
			void 可用，但不推荐
			boolean 可以 表示插入成功与否
			int 可以 但返回值含义的约束较麻烦
		方法名:
			add
		形式参数列表：
			1. 需要插入数据的数组
			2. 指定插入数据的下标位置
			3. 指定插入的数据
			(int[] arr, int index, int insert)
	方法声明：
		public static boolean add(int[] arr, int index, int insert)
	*/
	/**
	 * 在指定的数组中，指定位置插入指定元素
	 * 
	 * @param arr 指定的int类型数组
	 * @param index 指定的下标位置，必须在合理的区间范围内
	 * @param insert 指定插入的元素，int类型
	 * @return 添加成功返回true，否则返回false
	 */
	public static boolean add(int[] arr, int index, int insert) {
		// 参数合法性判断
		if (index < 0 || index > arr.length - 1) {
			System.out.println("Input Parameter is Invaliad");
			// 方法运行失败
			return false;
		}
		
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[index] = insert;
		
		return true;
	}
}
