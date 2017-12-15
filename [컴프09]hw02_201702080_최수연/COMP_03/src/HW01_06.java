import java.util.Scanner;
public class HW01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1;//500원 개수
		int num2;//100원
		int num3;//50원
		int sum;
		
		System.out.println("500원짜리의 개수를 입력하시오.:");
		num1 = input.nextInt();
		System.out.println("100원짜리의 개수를 입력하시오.:");
		num2 = input.nextInt();
		System.out.println("50원짜리의 개수를 입력하시오.:");
		num3 = input.nextInt();
		
		sum = 500*num1 + 100*num2 + 50 *num3;
		System.out.println("저금통에 들어있는 돈의 액수는"+sum+"원입니다.");
	}

} 
