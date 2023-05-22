package org.vishwajeet;
import java.util.*;
public class whiteisremove {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		 System.out.println("enter the String");
		 String name=S.nextLine();
		 
		 char ch[]=name.toCharArray();
		 String s="";
		 
		  for(int i=0;i<ch.length;i++)
		  {
			  if(ch[i]!=' ')
			  {
				  s=s+ch[i];
			  }
		}
		  System.out.println("white space remove then==:");
		  System.out.println(s);
		 char name1[]=s.toCharArray();
		 int end=name1.length-1;
		 int mid=name1.length/2;
		 int start=0;
		 
		 for(start=0;start<mid;start++)
		 {
			 char temp=name1[start];
			 name1[start]=name1[end];
			 name1[end]=temp;
			 end--;
		 }
		 System.out.println("reverse string is ==: ");
		 for(int i=0;i<name1.length;i++)
		 {
			System.out.print(name1[i]); 
		 }
		  
		  
	 
	}

}
