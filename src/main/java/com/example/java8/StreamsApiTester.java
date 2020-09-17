package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApiTester {

	public static void main(String args[]) {
		
		// FILTER to whose length  is >8 
		List<String> li1 = Arrays.asList("prajakta, varsha, prathamesh");
		Long count = li1.stream().filter(s -> s.length()>8).count();
		System.out.println(count);
		
		//MAP to lowercase string
		List<String> filteredLi = li1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(filteredLi);
		
		//FLATMAP to return stream of values
		List<Integer> li2 = Arrays.asList(1, 2 ,3);

		List<Integer> li3 = Arrays.asList(4, 5 ,6);

		List<Integer> li4 = Arrays.asList(7, 8 ,9);
		
	   List<List<Integer>> testLi = new ArrayList<>();
	   testLi.add(li2);
	   testLi.add(li3);
	   testLi.add(li4);
	   
	   System.out.println("Without flatmap :" +testLi);
	   
	   //using flatmap
	   List<Integer> resultLi =  testLi.stream().flatMap(li -> li.stream()).collect(Collectors.toList());
	   System.out.println(resultLi);
	  
	   //Count Empty String
	   List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	   long countS = strings.stream().filter(s -> !s.isEmpty()).count();
	   System.out.println("Counts: "+countS);
	   
	   //Get Merged String
	   String mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
	   System.out.println("mergedString "+mergedString);	
	   
	   //get Squares of each distinct number
	   List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	   List<Integer> squareNumbers =  numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
	   System.out.println("sqaure numbers: "+squareNumbers);
	   
	   //Sort the String of array in descending order
	   List<String> descendingOrderList = strings.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	   System.out.println(descendingOrderList);
	   
	   //
	   IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).summaryStatistics();
	   System.out.println("highest Number: "+stats.getMax());
	   System.out.println("Average of number: "+stats.getAverage());
	   
	}
	
}
