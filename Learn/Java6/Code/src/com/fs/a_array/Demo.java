package com.fs.a_array;

/**
 * 
 * @author fStardust
 *
 */
public class Demo {
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 4534, 3, 4, 6};
		
		allIndexOf(arr, 2);
	}
	
	/*
	 * 要求：
	 * 	返回指定元素在数组中的所有下标
	 * 方法分析：
	 * 	public static
	 * 	返回值
	 * 		没有限制条件，直接在方法中打印元素所在下标
	 * 		void
	 * 	方法名
	 * 		allIndexOf
	 * 	形式参数列表
	 * 		源数据数组，指定元素
	 * 		(int[] arr, int find)
	 * 方法声明：
	 * 	public static void allIndexOf(int[] arr, int find)
	 */
	/**
	 * 简单实现返回指定元素在数组中的所有下标
	 * 
	 * @param arr
	 * @param find
	 */
	public static void allIndexOf(int[] arr, int find) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println(i);
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("没有该值");
		}
	}
}
