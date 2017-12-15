
public class GraduateStudent extends Student{
	private String assistant;
	private double scholarship;
	
	public GraduateStudent(){
		name = "나조교";
		id = 1102032;
		major = "전기공학과";
		grade = 2;
		credits = 20;
		assistant = "교육조교";
		scholarship = 0.45;
	}
	public void printG(){
		System.out.println("대학원생 이름:"+name);
		System.out.println("대학원생 학번:"+id);
		System.out.println("대학원생 소속학과:"+major);
		System.out.println("대학원생 학년:"+grade);
		System.out.println("대학원생 이수학점 수:"+credits);
		System.out.println("대학원생 조교유형:"+assistant);
		System.out.println("대학원생 장학금비율:"+scholarship);
	}
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
}
