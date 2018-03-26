

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 3/25/2018
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap(7);
		drawBoxInsides(7, 3);
		drawBoxCap(7);
	}
	
	public static void drawBoxCap(int width) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= width; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int width, int length) {
		for( int insideRowIndex = 1; insideRowIndex <= length; insideRowIndex++ ) {
			drawBoxInsideLine(width);
		}
	}
	
	public static void drawBoxInsideLine(int width) {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= width; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
