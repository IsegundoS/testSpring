package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
		public static void main (String[] args) {
			/*tester test = new tester();
			DVDPlayer dvdPlayer = new DVDPlayer();
			test.testDVD(dvdPlayer);
			
			Mp3Player mp3Player =  new Mp3Player();
			test.testMp3(mp3Player);
			
			BluRay bluRayPlayer = new BluRay();
			test.testBluRay(bluRayPlayer);
			*/
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			Tester tester = applicationContext.getBean("tester", Tester.class);
			tester.test();
			
			tester = applicationContext.getBean("testerDvd", Tester.class);
			tester.test(); 
			
			tester = applicationContext.getBean("testerMp3", Tester.class);
			tester.test(); 
			
			tester = applicationContext.getBean("testerBluRay", Tester.class);
			tester.test(); 
			
			
			
			
			
		}
}