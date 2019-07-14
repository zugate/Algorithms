package problems;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int test=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<test;i++)
				{
				    String s2=sc.nextLine();
				    String[] s=s2.split(".");
				    System.out.println(s.length);
				    for(int j=s.length-1;j>=0;j--)
				     System.out.println(s[j]+".");
		        }
				sc.close();
	}
}
