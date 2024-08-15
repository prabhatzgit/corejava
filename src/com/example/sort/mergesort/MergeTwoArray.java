package com.example.sort.mergesort;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];

		int[] array = mergeArraysNaiveApproach(arr1, arr2, arr3);
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(" " + array[i]);
		}
	}

	public static int[] mergeArraysNaiveApproach(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		Arrays.sort(arr3);
		return arr3;
	}

	// without using sort method
	public static int[] mergeTwoArrays(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else
				arr3[k++] = arr2[j++];
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}

}
