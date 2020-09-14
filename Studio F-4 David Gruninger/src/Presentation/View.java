package Presentation;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View {

	public int pickAssignment() {
		JFrame frame = new JFrame();
		String[] assignments = {"Assingment 1", "Assingment 2", "Assingment 3"};
		JPanel panel = new JPanel();
		panel.add(new JLabel(""));
		frame.add(panel);
		return 1 + JOptionPane.showOptionDialog(frame, "Pick an assignment that you want to upload to", "Assignment Uploader", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, assignments, assignments[0]);
		
	}

	public void selectFile(int assignNum) {
        JFileChooser chooser = new JFileChooser("Choose file to upload for assingment "+ assignNum);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal != JFileChooser.APPROVE_OPTION) {
        	System.err.println("This file type isn't supported");
        	System.exit(1);
        }else {
        	System.out.println("File's path is " +chooser.getSelectedFile().toPath());
        }		
	}

}
