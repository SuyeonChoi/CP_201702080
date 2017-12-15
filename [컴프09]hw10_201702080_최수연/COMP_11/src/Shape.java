
public class Shape {
	protected int width, height;

	public void Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}

}