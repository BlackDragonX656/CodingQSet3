package com.example;

public class DS3_4 {
	public int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
