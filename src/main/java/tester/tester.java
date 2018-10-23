package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {
	private Device device;
	
	public void test(){
		device.play();
		device.stop();
		device.turnOn();
		device.turnOff();
	}
	
	
	
	public void setDevice(Device device) {
		this.device = device;
	}
	
	
	
	

}
