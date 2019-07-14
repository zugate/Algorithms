package problems;

import java.util.Scanner;

public class TabulationFibo {

	static int fib(int n) {
		int[] f=new int[n+1];
		f[0]=0;
		if(n!=0)f[1]=1;
		for(int i=2;i<=n;i++) {
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+",");
		}
	}

}
