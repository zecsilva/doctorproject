package estilo.layoutinterface;

import java.awt.Component;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class QuestionarioApplet extends JApplet {
	JScrollPane scrollPane;
	
	public QuestionarioApplet() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 731, 462);
		getContentPane().add(panel);
		scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(189, 190, 469, 250);
		panel.add(scrollPane);
	}
}
