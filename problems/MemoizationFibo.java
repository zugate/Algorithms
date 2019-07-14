package problems;

import java.util.Arrays;
import java.util.Scanner;


public class MemoizationFibo {

	public static int max=40;
	public static int[] lookup=new int[max];
	public static void initalize(int n) {
		int i=0;
		for(i=0;i<n;i++) {
			MemoizationFibo.lookup[i]=-1;
		}
	}
	 static int fib(int n) {
		 if(MemoizationFibo.lookup[n]==-1)
		 {
			 if(n<=1)
				 MemoizationFibo.lookup[n]=n;
			 else
				 MemoizationFibo.lookup[n]=fib(n-1)+fib(n-2);
		 }
		 
			 return MemoizationFibo.lookup[n];
		 
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MemoizationFibo.initalize(n);
		for(int i=0;i<n;i++)
		{
			MemoizationFibo.lookup[i]=fib(i);
		}
		
		for(int i=0;i<n;i++)
			System.out.print(MemoizationFibo.lookup[i]+",");
	}

}
