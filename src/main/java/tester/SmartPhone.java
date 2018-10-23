package tester;

public class SmartPhone implements Device{
	
	public void turnOn() {
		System.out.println("SmarthPhone  Encendido");
	}
	
	public void play() {
		System.out.println("SmarthPhone Reproduciendo");
	}
	
	public void stop() {
		System.out.println("SmarthPhone En pausa");
	}
	
	public void turnOff() {
		System.out.println("SmarthPhone apagado");
	}

}
