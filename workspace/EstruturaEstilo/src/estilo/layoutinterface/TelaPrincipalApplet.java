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
import java.util.ArrayList;
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
import estilo.estrutura.SubEtapaConteudo;

public class TelaPrincipalApplet extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private SubEtapaConteudo subEtapaCorrente;
	private int indiceEtapaConteudoCorrente;
	private HashMap<DefaultMutableTreeNode, EtapaConteudo> mapEtapa = new HashMap<DefaultMutableTreeNode, EtapaConteudo>();
	private HashMap<DefaultMutableTreeNode, SubEtapaConteudo> mapSubEtapa = new HashMap<DefaultMutableTreeNode, SubEtapaConteudo>();

	protected Estilo estilo;
	
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
				
				estilo = retornarEstilo();
				exibirEstilo(estilo);
			}
		});
		button.setBounds(28, 116, 131, 23);
		panelEstilo.add(button);
		
		label = new JLabel("Informe o Estilo:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(28, 47, 131, 14);
		panelEstilo.add(label);
		
		scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(185, 42, 471, 251);
		panelEstilo.add(scrollPane);
		
		txtEstilo = new JTextArea();
		txtEstilo.setBounds(185, 43, 469, 250);
		panelEstilo.add(txtEstilo);
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
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (subEtapaCorrente.equals(etapaConteudoCorrente.getSubEtapas().get(etapaConteudoCorrente.getSubEtapas().size()-1))){
					int n = estilo.getOrdemComposicao().getOrdem().indexOf(etapaConteudoCorrente)+1;
					etapaConteudoCorrente = estilo.getOrdemComposicao().getOrdem().get(n);
					subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(0);
				} else {
					int i = etapaConteudoCorrente.getSubEtapas().indexOf(subEtapaCorrente);
					subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(i+1);
				}
				controlarNavegacao(estilo);
				txtTesteFormaExploracao.setText(subEtapaCorrente.toString());


			}
		});
		btnAvancar.setBounds(367, 374, 89, 23);
		panelLayout.add(btnAvancar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (subEtapaCorrente.equals(etapaConteudoCorrente.getSubEtapas().get(0))){
					int n = estilo.getOrdemComposicao().getOrdem().indexOf(etapaConteudoCorrente)-1;
					etapaConteudoCorrente = estilo.getOrdemComposicao().getOrdem().get(n);
					subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(etapaConteudoCorrente.getSubEtapas().size()-1);
				} else {
					int i = etapaConteudoCorrente.getSubEtapas().indexOf(subEtapaCorrente);
					subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(i-1);
				}
				controlarNavegacao(estilo);
				txtTesteFormaExploracao.setText(subEtapaCorrente.toString());

			}
		});
		btnVoltar.setBounds(268, 374, 89, 23);
		panelLayout.add(btnVoltar);
		
		btnUltimo = new JButton("\u00DAltimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etapaConteudoCorrente = estilo.getOrdemComposicao().getOrdem().get(estilo.getOrdemComposicao().getOrdem().size()-1);
				subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(etapaConteudoCorrente.getSubEtapas().size()-1);
				controlarNavegacao(estilo);
				txtTesteFormaExploracao.setText(subEtapaCorrente.toString());

			}
		});
		btnUltimo.setBounds(460, 374, 89, 23);
		panelLayout.add(btnUltimo);
		
		btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				etapaConteudoCorrente = estilo.getOrdemComposicao().getOrdem().get(0);
				subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(0);
				controlarNavegacao(estilo);
				txtTesteFormaExploracao.setText(subEtapaCorrente.toString());
			}
		});
		btnPrimeiro.setBounds(169, 374, 89, 23);
		panelLayout.add(btnPrimeiro);
		
		panelAreaConteudo = new JPanel();
		panelAreaConteudo.setBounds(147, 58, 570, 295);
		panelLayout.add(panelAreaConteudo);
		panelAreaConteudo.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (etapaConteudoCorrente == estilo.getOrdemComposicao().getOrdem().get(0) &&
						subEtapaCorrente == etapaConteudoCorrente.getSubEtapas().get(0)){
					btnPrimeiro.setEnabled(false);
					btnVoltar.setEnabled(false);
					btnAvancar.setEnabled(true);
					btnUltimo.setEnabled(false);
				} else {
					btnPrimeiro.setEnabled(true);
					btnVoltar.setEnabled(true);
					btnAvancar.setEnabled(true);
					btnUltimo.setEnabled(false);					
				}
			}
		});
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
		subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(0);

		controlarNavegacao(e);
		exibirRecursos(e);
		
	}

	private void exibirRecursos(Estilo e) {
		// TODO Auto-generated method stub
		
	}

	private void controlarNavegacao(Estilo e) {
		
		
		if (e.getFormaExploracao().getNomeForma().equalsIgnoreCase("Linear")){

			if (etapaConteudoCorrente.equals(e.getOrdemComposicao().getOrdem().get(0)) &&
					subEtapaCorrente.equals(etapaConteudoCorrente.getSubEtapas().get(0))){ // se etapa corrente é a primeira
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
			//TreePath tp = treeMapaConteudo.getPathForRow(indiceEtapaConteudoCorrente);
			
			exibirMapaConteudo(e, etapaConteudoCorrente);
		}
		
		else if (e.getFormaExploracao().getNomeForma().equalsIgnoreCase("Rede")){
			btnOk.setEnabled(false);
			if (etapaConteudoCorrente.equals(e.getOrdemComposicao().getOrdem().get(0)) &&
					subEtapaCorrente.equals(etapaConteudoCorrente.getSubEtapas().get(0))){ // se etapa corrente é a primeira
				btnPrimeiro.setEnabled(true);
				btnVoltar.setEnabled(false);
				btnAvancar.setEnabled(true);
				btnUltimo.setEnabled(true);			
			} else if (etapaConteudoCorrente.equals(e.getOrdemComposicao().getOrdem().get(e.getOrdemComposicao().getOrdem().size()-1)) &&
					subEtapaCorrente.equals(etapaConteudoCorrente.getSubEtapas().get(etapaConteudoCorrente.getSubEtapas().size()-1))){ // se etapa e subetapa últimas 
				btnPrimeiro.setEnabled(true);
				btnVoltar.setEnabled(true);
				btnAvancar.setEnabled(false);
				btnUltimo.setEnabled(true);			
			} else { // nos outros casos
				btnPrimeiro.setEnabled(true);
				btnVoltar.setEnabled(true);
				btnAvancar.setEnabled(true);
				btnUltimo.setEnabled(true);
			}
		}

		
		treeMapaConteudo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				if (e.getFormaExploracao().getNomeForma().equalsIgnoreCase("Rede")){
					
					TreePath tp = treeMapaConteudo.getPathForLocation(me.getX(), me.getY());
					if (tp != null){
						//txtTesteFormaExploracao.setText(tp.toString());
						DefaultMutableTreeNode n = (DefaultMutableTreeNode)tp.getLastPathComponent();
						if (mapEtapa.get(n) != null){ //  se clicou só em etapa
							etapaConteudoCorrente = mapEtapa.get(n);
							subEtapaCorrente = etapaConteudoCorrente.getSubEtapas().get(0);
						} else { // se clicou em subetapa
							String nomeSubEtapa = n.toString();
							subEtapaCorrente = estilo.getSubEtapaByName(nomeSubEtapa);
							etapaConteudoCorrente = subEtapaCorrente.getEtapaConteudo();
						}
						controlarNavegacao(estilo);
					}
					//else
						//txtTesteFormaExploracao.setText("");
				}
			}});
		
	
		//DefaultMutableTreeNode nodo = subEtapaCorrente.getNodo();
		//treeMapaConteudo.setSelectionPath(new TreePath(nodo.getPath()));
		//treeMapaConteudo.requestFocusInWindow();

		txtTesteFormaExploracao.setText(subEtapaCorrente.toString());

	}

	private void exibirMapaConteudo(Estilo e, EtapaConteudo etapaAtual) {
		boolean expande = true;
		mapEtapa = new HashMap<DefaultMutableTreeNode, EtapaConteudo>();
		mapSubEtapa = new HashMap<DefaultMutableTreeNode, SubEtapaConteudo>();
		DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Estilo : " + e.getEstiloNome());
		
		for (EtapaConteudo etapa : e.getOrdemComposicao().getOrdem()){
			DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(etapa.toString());
			etapa.setSubEtapas(new ArrayList<SubEtapaConteudo>());
			//bloco de teste
				for (int i = 1; i < 4; i++){
				DefaultMutableTreeNode subNodo = new DefaultMutableTreeNode(etapa.toString() + " Teste " + i);
					if (expande == true)
						nodo.add(subNodo);
					SubEtapaConteudo s = new SubEtapaConteudo(etapa.toString() + " Teste " + i, etapa);
					etapa.getSubEtapas().add(s);
					mapSubEtapa.put(subNodo, s);
					s.setNodo(subNodo);
				}
				mapEtapa.put(nodo, etapa);
				//subEtapaCorrente = etapaAtual.getSubEtapas().get(0);
			
			if (etapa == etapaAtual) expande = false;
			t1.add(nodo);
			mapEtapa.put(nodo, etapa);
		}
		treeMapaConteudo = new JTree(t1);
		treeMapaConteudo.setBounds(10, 58, 90, 295);
		scrollPaneMapa.setViewportView(treeMapaConteudo);

		
	}

	private void exibirMapaConteudo(Estilo e) {
		
		mapEtapa = new HashMap<DefaultMutableTreeNode, EtapaConteudo>();
		mapSubEtapa = new HashMap<DefaultMutableTreeNode, SubEtapaConteudo>();
		DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("Estilo : " + e.getEstiloNome());
		
		for (EtapaConteudo etapa : e.getOrdemComposicao().getOrdem()){
			DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(etapa.toString());
			etapa.setSubEtapas(new ArrayList<SubEtapaConteudo>());
			//bloco de teste
			for (int i = 1; i < 4; i++){
				DefaultMutableTreeNode subNodo = new DefaultMutableTreeNode(etapa.toString() + " Teste " + i);
				nodo.add(new DefaultMutableTreeNode(subNodo));
				SubEtapaConteudo s = new SubEtapaConteudo(etapa.toString() + " Teste " + i, etapa);
				etapa.getSubEtapas().add(s);	
				mapSubEtapa.put(subNodo, s);
				s.setNodo(subNodo);
			}
			//subEtapaCorrente = etapa.getSubEtapas().get(0);
			t1.add(nodo);
			mapEtapa.put(nodo, etapa);
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
