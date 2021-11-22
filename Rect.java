public class Rect {
	public int width;
	public int length;
	public int area;
	public int circum;

	public Rect(){
		width = 10;
		length = 5;
	}
	//method for calculating the area
	public int Area(){
		area = width * length;
		return area;
	}
	//method for calculating the circumference
	public int Circum(){
		circum = 2 * (length + width);
		return circum;
	}
}
