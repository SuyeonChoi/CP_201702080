
public class Plane {
	private String factory;
	private String model;
	private int max;
	private static int planes = 0;

	public void setFactory(String f) {
		f = factory;
	}

	public String getFactory() {
		return factory;
	}

	public void setModel(String m) {
		m = model;
	}

	public String getModel() {
		return model;
	}

	public void setMax(int n) {
		n = max;
	}

	public int getMax() {
		return max;
	}

	public void setPlane(String factory, String model, int max) {
		this.factory = factory;
		this.model = model;
		this.max = max;
	}

	public Plane(String factory, String model, int max) {
		setPlane(factory, model, max);
		planes++;
	}

	public Plane() {
		factory = "�����װ�";
		model = "KE";
		max = 340;
		planes++;
	}

	public Plane(String factory, int max) {
		setPlane(factory, "KF", max);
		planes++;
	}
	public static int getPlanes(){
		return planes;
	}
	public void print(){
		System.out.println("����� ���ۻ�:"+factory);
		System.out.println("����� �𵨸�:"+model);
		System.out.println("�ִ� �°� �� :"+ max);
	}
}