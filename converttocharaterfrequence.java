package org.vishwajeet;
import java.util.*;
public class converttocharaterfrequence {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the string");
		String name=S.nextLine();
		char ch[]=name.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					i++;
				}else
				{
					System.out.println(ch[i]+"========>"+count);
					count=1;
					i++;
				}
			}
		}

	}

}
