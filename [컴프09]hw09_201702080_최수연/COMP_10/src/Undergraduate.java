
public class Undergraduate extends Student {
	private String circle;
	public Undergraduate(){
		name = "�ּ���";
		id = 201702080;
		major = "��ǻ�Ͱ��а�";
		grade = 1;
		credits = 21;
		circle = "ProBrain";
	}
	public void printU(){
		System.out.println("�кλ� �̸�:"+name);
		System.out.println("�кλ� �й�:"+id);
		System.out.println("�кλ� �Ҽ��а�:"+major);
		System.out.println("�кλ� �г�:"+grade);
		System.out.println("�кλ� �̼����� ��:"+credits);
		System.out.println("�кλ� �Ҽ� ���Ƹ���:"+circle);
	}
	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}
}
