import java.util.Scanner;

public class HW_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int mile;
		double km;

		System.out.println("마일을 입력하시오:");
		mile = input.nextInt();
		km = 1.609 * mile;
		System.out.println(mile + "마일은" + km + "킬로미터입니다.");

	}

}
