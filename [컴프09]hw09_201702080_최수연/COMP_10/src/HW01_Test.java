
public class HW01_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ct1 = new Customer();
		ct1.setName("�ּ���");
		ct1.setAddress("���Ÿ��� 3����");
		ct1.setNumber("010-0000-1111");
		ct1.setId(171201);
		ct1.setMileage("21��");
		
		System.out.println("���̸�:"+ct1.getName());
		System.out.println("���ּ�:"+ct1.getAddress());
		System.out.println("����ȭ��ȣ:"+ct1.getNumber());
		System.out.println("����ȣ:"+ct1.getId());
		System.out.println("�����ϸ���:"+ct1.getMileage());
		
		Person p1 = new Person("�罿","444-212-322");
		Person p2 = new Person("����");
		Person p3 = new Person();
		Customer c1 = new Customer();
		Customer c2 = new Customer(171203);
	
		p1.print();
		c1.printC();
		p2.print();
		c2.printC();
		p3.print();
	}

}
