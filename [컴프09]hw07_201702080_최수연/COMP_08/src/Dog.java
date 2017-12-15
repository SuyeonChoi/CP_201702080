
public class Dog {
	private String name;
	static String breed;
	private int age;


	public Dog(String name, int age) {
		setDog(name,"말티즈",1);
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
		System.out.println("강아지 이름:" + name);
		System.out.println("강아지 종류:" + breed);
		System.out.println("강아지 나이:" + age);
	}
}
