//Requirement: 0,1,1,2,3,5,8,13... print his series 
package problems;

import java.util.*;
public class fibonacci {

	static int fib(int n)
	{
		if(n==0||n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of terms to print");
		int n=sc.nextInt();
		String fibo="";
		for(int i=0;i<n;i++) {
				fibo=fibo+fib(i)+",";
		}
				
		StringBuffer sb=new StringBuffer(fibo);
		System.out.println(sb.substring(0,sb.length()-1));
	}
}

