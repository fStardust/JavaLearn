package com.fs.a_array;

import java.util.Arrays;

public class DemoArrays {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		System.out.println(Arrays.toString(arr));
		
		// �������� Ĭ�ϵ���
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*
		 * ���ַ�����
		 * 		1. ���ݱ���������������²���֤��ѯ������
		 * 		2. ����δ�ҵ������ظ���
		 * 		3. �����ͬ���ݵ�����£� ����֤�ҵ������ǵڼ�������
		 */
		int index = Arrays.binarySearch(arr, -5);
		System.out.println(index);
	}
}

