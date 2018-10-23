package tester;

public class BluRay implements Device {
	public void turnOn() {
		System.out.println("BluRay Player Encendido");
	}
	
	public void play() {
		System.out.println("BluRay Player Reproduciendo");
	}
	
	public void stop() {
		System.out.println("BluRay Player En pausa");
	}
	
	public void turnOff() {
		System.out.println("BluRay Player apagado");
	}
	

}
