import java.util.Scanner;

public class HW04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ���:");
		int height = input.nextInt();
		System.out.println("ü���� �Է��ϼ���:");
		double wght = input.nextInt();
		
		double weight = (height - 100) * 0.9;

		if (weight * 0.9 < wght && wght< weight * 1.1)
			System.out.println("�����Դϴ�.");
		else if (wght >= weight * 1.1)
			System.out.println("��ü���Դϴ�!");
		else
			System.out.println("��ü���Դϴ�!");
	}

}
