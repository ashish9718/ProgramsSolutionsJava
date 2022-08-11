
public class Factorial {

	public static void main(String[] args) {


		System.out.println(getfactorial(5));
		System.out.println(getfactorialUsingRecursion(5));
	}

	static int getfactorial(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
	
	static int getfactorialUsingRecursion(int n) {
		if(n==1) {
			return 1;
		}
	
		return n * getfactorialUsingRecursion(n-1);
	}
}
