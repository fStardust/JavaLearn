package com.fs.a_array;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		remove(array, 3);
		
		System.out.println(Arrays.toString(array));
	}
	
	/*
	����һ�����飬�����е�Ԫ��Ϊ
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		Ҫ��:
			1. 0����ЧԪ�أ���ռλʹ��
		����:
			�ڵ�ǰ������ɾ��ָ���±��Ԫ��
		����:
			ָ���±�5
			��� {1, 3, 5, 7, 9, 13, 15, 17, 19, 0} 
			0ռλ������
	˼����
		���±�Ϊn��Ԫ�ش��������Ƴ����±�n֮���Ԫ�����������ƶ�
		��n��һ����ЧԪ�ؿ�ʼ��ǰ���� --> arr[i] = arr[i+1]
		ǰ�ø�ֵ�����������ռλԪ��--0
	����������
		public static
		����ֵ����:
			boolean
		��������
			remove
		��ʽ�����б�:
			1. ɾ�����������
			2. ָ��ɾ�����ݵ��±�λ��
	����������
		public static boolean remove(int[] arr, int index)
	*/
	/**
	 * ɾ��������ָ���±�Ԫ�ص�����
	 * @param arr Դ�������飬int����
	 * @param index ָ��ɾ�����±�λ��
	 * @return ɾ�������ɹ�����true ʧ�ܷ���false
	 */
	public static boolean remove(int[] arr, int index)  {
		// �����Ϸ����ж�
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