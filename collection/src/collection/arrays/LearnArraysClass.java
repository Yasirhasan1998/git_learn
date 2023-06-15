package collection.arrays;

import java.util.ArrayList;

public class LearnArraysClass {

	public static void main(String[] args) {
         ArrayList<Integer> l=new ArrayList<Integer>();
         l.add(100);
         l.add(200);
         
         ArrayList<Integer> l2=new ArrayList<Integer>();
         l2.add(500);
         l2.add(700);
         
         l.addAll(l2);
         System.out.println(l);
         
	}

}
