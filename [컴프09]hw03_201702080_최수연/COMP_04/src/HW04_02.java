import java.util.Scanner;

public class HW04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("키를 입력하세요:");
		int height = input.nextInt();
		System.out.println("체중을 입력하세요:");
		double wght = input.nextInt();
		
		double weight = (height - 100) * 0.9;

		if (weight * 0.9 < wght && wght< weight * 1.1)
			System.out.println("정상입니다.");
		else if (wght >= weight * 1.1)
			System.out.println("과체중입니다!");
		else
			System.out.println("저체중입니다!");
	}

}
