
public class GraduateStudent extends Student{
	private String assistant;
	private double scholarship;
	
	public GraduateStudent(){
		name = "������";
		id = 1102032;
		major = "������а�";
		grade = 2;
		credits = 20;
		assistant = "��������";
		scholarship = 0.45;
	}
	public void printG(){
		System.out.println("���п��� �̸�:"+name);
		System.out.println("���п��� �й�:"+id);
		System.out.println("���п��� �Ҽ��а�:"+major);
		System.out.println("���п��� �г�:"+grade);
		System.out.println("���п��� �̼����� ��:"+credits);
		System.out.println("���п��� ��������:"+assistant);
		System.out.println("���п��� ���бݺ���:"+scholarship);
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
