package org.vishwajeet;
import java.util.*;
public class Conditionbase {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		 System.out.println("enter the String");
		 String name=S.nextLine();
		 char ch[]=name.toCharArray();
		 String a=" ";
		 String b=" ";
		 String c=" ";
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]>='0' && ch[i]<='9')
			 {
				 a=a+ch[i];
				 
			 }
			 else if(ch[i]>='a' && ch[i]<='z'||ch[i]>='A' && ch[i]<='Z')
			 {
				 b=b+ch[i];
			 }else
			 {
				 c=c+ch[i]; 
			 }
			
		 }
		 System.out.println("number is = "+a);
		 System.out.println("alphate is = "+b);
		 System.out.println("spicial symbols = "+c); 
	}

}
