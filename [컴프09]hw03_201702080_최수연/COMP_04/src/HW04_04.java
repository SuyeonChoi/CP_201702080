
public class HW04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 5 7 9 7 5 3 1
		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * (i + 1) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 5; i > 0; i--) {

			for (int j = 0; j <= n - i+1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * (i + 1) - 5; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
