import java.util.Scanner;

public class HW04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("정수를 입력하시오.:");
		int a = input.nextInt();
		System.out.println("정수를 입력하시오.:");
		int b = input.nextInt();
		System.out.println("정수를 입력하시오.:");
		int c = input.nextInt();

		if (a > b && b > c) {
			System.out.println("정렬된 숫자:" + c + " " + b + " " + a);
		} else if (a > b && c > b && a > c) {
			System.out.println("정렬된 숫자:" + b + " " + c + " " + a);
		} else if (b > a && a > c) {
			System.out.println("정렬된 숫자:" + c + " " + a + " " + b);
		} else if (b > a && c > a && b > c) {
			System.out.println("정렬된 숫자:" + a + " " + c + " " + b);
		} else if (a > b && c > a) {
			System.out.println("정렬된 숫자:" + b + " " + a + " " + c);
		} else
			System.out.println("정렬된 숫자:" + a + " " + b + " " + c);
	}
}
