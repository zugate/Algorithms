package problems;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSequence {

	static int lis(int ar[]) {
		int [] lost=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			lost[i]=1;
		}
		for(int i=1;i<ar.length;i++) {
			for(int j=0;j<i;j++) {
				if(ar[i]>ar[j]&&lost[i]<(lost[j]+1)) {
					lost[i]=lost[j]+1;
				}
			}
		}
		int max=-9999;
		for(int j=0;j<ar.length;j++)
			if(lost[j]>max) {
				max=lost[j];
			}
		return max;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();  
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int result=lis(ar);
		System.out.println("Longest subsequence for "+Arrays.toString(ar)+" "+result);
	}

}
