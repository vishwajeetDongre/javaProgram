package org.vishwajeet;
import java.util.*;
public class removeChareter {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
        System.out.println("enter the Sring");
       String name=S.nextLine();
       char ch[]=name.toCharArray();
       System.out.println("enter the charater you want to remove ");
       char s=S.nextLine().charAt(0);
       for(int i=0;i<ch.length;i++)
       {
    	   if(ch[i]==s)
    	   {
    		   continue;
    	   }
    	   else
    	   {
    		   System.out.print(ch[i]);
    	   }
       }
	}

}
