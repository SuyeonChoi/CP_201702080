import java.util.Scanner;

public class HW02_p101_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int height;
		double a;
		int feet;
		double inch;
		
		System.out.println("Ű�� �Է��Ͻÿ�.:");
		height = input.nextInt();

		// ��Ʈ ���ϱ�
		a = height / 2.54;
		feet = (int) a / 12;
		
		// ��ġ���ϱ�
		inch = a - feet * 12;

		System.out.println(height + "cm��" + feet + "��Ʈ" + inch + "��ġ�Դϴ�.");
	}
}