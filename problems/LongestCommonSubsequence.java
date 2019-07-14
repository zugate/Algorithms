package problems;
//gxtxayb
//aggtab

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	static int max(int n1,int n2) {
		return (n1>n2)?n1:n2;
	}
	static int[][] LCS(String s1,String s2){
		
		int[][] lcs=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length()+1;i++)
		{
			lcs[i][0]=0;
		}
		for(int j=0;j<s2.length()+1;j++)
		{
			lcs[0][j]=0;
		}
		for(int i=1;i<s1.length()+1;i++)
			for(int j=1;j<s2.length()+1;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1))
					{ lcs[i][j]=lcs[i-1][j-1]+1;}
				else {
					lcs[i][j]=max(lcs[i][j-1],lcs[i-1][j]);
				}
			}
		return lcs;
	}
	static String lcsLong(String s,String s2) {
		int[][] lcs=new int[s.length()][s2.length()];
		lcs=LCS(s,s2);
		System.out.println("Maximum length of the common subsequence is "+lcs[s.length()][s2.length()]);
		
		
		String result=new String("");
//		int count=0;
		
		int i=s.length(),j=s2.length();
		while(lcs[i][j]!=0)
		{
			if(lcs[i][j]!=max(lcs[i][j-1],lcs[i-1][j])) {
//				count++;
				result+=s.charAt(i-1);
				i--;j--;
			}
			else if(lcs[i][j-1]==lcs[i][j]){
				j--;
			}
			else i--;
		}
		return result;
	}
	public static void main(String...asd) {
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		String s2=sc.next();
		sc.close();
		//int[][] lcs=new int[s1.length()+1][s2.length()+1];
		String longest=lcsLong(s,s2);
		StringBuffer sb=new StringBuffer(longest);
		System.out.println("Longest common subsequence is "+sb.reverse());
	}
}
