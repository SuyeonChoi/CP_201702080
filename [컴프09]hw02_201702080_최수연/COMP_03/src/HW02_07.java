import java.util.Scanner;
public class HW02_07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int p;//입력받을 평
		double pm;//평방미터
		
		System.out.println("몇 평입니까?");
		p = input.nextInt();
		pm = p * 3.3058;
		System.out.println("입력한"+p+"평은"+pm+"평방미터 입니다.");

	}

}
