package DataSource;

import java.util.concurrent.TimeUnit;

public class DummyDataSrc {

	public void sendToDB() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Code sent to Mongo DB");
	}
}
