import java.util.Scanner;

public class HW02_p101_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int height;
		double a;
		int feet;
		double inch;
		
		System.out.println("키를 입력하시오.:");
		height = input.nextInt();

		// 피트 구하기
		a = height / 2.54;
		feet = (int) a / 12;
		
		// 인치구하기
		inch = a - feet * 12;

		System.out.println(height + "cm는" + feet + "피트" + inch + "인치입니다.");
	}
}