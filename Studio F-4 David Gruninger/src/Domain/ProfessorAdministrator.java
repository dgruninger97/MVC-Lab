package Domain;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import DataSource.DummyDataSrc;

public class ProfessorAdministrator extends DummyDomain{
	
	@Override
	public void run(){
		double numCorrect = 0;
		int randomVal = (int) Math.floor(Math.random() * 10);
		System.out.println("The domain layer is now running the tests.");
		JOptionPane.showMessageDialog(null, "Tests are runing, see results in the console");
		for(int i = 1; i < 6; i++) {
			System.out.println("Test " + i + " running against test......");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(randomVal <= 7) {
				System.out.println("Test " + i + " passed unit test!!");
				numCorrect++;
			}else {
				System.out.println("Test " + i + " failed unit test");
			}
			randomVal = (int) Math.floor(Math.random() * 10);
			
		}
		JOptionPane.showMessageDialog(null, "Your grade for these tests are " + (double) (numCorrect / 5) * 100 + "%");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addCodeToDB();
	}

	private void addCodeToDB() {
		System.out.println("Your code is now being sent to the database, you may submit again if you want to improve your score");
		DummyDataSrc dataSrc = new DummyDataSrc();
		
		dataSrc.sendToDB();
	}
}
