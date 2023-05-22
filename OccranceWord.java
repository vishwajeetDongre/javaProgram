package org.vishwajeet;
import java.util.*;
public class OccranceWord {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name=S.nextLine();
		String name1[]=name.split(" ");
		int count=1;
		for(int i=0;i<name1.length-1;i++)
		{
			if(name1[i].equals(name1[i+1]))
			{
				count++;
			}else
			{
				System.out.println(name1[i]+"========>"+count);
				count=1;
			}
			if(name1[i].equals(name1[i+1]))
			{
				System.out.println(name1[i]+"========>"+count);
			}
		}
			
		

	}

}
