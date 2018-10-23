package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class tester {
	
		public void testDVD(DVDPlayer dvdPlayer) {
			dvdPlayer.play();
			dvdPlayer.stop();
			dvdPlayer.turnOn();
			dvdPlayer.turnOn();
			
		}
		
		public void testMp3(Mp3Player mp3Player) {
			mp3Player.play();
			mp3Player.stop();
			mp3Player.turnOff();
			mp3Player.turnOn();
		}
		
		
		public void testBluRay(BluRay bluRayPlayer) {
			bluRayPlayer.play();
			bluRayPlayer.stop();
			bluRayPlayer.turnOff();
			bluRayPlayer.turnOn();
		}
		
	

}
