
public class Student {
	public String name;
	public int id;
	public String major;
	public int grade;
	public int credits;
	public Student(){
		name = "�ܲ���";
		id = 2017088;
		major = "�����а�";
		grade = 2;
		credits = 18;
	}
	public void print(){
		System.out.println("�л� �̸�:"+name);
		System.out.println("�л� �й�:"+id);
		System.out.println("�л� �Ҽ��а�:"+major);
		System.out.println("�л� �г�:"+grade);
		System.out.println("�л� �̼����� ��:"+credits);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
}
