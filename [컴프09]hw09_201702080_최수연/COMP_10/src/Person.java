
public class Person {
	private String name;
	private String address;
	private String number;
	public Person() {
		name = "���R";
		address = "���ʻ� ���� 13����";
		number = "010-7777-7171";
	}
	public Person(String name,String number){
		setPerson(name,"�ּ���������",number);
	}
	public Person(String name){
		setPerson(name,"�ּ���������","��ȭ��ȣ��������");
	}
	public void setPerson(String name,String address,String number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void print(){
		System.out.println("�� �̸�:"+name);
		System.out.println("�� �ּ�:"+address);
		System.out.println("�� ��ȣ:"+number);
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
