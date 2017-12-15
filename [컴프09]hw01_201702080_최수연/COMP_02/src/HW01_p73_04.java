import java.util.Scanner;

public class HW01_p73_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cel;
		double far;

		System.out.println("화씨 온도를 입력하세요.:");
		far = input.nextDouble();
		cel = (far - 32) * 5 / 9;
		System.out.println("화씨온도 " + far + "의 섭씨온도는 " + cel + "입니다.");

	}

}
