
public class Dog {
	private String name;
	static String breed;
	private int age;


	public Dog(String name, int age) {
		setDog(name,"��Ƽ��",1);
	}

	public Dog(String name, String breed, int age) {
		setDog(name,breed,age);
		
	}
	
	public void setDog(String name,String breed,int age){
		this.name = name;
		this.age = age;
		Dog.breed = breed;
		}

	public void print() {
		System.out.println("������ �̸�:" + name);
		System.out.println("������ ����:" + breed);
		System.out.println("������ ����:" + age);
	}
}
