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

		System.out.println("원기둥 밑면의 반지름을 입력하시오:");
		r = input.nextInt();
		System.out.println("원기둥의 높이를 입력하시오.:");
		h = input.nextInt();
		vol = r * r * h * PI;
		System.out.println("원기둥의 부피는" + vol + "입니다.");
	}

}
