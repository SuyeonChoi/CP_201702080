import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("width�� �Է��ϼ���.");//�ﰢ���� �غ�,�簢���� ����,���� ������
		int width = input.nextInt();
		System.out.println("height�� �Է��ϼ���.");//�ﰢ���� ����,�簢���� ����
		int height = input.nextInt();

		Shape shape[] = new Shape[3];

		Triangle triangle = new Triangle();
		triangle.Shape(width, height);
		shape[0] = triangle;

		Rectangle rectangle = new Rectangle();
		rectangle.Shape(width, height);
		shape[1] = rectangle;

		Circle circle = new Circle();
		circle.Shape(width, height);
		shape[2] = circle;

		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].area());
		}
	}

}