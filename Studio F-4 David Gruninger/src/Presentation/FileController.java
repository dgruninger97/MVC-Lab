package Presentation;
import javax.swing.JOptionPane;

public class FileController {
	
	private static View view;
	private static Model model;
	private static int assignmentNum;

	public static void main(String[] args) {
		initializeView();
		modelDomainInteraction();
	}
	
	public static void initializeView() {
		view = new View();
		assignmentNum = view.pickAssignment();
		JOptionPane.showMessageDialog(null, "You selected assignment " + assignmentNum);
		JOptionPane.showMessageDialog(null, "You have no previous test results");
		view.selectFile(assignmentNum);
		
	}
	
	public static void modelDomainInteraction() {
		model = new Model();
		model.sendCodeToDB();
	}

}
