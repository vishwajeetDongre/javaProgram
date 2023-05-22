package org.vishwajeet;
import java.util.*;
public class Swapsecondandthirdword {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name= S.nextLine();
		String name1[]=name.split("");
		for(int i=1;i<name1.length-1;i++)
		{
			//System.out.println(name1[i]);
			String temp=name1[1];
			name1[1]=name1[2];
			name1[2]=temp;
		}
		
		for(int i=0;i<name1.length;i++)
		{
			System.out.print(name1[i]);
		}

	}

}
