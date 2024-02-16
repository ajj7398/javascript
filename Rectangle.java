package storage;

public class Rectangle extends RectangleTest {
	private int lth;
	private int bth;
	
	public int getLth() {
		return lth;
	}
	public void setLth(int lth) {
		this.lth = lth;
	}
	
	
	public int getBth() {
		return bth;
	}
	public void setBth(int bth) {
		this.bth = bth;
	}
	
	public Rectangle(int i, int j) {
		this.lth=i;
		this.bth=j;
	}

}