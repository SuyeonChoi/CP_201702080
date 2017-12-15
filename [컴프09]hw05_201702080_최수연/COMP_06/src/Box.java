
public class Box {
	int width; // 가로
	int length; // 세로
	int height; // 높이

	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width = w;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int l) {
		length = l;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getVolume() {
		return getWidth() * getLength() * getHeight();
	}
	public void print() {
		System.out.println("상자의 가로길이 :" + getWidth());
		System.out.println("상자의 세로길이 :" + getLength());
		System.out.println("상자의 높이 :" + getHeight());
		System.out.println("상자의 부피 :" + getVolume());
	}
}
