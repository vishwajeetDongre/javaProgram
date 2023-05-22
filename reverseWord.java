package org.vishwajeet;
import java.util.*;
public class reverseWord {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		 System.out.println("enter the String");
		 String name=S.nextLine();
		 char ch[]=name.toCharArray();
		 int start=0;
		 int end=ch.length-1;
		 int mid= ch.length/2;
		 for(start=0;start<mid;start++)
		 {
			 char temp=ch[start];
			 ch[start]=ch[end];
			 ch[end]=temp;
			 end--;
		 }
		 for(int i=0;i<ch.length;i++)
		 {
			System.out.print(ch[i]); 
		 }

	}

}
