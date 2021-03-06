package com.fs.a_array;

import java.util.Arrays;

public class DemoArrays {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		System.out.println(Arrays.toString(arr));
		
		// 快速排序 默认递增
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 二分法查找
		 * 		1. 数据必须有序，无序情况下不保证查询结果情况
		 * 		2. 数据未找到，返回负数
		 * 		3. 多个相同数据的情况下， 不保证找到数据是第几个数据
		 */
		int index = Arrays.binarySearch(arr, -5);
		System.out.println(index);
	}
}


