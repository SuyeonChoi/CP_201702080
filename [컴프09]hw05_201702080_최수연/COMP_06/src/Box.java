
public class Box {
	int width; // ����
	int length; // ����
	int height; // ����

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
		System.out.println("������ ���α��� :" + getWidth());
		System.out.println("������ ���α��� :" + getLength());
		System.out.println("������ ���� :" + getHeight());
		System.out.println("������ ���� :" + getVolume());
	}
}
