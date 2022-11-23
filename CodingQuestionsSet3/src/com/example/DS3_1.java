package com.example;

public class DS3_1 {
	public static void findAllSubstrings(String s) {
		for(int i = 0; i < s.length(); i++){
	        char[] temp = new char[s.length() - i + 1];
	        int index = 0;
	         
	        for(int j = i; j < s.length(); j++)
	        {
	            temp[index++] = s.charAt(j);
	            temp[index] = '\0';
	            System.out.println(temp);
	        }
	    }
	}
	
	public static void main(String[] args) {
		findAllSubstrings("Hello");
	}
}
