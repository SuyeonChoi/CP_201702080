
public class Employee {
	String name;
	String number;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String nb) {
		number = nb;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}

	public void print() {
		System.out.println("���� �̸� :" + getName());
		System.out.println("���� ��ȣ :" + getNumber());
		System.out.println("���� ���� :" + getSalary());

	}

}
