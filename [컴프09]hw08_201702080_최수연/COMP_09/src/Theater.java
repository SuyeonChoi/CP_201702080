import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		while (true) {
			System.out.println("�¼��� �����Ͻðڽ��ϱ�?(1�Ǵ� 0)");
			int i = input.nextInt();
			switch (i) {
			case 0:
				break;
			case 1:
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("-------------------------------");
				getSeatNumber(numbers);
				System.out.println("-------------------------------");
				for (int j = 0; j < numbers.length; j++) {
					System.out.print(numbers[j] + " ");
				}
				System.out.println();
				System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
				int m = input.nextInt();
				for (int l = 0; l < numbers.length; l++) {
					if (l == (m-1)) {
						if(numbers[l] ==1){System.out.println("�̹� ����� �ڸ��Դϴ�!");}
						else {numbers[l] = 1;
						System.out.println("����Ǿ����ϴ�.");}
					} else
						numbers[l] = 0;
				}
				break;
			default:
				System.out.println("1�� 0�߿��� �Է��ϼ���!");
				break;
			}
			if (i == 0)
				break;
		}

	}

	// �迭 ��ȣ.�¼���ȣ
	public static void getSeatNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
	}

}
