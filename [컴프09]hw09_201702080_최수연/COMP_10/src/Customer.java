
public class Customer extends Person {
	private int id;
	private String mileage;
	public Customer(){
		id = 171203;
		mileage = "13점";
	}
	public Customer(int id){
		setCustomer(id,"고객마일리지정보없음");
	}
	public void setCustomer(int id,String mileage){
		this.id = id;
		this.mileage = mileage;
	}
	public void printC(){
		System.out.println("고객번호:"+id);
		System.out.println("고객마일리지:"+mileage);
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
