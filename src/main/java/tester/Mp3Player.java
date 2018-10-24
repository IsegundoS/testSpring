package tester;

public class Mp3Player  implements Device {
	private PlayList playList;
	
	public void turnOn() {
		System.out.println("MP3 Player Encendido");
	}
	
	public void play() {
		System.out.println("MP3 Player Reproduciendo:" + playList.getName());
	}
	
	public void stop() {
		System.out.println("MP3 Player En pausa");
	}
	
	public void turnOff() {
		System.out.println("MP3 Player apagado");
	}

	public void setPlayList(PlayList playlist) {
		this.playList = playlist;
	}
}
