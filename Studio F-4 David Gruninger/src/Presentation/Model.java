package Presentation;

import javax.swing.JOptionPane;

import Domain.DummyDomain;
import Domain.ProfessorAdministrator;

public class Model {

	public void sendCodeToDB() {
		JOptionPane.showMessageDialog(null, "Code has been uploaded to the server and will run momentarily");
        DummyDomain professorAdministrator = new ProfessorAdministrator();
		professorAdministrator.run();
	}

}
