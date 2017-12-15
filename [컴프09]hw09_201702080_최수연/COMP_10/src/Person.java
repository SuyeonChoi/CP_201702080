
public class Person {
	private String name;
	private String address;
	private String number;
	public Person() {
		name = "레뷧";
		address = "남쪽산 마을 13번지";
		number = "010-7777-7171";
	}
	public Person(String name,String number){
		setPerson(name,"주소정보없음",number);
	}
	public Person(String name){
		setPerson(name,"주소정보없음","전화번호정보없음");
	}
	public void setPerson(String name,String address,String number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void print(){
		System.out.println("고객 이름:"+name);
		System.out.println("고객 주소:"+address);
		System.out.println("고객 번호:"+number);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
