package problems;

public class TowerOfHanoi {

	static int count=0;
	static void hanoiBaba(int n,char from,char to,char aux) {
		
		if(n==1)
		{
			System.out.println("Move disk 1 from "+from+" to "+to); count++;
			return;
		}
		
		hanoiBaba(n-1,from,aux,to);
		System.out.println("Move disk "+n+" from "+from+" to "+to); count++;
		hanoiBaba(n-1,aux,to,from);
	}
	
	public static void main(String...asd) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number of disks");
		int n=sc.nextInt();
		char from='A',to='C',aux='B';
		
		hanoiBaba(n,from,to,aux);
		System.out.println(count);
		sc.close();
	}

}
