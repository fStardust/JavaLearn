package com.fs.a_array;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 0};
		
		add(array, 5, 20);
		
		// ��ӡ����Ԫ�ص�ֵ
		System.out.println(Arrays.toString(array));
	}
	
	/*
	����һ�����飬�����е�Ԫ��Ϊ
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 0};
		Ҫ��
			1. 0����ЧԪ�أ���ռλʹ��
			2. ��ǰ�����С���ЧԪ�ء�����Ϊ9
		����
			�ڸ������е�ָ���±�λ�÷���ָ��Ԫ��
	˼����
		�������±�Ϊn��λ�ò���Ԫ�أ����±�n֮���Ԫ�����������ƶ�
		�����һ����ЧԪ�ؿ�ʼ��󸲸� --> arr[i] = arr[i-1]
		���ø�ֵ����ֹ��Ч���ݱ�����
	���ص㡿
		1. �����ݣ���Ч����˼��
		2. ���ݵ��ƶ����̣��ּӹ���ϸ��ĥ����
		3. ʱ����������
		
	��������:
		pubilc static
		����ֵ���ͣ�
			void ���ã������Ƽ�
			boolean ���� ��ʾ����ɹ����
			int ���� ������ֵ�����Լ�����鷳
		������:
			add
		��ʽ�����б���
			1. ��Ҫ�������ݵ�����
			2. ָ���������ݵ��±�λ��
			3. ָ�����������
			(int[] arr, int index, int insert)
	����������
		public static boolean add(int[] arr, int index, int insert)
	*/
	/**
	 * ��ָ���������У�ָ��λ�ò���ָ��Ԫ��
	 * 
	 * @param arr ָ����int��������
	 * @param index ָ�����±�λ�ã������ں��������䷶Χ��
	 * @param insert ָ�������Ԫ�أ�int����
	 * @return ���ӳɹ�����true�����򷵻�false
	 */
	public static boolean add(int[] arr, int index, int insert) {
		// �����Ϸ����ж�
		if (index < 0 || index > arr.length - 1) {
			System.out.println("Input Parameter is Invaliad");
			// ��������ʧ��
			return false;
		}
		
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[index] = insert;
		
		return true;
	}
}