package Overloading;

public class subClass extends mainClass{
	private int length;
	private int breadth;
	private int radious;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	public int getRadious() {
		return radious;
	}
	public void setRadious(int radious) {
		this.radious = radious;
	}
	public subClass(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	public subClass(int radious) {
		super();
		this.radious = radious;
	}
	
	
	
	
	

}