import java.util.Scanner;
public class HW01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1;//500�� ����
		int num2;//100��
		int num3;//50��
		int sum;
		
		System.out.println("500��¥���� ������ �Է��Ͻÿ�.:");
		num1 = input.nextInt();
		System.out.println("100��¥���� ������ �Է��Ͻÿ�.:");
		num2 = input.nextInt();
		System.out.println("50��¥���� ������ �Է��Ͻÿ�.:");
		num3 = input.nextInt();
		
		sum = 500*num1 + 100*num2 + 50 *num3;
		System.out.println("�����뿡 ����ִ� ���� �׼���"+sum+"���Դϴ�.");
	}

} 
