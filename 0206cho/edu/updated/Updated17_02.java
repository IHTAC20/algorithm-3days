/*
 * java에서의 정렬 (sorting in java) -  17-02
 */
package edu.updated;

import java.util.Arrays;
import java.util.Comparator;

public class Updated17_02 implements Comparable<Updated17_02>{
	// # 객체의 정렬 : 사용자 정의 객체
	public String name;
	public int quantity;
	public Updated17_02(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	// # Comparator
	// Comparator클래스를 extends하며 compare메서드를 overriding하는 새로운 이름 없는 클래스를 정의한 후 그 클래스의 객체를 하나 생성
	public static Comparator<Updated17_02> nameComparator = new Comparator<Updated17_02>(){
		public int compare(Updated17_02 fruit1, Updated17_02 fruit2){
			return fruit1.name.compareTo(fruit2.name);
		}
	};
	
	public static Comparator<Updated17_02> quantityComparator = new Comparator<Updated17_02>(){
		public int compare(Updated17_02 fruit1, Updated17_02 fruit2){
			return fruit1.quantity - fruit2.quantity;
		}
	};
	
	 
	public static void main(String[] args) {
		Updated17_02[] fruits = new Updated17_02[4];
		fruits[0] = new Updated17_02("Pineapple", 70);
		fruits[1] = new Updated17_02("Apple", 100);
		fruits[2] = new Updated17_02("Orange", 80);
		fruits[3] = new Updated17_02("Banana", 90);
		
		Arrays.sort(fruits);
		
		// Comparator 사용할 경우
		Arrays.sort(fruits, Updated17_02.nameComparator); // static member로 안 빼면 Updated17_02안붙여도 됨
		// or
		Arrays.sort(fruits, Updated17_02.quantityComparator);
	}


	@Override
	public int compareTo(Updated17_02 other) {
		// 이름 순으로 정렬
		return name.compareTo(other.name);
		
		// 재고 수량으로 정렬
		//return quantity - other.quantity;
		
		// 하나의 객체 타입에 대해서 2가지 이상의 기준으로 정렬을 지원하려면 Comparator를 사용
	}
}