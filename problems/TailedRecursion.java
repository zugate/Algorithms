package problems;

public class TailedRecursion {

	static int factTR(int n,int a) {
		if(n==0)
			return a;
		return factTR(n-1,n*a);
	}
	//wrapper over factTR
	static int fact(int n) {
		return factTR(n,1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
