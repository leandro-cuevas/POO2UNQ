package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	
	private int y;
	
	Point(){
		this.setX(0);
		this.setY(0);
	}
	
	Point(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	static public void move(Point point, int x, int y) {
	
		point.setX(x);
		point.setY(y);
		
	}
	
	static public Point pointSum(Point point1, Point point2) {
		
		int x = point1.getX() + point2.getX();
		int y = point1.getY() + point2.getY();
		
		return new Point(x, y);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
