import java.util.Scanner;

public class HW04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ�.:");
		int a = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�.:");
		int b = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�.:");
		int c = input.nextInt();

		if (a > b && b > c) {
			System.out.println("���ĵ� ����:" + c + " " + b + " " + a);
		} else if (a > b && c > b && a > c) {
			System.out.println("���ĵ� ����:" + b + " " + c + " " + a);
		} else if (b > a && a > c) {
			System.out.println("���ĵ� ����:" + c + " " + a + " " + b);
		} else if (b > a && c > a && b > c) {
			System.out.println("���ĵ� ����:" + a + " " + c + " " + b);
		} else if (a > b && c > a) {
			System.out.println("���ĵ� ����:" + b + " " + a + " " + c);
		} else
			System.out.println("���ĵ� ����:" + a + " " + b + " " + c);
	}
}
