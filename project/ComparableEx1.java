 package com.capgemini.collections2;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableEx1 {
	public static void main(String[] args) {
		Product p1 = new Product(101 , "headphones" , 4.5f ,5000 );
		Product p2 = new Product(102 , "laptop" , 4.1f ,50000 );
		Product p3 = new Product(103 , "earpods" , 4.2f ,15000 );
		Product p4 = new Product(104 , "iphone" , 4.3f ,100000 );
		Product p5 = new Product(105 , "alexa" , 4.5f ,3000 );
		
		Product p4 = new Product(104 , "iphone" , 4.3f ,100000 );
		Product p5 = new Product(105 , "alexa" , 4.5f ,3000 );
		
		ArrayList<Product> prodList = new ArrayList<Product>();
		//adding products to the array
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		
		System.out.println(",,,,,,,,,,before sorting ............");
		for ( Product p : prodList) {
			System.out.println(p);
		}
		
		System.out.println("..................");
		//not only oteration by use of \n in toString()  also we get line by line
		System.out.println(prodList);
		
		Collections.sort(prodList);
		
		System.out.println(".......................after sorting ..............");
		for ( Product p : prodList) {
			System.out.println(p);
		}								// prices are ascending order
		
		System.out.println(".....................by ratings.................");
			
		Collections.sort(prodList,new CompareByRating());
		for ( Product pp : prodList) {
			System.out.println(pp);
		}
		
		System.out.println("..............by names........................");
		
		Collections.sort(prodList , new CompareByProductName());
		for ( Product pp : prodList) {
			System.out.println(pp);
		
		}
	
	}
}

