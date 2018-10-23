package tester;

public class DVDPlayer implements Device {
	public void turnOn() {
		System.out.println("DVD Player Encendido");
	}
	
	public void play() {
		System.out.println("DVD Player Reproduciendo");
	}
	
	public void stop() {
		System.out.println("DVD Player En pausa");
	}
	
	public void turnOff() {
		System.out.println("DVD Player apagado");
	}
}
