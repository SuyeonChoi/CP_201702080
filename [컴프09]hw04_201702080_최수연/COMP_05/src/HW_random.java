import java.util.Random;

public class HW_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(System.currentTimeMillis());

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				num1 = rand.nextInt(45) + 1;
				break;
			case 1:
				num2 = rand.nextInt(45) + 1;
				if (num2 == num1) {
					num2 = rand.nextInt(45) + 1;
				}
				break;
			case 2:
				num3 = rand.nextInt(45) + 1;
				if (num3 == num1 || num3 == num2) {
					num3 = rand.nextInt(45) + 1;
				}
				break;
			case 3:
				num4 = rand.nextInt(45) + 1;
				if (num4 == num1 || num4 == num2 || num4 == num3) {
					num4 = rand.nextInt(45) + 1;
				}
				break;
			case 4:
				num5 = rand.nextInt(45) + 1;
				if (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {
					num5 = rand.nextInt(45) + 1;
				}
				break;
			case 5:
				num6 = rand.nextInt(45) + 1;
				if (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4) {
					num6 = rand.nextInt(45) + 1;
				}
				break;

			}

		}
		System.out.println("<�ζ� ���� ���α׷�>");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

	}
}
