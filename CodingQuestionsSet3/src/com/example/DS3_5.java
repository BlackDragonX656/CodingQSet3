package com.example;

public class DS3_5 {
	public int[][] multiply(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				c[i][j] = 0;
				for(int k=0; k < a.length;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}
