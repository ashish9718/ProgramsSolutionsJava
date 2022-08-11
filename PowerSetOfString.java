
public class PowerSetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerSet("abc",0,"");
	}
	
	static void powerSet(String s, int i, String c) {
		if(i==s.length()) {
			System.out.print(c +" ");
			return;
		}
		powerSet(s,i+1,c);
		powerSet(s,i+1,c+s.charAt(i));
	}

}
