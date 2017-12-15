
public class Undergraduate extends Student {
	private String circle;
	public Undergraduate(){
		name = "최수연";
		id = 201702080;
		major = "컴퓨터공학과";
		grade = 1;
		credits = 21;
		circle = "ProBrain";
	}
	public void printU(){
		System.out.println("학부생 이름:"+name);
		System.out.println("학부생 학번:"+id);
		System.out.println("학부생 소속학과:"+major);
		System.out.println("학부생 학년:"+grade);
		System.out.println("학부생 이수학점 수:"+credits);
		System.out.println("학부생 소속 동아리명:"+circle);
	}
	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}
}
