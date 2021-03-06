package com.fs.a_array;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		System.out.println(Arrays.toString(arr));
		
		selectSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	/*
	 * 选择排序算法
	 * 方法分析：
	 * 	public static
	 * 	返回值：
	 * 		void
	 * 	方法名：
	 * 		selectSort
	 * 	形式参数列表：
	 * 		需要处理一个int类型数组
	 * 		(int[] arr)
	 * 
	 * 增序操作：
	 * 	只需将该句中的< 改为> 即可
	 * 		if (arr[index] < arr[j])
	 * 
	 *方法声明：
	 *	public static void selectSort(int[] arr)
	 */
	/**
	 * 选择排序算法
	 * 
	 * @param arr 需要进行排序的int类型数据
	 */
	public static void selectSort(int[] arr) {
		// 外层循环控制核心算法的循环次数
		for (int i = 0; i < arr.length - 1; i++) {
			// 从index开始找寻极值
			int index = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}
			}
			
			if (index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}
}
