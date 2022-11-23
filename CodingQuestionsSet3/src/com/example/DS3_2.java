package com.example;

public class DS3_2 {

	public String reverseString(String s) {
		char[] ch = s.toCharArray();
		String rs = "";
		for(char c: ch) {
			rs = c + rs;
		}
		return rs;
	}
}
