import java.util.Scanner;

public class HW_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int mile;
		double km;

		System.out.println("������ �Է��Ͻÿ�:");
		mile = input.nextInt();
		km = 1.609 * mile;
		System.out.println(mile + "������" + km + "ų�ι����Դϴ�.");

	}

}
