import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("width를 입력하세요.");//삼각형의 밑변,사각형의 가로,원의 반지름
		int width = input.nextInt();
		System.out.println("height를 입력하세요.");//삼각형의 높이,사각형의 세로
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