package storage;

public class RectangleTest {
	public static void main(String[] args) {
		
		Rectangle rt=new Rectangle(20,30);
		
		int lth=rt.getLth();
		int bth=rt.getBth();
		
		int Area=lth*bth;
		System.out.println("Area :"+Area);
		
		rt.setLth(50);
		rt.setBth(60);
		
		int ln=rt.getLth();
	    int br=rt.getBth();
		
		int newArea=ln*br;
		System.out.println("new area : " +newArea);
		
		
	}

}