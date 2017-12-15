
public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane myplane1, myplane2, myplane3;
		myplane1 = new Plane();
		myplane2 = new Plane("대한항공", "KY", 900);
		myplane3 = new Plane("아시아나", 600);
		
		myplane1.print();
		myplane2.print();
		myplane3.print();

		int num = Plane.getPlanes();
		System.out.println();
		System.out.println("생성된 비행기 수:" + num);

	}

}
