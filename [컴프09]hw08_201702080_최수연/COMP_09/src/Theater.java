import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		while (true) {
			System.out.println("좌석을 예약하시겠습니까?(1또는 0)");
			int i = input.nextInt();
			switch (i) {
			case 0:
				break;
			case 1:
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				System.out.println("-------------------------------");
				getSeatNumber(numbers);
				System.out.println("-------------------------------");
				for (int j = 0; j < numbers.length; j++) {
					System.out.print(numbers[j] + " ");
				}
				System.out.println();
				System.out.println("몇번째 좌석을 예약하시겠습니까?");
				int m = input.nextInt();
				for (int l = 0; l < numbers.length; l++) {
					if (l == (m-1)) {
						if(numbers[l] ==1){System.out.println("이미 예약된 자리입니다!");}
						else {numbers[l] = 1;
						System.out.println("예약되었습니다.");}
					} else
						numbers[l] = 0;
				}
				break;
			default:
				System.out.println("1과 0중에만 입력하세요!");
				break;
			}
			if (i == 0)
				break;
		}

	}

	// 배열 번호.좌석번호
	public static void getSeatNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
	}

}
