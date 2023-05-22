package org.vishwajeet;
import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name=S.nextLine();
		String name1[]=name.split(" ");
		String s="";
		for(int i=name1.length-1;i>=0;i--)
		{
			s=s+name1[i]+" ";
		}
		System.out.println(s);
		

	}

}
