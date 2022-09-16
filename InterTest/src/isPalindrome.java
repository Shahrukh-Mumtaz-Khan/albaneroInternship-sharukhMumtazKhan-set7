
public class isPalindrome {

	public static void main(String[] args) {
		String a="RADAR";
		String b="";
		int l;
		l=a.length();
		for (int i=l-1;i>=0;i--) {
			b=b+a.charAt(i);
			if(a.equals(b)) {
				System.out.print(" Yes");
			}
		}
	}
}
