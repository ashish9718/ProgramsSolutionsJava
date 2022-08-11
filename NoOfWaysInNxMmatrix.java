
public class NoOfWaysInNxMmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ways(2, 2));
	}

	static int ways(int n, int m) {
		if (n == 1 || m == 1) {
			return 1;
		}
		return ways(n - 1, m) + ways(n, m - 1);
	}

}
