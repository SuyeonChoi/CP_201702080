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
		System.out.println("<��������>");
		System.out.println("���̵� �Է��Ͻÿ�.:");
		String makeID = input.next();
		account.setID(makeID);
		System.out.println("��й�ȣ�� �Է��Ͻÿ�.:");
		String makePW = input.next();
		account.setPW(makePW);
	}
	private static void Login(account account){
		Scanner input = new Scanner(System.in);
		System.out.println("<�α���>");	
		System.out.println("ID:");
			String ID = input.next();
			System.out.println("PW:");
			String PW = input.next();
			if (account.getID().equals(ID) && account.getPW().equals(PW)){
				System.out.println("�α��� �����Դϴ�.");
			}
			else 
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
}
