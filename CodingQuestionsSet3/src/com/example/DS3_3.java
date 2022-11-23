package com.example;

public class DS3_3 {
	public boolean isPalindrome(String s) {
		char[] ch = s.toCharArray();
		String rs = "";
		for(char c: ch) {
			rs = c + rs;
		}
		if(s == rs) {
			return true;
		}
		return false;
	}
}
