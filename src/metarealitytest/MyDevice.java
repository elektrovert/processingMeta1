package metarealitytest;

public class MyDevice extends Device{

	public MyDevice(String name, int x, int y, int xLength, int yLength,
			int radius, int color) {
		super(name, x, y, xLength, yLength, radius, color);
		// TODO Auto-generated constructor stub
	}
	
	public MyDevice(){
		super("MyDevice", 300, 500, 30, 30, 10, 0x00ff00);
		
	}

}
