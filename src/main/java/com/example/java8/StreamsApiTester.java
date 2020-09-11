package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApiTester {

	public static void main(String args[]) {
		// filter to whose length  is >8 
		List<String> li1 = Arrays.asList("prajakta, varsha, prathamesh");
		Long count = li1.stream().filter(s -> s.length()>8).count();
		System.out.println(count);
		
		//map to lowercase string
		List<String> filteredLi = li1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(filteredLi);
		
		//flatmap to return stream of values
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
	  
	}
}
