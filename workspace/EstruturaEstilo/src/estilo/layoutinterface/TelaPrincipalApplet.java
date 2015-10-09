package estilo.layoutinterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import estilo.estrutura.Estilo;
import estilo.estrutura.EstilosKB;
import estilo.estrutura.EtapaConteudo;

public class TelaPrincipalApplet extends JApplet {
	private JTextField txtNomeEstilo;
	private JLabel label;
	private JScrollPane scrollPane;
	private JTextArea txtEstilo;
	private JPanel panelLayout;
	private JTree treeMapaConteudo;
	private JButton btnAvancar;
	private JButton btnVoltar;
	private JButton btnUltimo;
	private JButton btnPrimeiro;
	private JPanel panelAreaConteudo;
	private JScrollPane scrollPaneMapa;
	private JButton btnOk;
	private JTextField txtTesteFormaExploracao;
	private EtapaConteudo etapaConteudoCorrente;
	private int indiceEtapaConteudoCorrente;
	private HashMap<EtapaConteudo, DefaultMutableTreeNode> mapEtapa = new HashMap<EtapaConteudo, DefaultMutableTreeNode>();
	
	public TelaPrincipalApplet() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 732, 430);
		getContentPane().add(tabbedPane);
		
		JPanel panelEstilo = new JPanel();
		panelEstilo.setLayout(null);
		panelEstilo.setToolTipText("Teste de Estilos");
		tabbedPane.addTab("Informar Estilo", null, panelEstilo, null);
		
		txtNomeEstilo = new JTextField();
		txtNomeEstilo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		txtNomeEstilo.setForeground(Color.BLACK);
		txtNomeEstilo.setColumns(10);
		txtNomeEstilo.setBounds(28, 72, 131, 20);
		panelEstilo.add(txtNomeEstilo);
		
		JButton button = new JButton("Retornar Estilo");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				
				Estilo e = retornarEstilo();
				exibirEstilo(e);
			}
		});
		button.setBounds(28, 116, 131, 23);
		panelEstilo.add(button);
		
		label = new JLabel("Informe o Estilo:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(28, 47, 131, 14);
		panelEstilo.add(label);
		
		scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(185, 42, 471, 231);
		panelEstilo.add(scrollPane);
		
		txtEstilo = new JTextArea();
		scrollPane.setViewportView(txtEstilo);
		txtEstilo.setWrapStyleWord(true);
		txtEstilo.setLineWrap(true);
		txtEstilo.setFont(new Font("Monospaced", Font.PLAIN, 13));


		
		panelLayout = new JPanel();
		tabbedPane.addTab("Exibir Estilo", null, panelLayout, null);
		panelLayout.setLayout(null);
		
		treeMapaConteudo = new JTree();
		//treeMapaConteudo.setBounds(10, 58, 90, 295);
		//panelLayout.add(treeMapaConteudo);
		
		btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.setBounds(169, 374, 89, 23);
		panelLayout.add(btnAvancar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(268, 374, 89, 23);
		panelLayout.add(btnVoltar);
		
		btnUltimo = new JButton("\u00DAltimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUltimo.setBounds(460, 374, 89, 23);
		panelLayout.add(btnUltimo);
		
		btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.setBounds(367, 374, 89, 23);
		panelLayout.add(btnPrimeiro);
		
		panelAreaConteudo = new JPanel();
		panelAreaConteudo.setBounds(147, 58, 570, 295);
		panelLayout.add(panelAreaConteudo);
		panelAreaConteudo.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(503, 261, 57, 23);
		panelAreaConteudo.add(btnOk);
		
		txtTesteFormaExploracao = new JTextField();
		txtTesteFormaExploracao.setBounds(102, 262, 371, 20);
		panelAreaConteudo.add(txtTesteFormaExploracao);
		txtTesteFormaExploracao.setColumns(10);
		
		scrollPaneMapa = new JScrollPane();
		scrollPaneMapa.setBounds(10, 58, 127, 201);
		panelLayout.add(scrollPaneMapa);
	}
	
	protected void exibirEstilo(Estilo e) {

		exibirMapaConteudo(e);
		etapaConteudoCorrente = e.getOrdemComposicao().getOrdem().get(0);
		indiceEtapaConteudoCorrente = 0;
		controlarNavegacao(e);
		exibirRecursos(e);
		
	}

	private void exibirRecursos(Estilo e) {
		// TODO Auto-generated method stub
		
	}

	private void controlarNavegacao(Estilo e) {
		
		if (e.getFormaExploracao().getNomeForma().equalsIgnoreCase("Linear")){
			if (etapaConteudoCorrente == e.getOrdemComposicao().getOrdem().get(0)){
				btnPrimeiro.setEnabled(false);
				btnVoltar.setEnabled(false);
				btnAvancar.setEnabled(false);
				btnUltimo.setEnabled(false);
			}
			else{
				btnPrimeiro.setEnabled(true);
				btnVoltar.setEnabled(true);
				btnAvancar.setEnabled(false);
				btnUltimo.setEnabled(false);
				
			}
			TreePath tp = treeMapaConteudo.getPathForRow(indiceEtapaConteudoCorrente);
			//treeMapaConteudo.gettree
			DefaultMutableTreeNode nodo = mapEtapa.get(etapaConteudoCorrente);

			exibirMapaConteudo(e, etapaConteudoCorrente);
			//nodo.
			//treeMapaConteudo.expandPath();
		}
		
		else if (e.getFormaExploracao().getNomeForma().equalsIgnoreCase("Rede")){
			btnPrimeiro.setEnabled(true);
			btnVoltar.setEnabled(true);
			btnAvancar.setEnabled(true);
			btnUltimo.setEnabled(true);
			treeMapaConteudo.addMouseListener(new MouseAdapter() {
			      public void mouseClicked(MouseEvent me) {
			    	  TreePath tp = treeMapaConteudo.getPathForLocation(me.getX(), me.getY());
			    	    if (tp != null)
			    	      txtTesteFormaExploracao.setText(tp.toString());
			    	    else
			    	      txtTesteFormaExploracao.setText("");
			        }});
		}
	}

	private void exibirMapaConteudo(Estilo e, EtapaConteudo etapaAtual) {
		boolean expande = true;
		DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Estilo : " + e.getEstiloNome());
		for (EtapaConteudo etapa : e.getOrdemComposicao().getOrdem()){
			DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(etapa.toString());
			//linha de teste
			if (expande == true) {
				for (int i = 1; i < 4; i++)
					nodo.add(new DefaultMutableTreeNode(etapa.toString() + " Teste " + i));				
			}
			if (etapa == etapaAtual) expande = false;
			t1.add(nodo);
			mapEtapa.put(etapa, nodo);
		}
		treeMapaConteudo = new JTree(t1);
		treeMapaConteudo.setBounds(10, 58, 90, 295);
		scrollPaneMapa.setViewportView(treeMapaConteudo);

		
	}

	private void exibirMapaConteudo(Estilo e) {
		DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Estilo : " + e.getEstiloNome());
		for (EtapaConteudo etapa : e.getOrdemComposicao().getOrdem()){
			DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(etapa.toString());
			//linha de teste
			for (int i = 1; i < 4; i++)
				nodo.add(new DefaultMutableTreeNode(etapa.toString() + " Teste " + i));
			t1.add(nodo);
			mapEtapa.put(etapa, nodo);
		}
		treeMapaConteudo = new JTree(t1);
		treeMapaConteudo.setBounds(10, 58, 90, 295);
		scrollPaneMapa.setViewportView(treeMapaConteudo);

		
	}

	protected Estilo retornarEstilo() {
		Estilo e = new Estilo(txtNomeEstilo.getText());
	    EstilosKB kb = new EstilosKB();
	    kb.tell(e);
	    kb.run();
	    
	   //System.out.println(e);
	    txtEstilo.setText(e.toString());
	    
	    
		return e;
	}
}
