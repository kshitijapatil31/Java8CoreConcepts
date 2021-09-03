package com.bridelabz.mathoperations;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Iterator;

public class NumberPlayList {

	public static void main(String[] args) {
		List<Integer> myNuberList=new ArrayList <Integer>();
	for(int i=0;i<5;i++)
		myNuberList.add(i);
	
	
	Iterator<Integer>it=myNuberList.iterator();
	while(it.hasNext()) {
		Integer i=it.next();
		System.out.println(i);
	}
	//2
	class MyConsumer implements Consumer<Integer>{
		
	@Override
		public void accept(Integer t) {
			System.out.println(t);
			
		}
		
	}
	
	       MyConsumer action=new MyConsumer();
			myNuberList.forEach(action);
			//3
			myNuberList.forEach(new Consumer<Integer>() {
				public void accept(Integer t) {
					System.out.println(t);
					
				}	
			});
			
			//4
			Consumer <Integer>myListAction= n -> {
				System.out.println(n);
			};
			myNuberList.forEach(myListAction);
			
			//5
			myNuberList.forEach(n -> {
				System.out.println(n);
			});
			
			
			
			
			
	}

}
