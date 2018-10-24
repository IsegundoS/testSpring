package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("tester")
@Component("Mp3Player")
@Component("DVDPlayer")
@Component("PlayList")
@Component("SmartPhone")
@Component("BluRay")
@Component("Pop")
@Component("Device")



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
