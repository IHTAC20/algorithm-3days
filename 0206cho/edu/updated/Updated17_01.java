/*
 * java에서의 정렬 (sorting in java) -  17-01
 */
package edu.updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Updated17_01 {
	/*
	 # 기본 타입 데이터의 정렬
	 - Arrays 클래스가 primitive 타입 데이터를 위한 정렬 메서드를 제공
	 	int[] data = ne int [capacity];
	 	
	 	// data[0]에서 data[capacity-1]까지 데이터가 꽉 차있는 경우에는 다음과 같이 정렬
	 	Arrays.sort(data);
	 	
	 	// 배열이 꽉차있지 않고 data[0]에서 data[size-1]까지 size개의 데이터만 있다면 다음과 같이 함
	 	Arrays.sort(data, 0, size);
	 	
	 - int 이외의 다른 primitive 타입 데이터 (double, char 등)에 대해서도 제공
	 */
	 
	public static void main(String[] args) {
		// # 객체의 정렬 : 문자열
		String[] fruits = new String[] {"Pineapple", "Apple", "Orange", "Banana"};
		 Arrays.sort(fruits);
		 for(String name: fruits)
			 System.out.println(name);
		 
		 // primitive 타입 데이터와 마찬가지로 Arrays.sort 메서드로 정렬됨
		 /*
		   	Apple
			Banana
			Orange
			Pineapple
		  */
		 
		 
		 // # ArrayList 정렬 : 문자열
		 List<String> fruits2 = new ArrayList<String>();
		 fruits2.add("Pineapple");
		 fruits2.add("Apple");
		 fruits2.add("Orange");
		 fruits2.add("Banana");
		 
		 Collections.sort(fruits2);
		 for(String name: fruits)
			 System.out.println(name);
		 
		// Collections.sort 메서드로 정렬됨
		 /*
		   	Apple
			Banana
			Orange
			Pineapple
		  */
	}
}