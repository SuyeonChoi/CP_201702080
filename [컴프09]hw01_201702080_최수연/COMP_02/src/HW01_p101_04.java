import java.util.Scanner;

public class HW01_p101_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r;
		int h;
		double vol;

		double PI;
		PI = Math.PI;

		System.out.println("����� �ظ��� �������� �Է��Ͻÿ�:");
		r = input.nextInt();
		System.out.println("������� ���̸� �Է��Ͻÿ�.:");
		h = input.nextInt();
		vol = r * r * h * PI;
		System.out.println("������� ���Ǵ�" + vol + "�Դϴ�.");
	}

}
