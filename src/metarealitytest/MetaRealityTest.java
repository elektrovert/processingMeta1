package metarealitytest;

import processing.core.PApplet;


public class MetaRealityTest extends PApplet {

	/**
	 * 
	 */

	int radius; 
	int signalRadius;
	Device[] devices;
	MyDevice myDevice;
	private int labelCount;
	private boolean tvLabel;
	private boolean tvSignal;
	
	
	public void setup() {
		size(800, 800);	
		background(0x000000);
		rectMode(CENTER);
		radius = 15;
		devices = new Device[4];
		devices[0] = new Device("stereo", 600, 50, 50 , 50, 15, 100);
		devices[1] = new Device("tv", 200, 375, 70 , 50, 15, 0xffff5020);
		devices[2] = new Device("macbook", 600, 500, 30 , 50, 15, 0xffff9900);
		devices[3] = new Device("monitor", 150, 520, 50 , 50, 15, 0xffff4000);
		myDevice = new MyDevice("myDevice", 100, 200, 50, 50, 15, 0xff008800);
	}

	public void draw() {

		clear();
		checkKeyPress();
		checkSignals();
		textSize(16);
		for(Device d : devices){
			fill(d.color);
			ellipse(d.x, d.y, d.xLength, d.xLength);
			fill(0xffffffff);
			text(d.getName(), d.getX(), d.getY());
		}
		
		fill(myDevice.getColor());
		ellipse(myDevice.getX(), myDevice.getY(), myDevice.getxLength(), myDevice.getxLength());
		fill(0xffffffff);
		text(myDevice.getName(), myDevice.getX(), myDevice.getY());
		checkLabel();
	}
	
	private void checkSignals() {
		if(tvSignal && signalRadius < 1500){
			signalRadius+= 10;
			
			fill(0xff000000);
			drawSignal(devices[1]);
		}else{
			tvSignal = false;
			signalRadius = 0;
		}
	}

	private void drawSignal(Device d) {
		stroke(d.getColor());
		ellipse(myDevice.getX(), myDevice.getY(), signalRadius + 150, signalRadius + 150);
		ellipse(myDevice.getX(), myDevice.getY(), signalRadius + 50, signalRadius + 50);
		ellipse(myDevice.getX(), myDevice.getY(), signalRadius, signalRadius);
		stroke(0xff000000);
	}

	private void checkKeyPress(){
		
		if(keyPressed){
		switch(key){
		
		case 'd':
			myDevice.setX(myDevice.getX() + 2);
			break;

		case 'a':
			myDevice.setX(myDevice.getX() - 2);
			break;
			
		case 's':
			myDevice.setY(myDevice.getY() + 2);
			break;
			
		case 'w':
			myDevice.setY(myDevice.getY() - 2);
			break;
			
		case '1':
			tvLabel = true;
			labelCount = 50;
			break;
			
			
		}
		}
	}
	
	private void checkLabel(){
		if(tvLabel == true && labelCount > 0){
			labelCount--;
			textSize(75);
			fill(0, 102, 153);
			text("TV", 200, 200);
			tvSignal = true;
		}else{
			tvLabel = false;
			labelCount = 0;
		}
	}
}
