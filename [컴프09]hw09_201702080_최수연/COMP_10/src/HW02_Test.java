
public class HW02_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd1 = new Student();
		Undergraduate st1 = new Undergraduate();
		GraduateStudent gt1 = new GraduateStudent();
		sd1.print();
		st1.printU();
		gt1.printG();
		
		Student sd2 = new Student();
		sd2.setName("��00");
		sd2.setId(201602076);
		sd2.setMajor("��ǻ�Ͱ��а�");
		sd2.setGrade(2);
		sd2.setCredits(21);
		System.out.println("�л� �̸�:"+sd2.getName());
		System.out.println("�л� �й�:"+sd2.getId());
		System.out.println("�л� �Ҽ��а�:"+sd2.getMajor());
		System.out.println("�л� �г�:"+sd2.getGrade());
		System.out.println("�л� �̼����� ��:"+sd2.getCredits());
		
		Undergraduate st2 = new Undergraduate();
		st2.setName("��00");
		st2.setId(201702076);
		st2.setMajor("��ǻ�Ͱ��а�");
		st2.setGrade(1);
		st2.setCredits(22);
		st2.setCircle("GROW");
		System.out.println("�кλ� �̸�:"+st2.getName());
		System.out.println("�кλ� �й�:"+st2.getId());
		System.out.println("�кλ� �Ҽ��а�:"+st2.getMajor());
		System.out.println("�кλ� �г�:"+st2.getGrade());
		System.out.println("�кλ� �̼����� ��:"+st2.getCredits());
		System.out.println("�кλ� �Ҽ� ���Ƹ���:"+st2.getCircle());
		
		GraduateStudent gt2 = new GraduateStudent();
		gt2.setName("��00");
		gt2.setId(201002076);
		gt2.setMajor("��ǻ�Ͱ��а�");
		gt2.setGrade(1);
		gt2.setCredits(27);
		gt2.setAssistant("��������");
		gt2.setScholarship(0.56);
		System.out.println("���п��� �̸�:"+gt2.getName());
		System.out.println("���п��� �й�:"+gt2.getId());
		System.out.println("���п��� �Ҽ��а�:"+gt2.getMajor());
		System.out.println("���п��� �г�:"+gt2.getGrade());
		System.out.println("���п��� �̼����� ��:"+gt2.getCredits());
		System.out.println("���п��� ��������:"+gt2.getAssistant());
		System.out.println("���п��� ���бݺ���:"+gt2.getScholarship());
	}

}
