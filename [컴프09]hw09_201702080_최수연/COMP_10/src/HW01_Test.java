
public class HW01_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ct1 = new Customer();
		ct1.setName("최수연");
		ct1.setAddress("열매마을 3단지");
		ct1.setNumber("010-0000-1111");
		ct1.setId(171201);
		ct1.setMileage("21점");
		
		System.out.println("고객이름:"+ct1.getName());
		System.out.println("고객주소:"+ct1.getAddress());
		System.out.println("고객전화번호:"+ct1.getNumber());
		System.out.println("고객번호:"+ct1.getId());
		System.out.println("고객마일리지:"+ct1.getMileage());
		
		Person p1 = new Person("사슴","444-212-322");
		Person p2 = new Person("돼지");
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
