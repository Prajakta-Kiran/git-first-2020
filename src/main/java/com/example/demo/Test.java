package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Test {

	public static void main(String args[]) {
		System.out.println("in main method");
		int[] a = {1,2};
		solution("Hello");
		System.err.println(solution(a));
	}
	
	public static int solution(int[] A) {
		int missingNum = 0;
         List<Integer> li = new ArrayList<Integer>();
         for(int i : A) {
        	 li.add(i);
         }
         Collections.sort(li);
         int diff = 0;
         for(int i=0; i<li.size(); i++) {
        	 
        	diff = li.get(i+1) - li.get(i);
        	if(diff!=0 && diff !=1) {
        	   missingNum = li.get(i) + 1;
        	  break;
        	}
        	
         }
         
		return missingNum;
         
	}
	
    static String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {

            occurrences[ch ]++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }
	/*
	 * public static void checkException () { try {
	 * System.out.println("in try block"); throw new NullPointerException();
	 * 
	 * } catch(Exception e) { System.out.println("in catch block"); throw e; }
	 * finally { System.out.println("in finally block"); } }
	 */}
