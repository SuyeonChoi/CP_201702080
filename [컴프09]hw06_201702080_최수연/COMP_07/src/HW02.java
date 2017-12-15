import java.util.Scanner;

public class HW02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account myaccount = new account();
		CreateAccount(myaccount);
		Login(myaccount);
	}

	private static void CreateAccount(account account) {
		Scanner input = new Scanner(System.in);
		System.out.println("<계정생성>");
		System.out.println("아이디를 입력하시오.:");
		String makeID = input.next();
		account.setID(makeID);
		System.out.println("비밀번호를 입력하시오.:");
		String makePW = input.next();
		account.setPW(makePW);
	}
	private static void Login(account account){
		Scanner input = new Scanner(System.in);
		System.out.println("<로그인>");	
		System.out.println("ID:");
			String ID = input.next();
			System.out.println("PW:");
			String PW = input.next();
			if (account.getID().equals(ID) && account.getPW().equals(PW)){
				System.out.println("로그인 성공입니다.");
			}
			else 
				System.out.println("로그인에 실패하였습니다.");
		}
}
