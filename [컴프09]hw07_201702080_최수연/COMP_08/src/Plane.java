
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
		factory = "대한항공";
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
		System.out.println("비행기 제작사:"+factory);
		System.out.println("비행기 모델명:"+model);
		System.out.println("최대 승객 수 :"+ max);
	}
}