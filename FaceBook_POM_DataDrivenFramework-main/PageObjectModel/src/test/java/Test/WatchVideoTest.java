package Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.FindFriendPage;
import pages.WatchVideosPage;

@Listeners(Utility.Listener.class)
public class WatchVideoTest extends Base{
	public WatchVideoTest() {
		super();
	}
	final static Logger log = Logger.getLogger(WatchVideoTest.class);
	@BeforeMethod
	public void triggerDriver() {
		try {
			
			log.info("* Starting browser  *");

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void WatchPost() {
		
		log.info("* Start case watch videos *");

		watchvideo = new WatchVideosPage();
		watchvideo.userWatchVideos();
		String homePageTitle = watchvideo.verifyHomePage();
		assertEquals(homePageTitle, "Watch | Facebook");
	}
	
	
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {

			Thread.sleep(4000);
			util.closedriver();

		} catch (Exception e) {

		}
	}
}
