
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
		sd2.setName("김00");
		sd2.setId(201602076);
		sd2.setMajor("컴퓨터공학과");
		sd2.setGrade(2);
		sd2.setCredits(21);
		System.out.println("학생 이름:"+sd2.getName());
		System.out.println("학생 학번:"+sd2.getId());
		System.out.println("학생 소속학과:"+sd2.getMajor());
		System.out.println("학생 학년:"+sd2.getGrade());
		System.out.println("학생 이수학점 수:"+sd2.getCredits());
		
		Undergraduate st2 = new Undergraduate();
		st2.setName("조00");
		st2.setId(201702076);
		st2.setMajor("컴퓨터공학과");
		st2.setGrade(1);
		st2.setCredits(22);
		st2.setCircle("GROW");
		System.out.println("학부생 이름:"+st2.getName());
		System.out.println("학부생 학번:"+st2.getId());
		System.out.println("학부생 소속학과:"+st2.getMajor());
		System.out.println("학부생 학년:"+st2.getGrade());
		System.out.println("학부생 이수학점 수:"+st2.getCredits());
		System.out.println("학부생 소속 동아리명:"+st2.getCircle());
		
		GraduateStudent gt2 = new GraduateStudent();
		gt2.setName("이00");
		gt2.setId(201002076);
		gt2.setMajor("컴퓨터공학과");
		gt2.setGrade(1);
		gt2.setCredits(27);
		gt2.setAssistant("연구조교");
		gt2.setScholarship(0.56);
		System.out.println("대학원생 이름:"+gt2.getName());
		System.out.println("대학원생 학번:"+gt2.getId());
		System.out.println("대학원생 소속학과:"+gt2.getMajor());
		System.out.println("대학원생 학년:"+gt2.getGrade());
		System.out.println("대학원생 이수학점 수:"+gt2.getCredits());
		System.out.println("대학원생 조교유형:"+gt2.getAssistant());
		System.out.println("대학원생 장학금비율:"+gt2.getScholarship());
	}

}
