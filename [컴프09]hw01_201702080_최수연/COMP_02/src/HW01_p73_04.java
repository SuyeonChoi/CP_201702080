import java.util.Scanner;

public class HW01_p73_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cel;
		double far;

		System.out.println("ȭ�� �µ��� �Է��ϼ���.:");
		far = input.nextDouble();
		cel = (far - 32) * 5 / 9;
		System.out.println("ȭ���µ� " + far + "�� �����µ��� " + cel + "�Դϴ�.");

	}

}
