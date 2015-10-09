package estilo.estrutura;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JScrollPane;

public class TesteEstiloApplet extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNomeEstilo;
	private JButton btnEstilo;
	private JTextArea txtEstilo;
	private JPanel panel;
	
	
	public TesteEstiloApplet() {
		setBackground(new Color(255, 255, 255));
		setFont(null);
		setForeground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setToolTipText("Teste de Estilos");
		panel.setBounds(0, 0, 731, 387);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNomeEstilo = new JTextField();
		txtNomeEstilo.setForeground(new Color(0, 0, 0));
		txtNomeEstilo.setBounds(28, 72, 131, 20);
		panel.add(txtNomeEstilo);
		txtNomeEstilo.setColumns(10);
		
		btnEstilo = new JButton("Retornar Estilo");
		btnEstilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Estilo e = new Estilo(txtNomeEstilo.getText());
			    EstilosKB kb = new EstilosKB();
			    kb.tell(e);
			    kb.run();
			    
			   // System.out.println(e);
			    txtEstilo.setText(e.toString());
			}
		});
		btnEstilo.setBounds(28, 116, 131, 23);
		panel.add(btnEstilo);
		
		JLabel lblInformeOEstilo = new JLabel("Informe o Estilo:");
		lblInformeOEstilo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInformeOEstilo.setLabelFor(this);
		lblInformeOEstilo.setBounds(28, 47, 131, 14);
		panel.add(lblInformeOEstilo);
		
		JScrollPane scrollPane = new JScrollPane(txtEstilo);
		scrollPane.setBounds(185, 42, 471, 231);
		panel.add(scrollPane);
		
		txtEstilo = new JTextArea();
		txtEstilo.setLineWrap(true);
		txtEstilo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtEstilo.setWrapStyleWord(true);
		txtEstilo.setBounds(185, 42, 372, 136);
		scrollPane.setViewportView(txtEstilo);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), panel, txtNomeEstilo, btnEstilo, txtEstilo, lblInformeOEstilo}));
	}
}
