package com.example;

public class DS3_8 {
	public int binarySearch(int[] arr, int target) {
		int i = arr.length/2;
		while(arr[i] != target) {
			if(arr[i] > target) {
				i = i/2;
			}else {
				i = i + i/2;
			}
		}
		return i;
	}
}
