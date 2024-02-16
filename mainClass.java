package Overloading;

public class mainClass {

	public static void main(String[] args) {
		subClass obj=new subClass(23,45);
		subClass obj1=new subClass(23);


		int l=obj.getBreadth();
		int b=obj.getLength();
		int r=obj1.getRadious();
		float p=(float) 3.14;
		int area=l*b;
		System.out.println("Area of rectangle is : "+area);
		
        int triangleArea=area/2;
        System.out.println("Area of Triangle is : "+triangleArea);
        
        float  circle=p*(r*r);
        System.out.println("Area of circle is :"+circle);
	}

}