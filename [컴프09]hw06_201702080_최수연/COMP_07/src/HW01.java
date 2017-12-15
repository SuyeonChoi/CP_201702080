import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;

		System.out.println("문자열을 입력하시오.:");
		str = input.nextLine();

		System.out.println(reverse(str));
	}

	public static String reverse(String s) {
		String rv = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rv = rv + s.charAt(i);

		}
		return rv;
	}

}
