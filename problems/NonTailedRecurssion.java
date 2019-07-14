package problems;

/**
 * @author zugate
 *
 */
public class NonTailedRecurssion {

	static void printFor(int n)
	{
		if(n<1)
			return;
		System.out.print(n+" ");
		printFor(n-1);
		System.out.println(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFor(3);
	}

}
