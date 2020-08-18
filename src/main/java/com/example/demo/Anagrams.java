package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Anagrams {
	public static void main(String args[]) {
		List<String> testLi = new ArrayList<>();
		testLi.add("code");	
		testLi.add("doec");
		testLi.add("formater");
		testLi.add("format");
		testLi.add("doce");
		int n1=0;
		int n2=0;

		for(int i=0; i<testLi.size(); i++) {
			n1 = testLi.get(i).length();
			for(int j=i+1; j<testLi.size(); j++) {
				n2= testLi.get(j).length();			
					if(areAnagram(testLi.get(i).toCharArray(), testLi.get(j).toCharArray(), n1, n2)) {
						testLi.remove(j);
					    j--;
					}				
			}
		}
		System.out.println(testLi);
	}

	private static boolean areAnagram(char[] cs1, char[] cs2, int n1, int n2) {
		if(cs1.length != cs2.length) {
			return false;
		}
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		for (int i = 0; i < n1; i++) {
			if (cs1[i] != cs2[i]) {
				return false;
			}
		}
		return true;

	}
}
