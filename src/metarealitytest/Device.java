package metarealitytest;

public class Device {
	int x;
	int y;
	int xLength;
	int yLength;
	int radius;
	int color;
	String name;
	
	public Device(String name, int x, int y, int xLength, int yLength, int radius, int color){
		this.name = name;
		this.x = x;
		this.y = y;
		this.xLength = xLength;
		this.yLength = yLength;
		this.radius = radius;
		this.color = color; 	
	}

	public int getX() {
//		System.out.println("Getting X: " + x);
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

	public int getxLength() {
		return xLength;
	}

	public void setxLength(int xLength) {
		this.xLength = xLength;
	}

	public int getyLength() {
		return yLength;
	}

	public void setyLength(int yLength) {
		this.yLength = yLength;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
