
public class Customer extends Person {
	private int id;
	private String mileage;
	public Customer(){
		id = 171203;
		mileage = "13��";
	}
	public Customer(int id){
		setCustomer(id,"�����ϸ�����������");
	}
	public void setCustomer(int id,String mileage){
		this.id = id;
		this.mileage = mileage;
	}
	public void printC(){
		System.out.println("����ȣ:"+id);
		System.out.println("�����ϸ���:"+mileage);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
}
