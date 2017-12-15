
public class Student {
	public String name;
	public int id;
	public String major;
	public int grade;
	public int credits;
	public Student(){
		name = "꿀꿀이";
		id = 2017088;
		major = "토목공학과";
		grade = 2;
		credits = 18;
	}
	public void print(){
		System.out.println("학생 이름:"+name);
		System.out.println("학생 학번:"+id);
		System.out.println("학생 소속학과:"+major);
		System.out.println("학생 학년:"+grade);
		System.out.println("학생 이수학점 수:"+credits);
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
