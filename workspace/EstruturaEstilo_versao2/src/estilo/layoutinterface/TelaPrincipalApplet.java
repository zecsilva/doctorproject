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
import javax.swing.border.BevelBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import estilo.estrutura.Estilo;
import estilo.estrutura.EstilosKB;
import estilo.estrutura.EtapaConteudo;
import estilo.estrutura.SubEtapaConteudo;
import estilo.layoutinterface.exibirrecursos.MostrarRecurso;

public class TelaPrincipalApplet extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtNomeEstilo;
	private JLabel label;
	private JScrollPane scrollPane;
	private JScrollPane scrollPaneAreaConteudo;
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
	
	private MostrarRecurso lblRecurso1;
	private MostrarRecurso lblRecurso2;
	private MostrarRecurso lblRecurso3;
	private MostrarRecurso lblRecurso4;
	private MostrarRecurso lblRecurso5;
	private MostrarRecurso lblRecurso6;
	private MostrarRecurso lblRecurso7;
	private MostrarRecurso lblRecurso8;
	private MostrarRecurso lblRecurso9;
	private MostrarRecurso lblRecurso10;
	private MostrarRecurso lblRecurso11;
	private MostrarRecurso lblRecurso12;
	private MostrarRecurso lblRecurso13;
	private MostrarRecurso lblRecurso14;
	private MostrarRecurso lblRecurso15;
	
	public TelaPrincipalApplet() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 843, 477);
		getContentPane().add(tabbedPane);
		
		JPanel panelEstilo = new JPanel();
		panelEstilo.setLayout(null);
		panelEstilo.setToolTipText("Teste de Estilos");
		tabbedPane.addTab("Informar Estilo", null, panelEstilo, null);
		
		JPanel panelRecurso = new JPanel();
		panelRecurso.setLayout(null);
		panelRecurso.setToolTipText("Teste de Recursos");
		tabbedPane.addTab("Informar Recursos", null, panelRecurso, null);
		
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
		scrollPane.setBounds(187, 42, 469, 250);
		panelEstilo.add(scrollPane);
		
		txtEstilo = new JTextArea();
		txtEstilo.setBounds(190, 47, 461, 239);
		//panelEstilo.add(txtEstilo);
		txtEstilo.setWrapStyleWord(true);
		txtEstilo.setLineWrap(true);
		txtEstilo.setFont(new Font("Monospaced", Font.PLAIN, 13));

		scrollPane.setViewportView(txtEstilo);
		
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
		btnAvancar.setBounds(369, 415, 89, 23);
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
		btnVoltar.setBounds(270, 415, 89, 23);
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
		btnUltimo.setBounds(462, 415, 89, 23);
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
		btnPrimeiro.setBounds(171, 415, 89, 23);
		panelLayout.add(btnPrimeiro);
		
		scrollPaneAreaConteudo = new JScrollPane((Component) null);
		scrollPaneAreaConteudo.setBounds(171, 48, 657, 311);
		panelLayout.add(scrollPaneAreaConteudo);
		
		panelAreaConteudo = new JPanel();
		panelAreaConteudo.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
		panelAreaConteudo.setBounds(157, 43, 671, 327);
		//panelLayout.add(panelAreaConteudo);
		panelAreaConteudo.setLayout(null);
		
		scrollPaneAreaConteudo.setViewportView(panelAreaConteudo);
		
		lblRecurso1 = new MostrarRecurso("recurso");
		lblRecurso1.setBounds(10, 11, 100, 100);
		panelAreaConteudo.add(lblRecurso1);
		
		lblRecurso2 = new MostrarRecurso("recurso");
		lblRecurso2.setBounds(113, 11, 100, 100);
		panelAreaConteudo.add(lblRecurso2);
		
		lblRecurso3 = new MostrarRecurso("recurso");
		lblRecurso3.setBounds(223, 11, 100, 100);
		panelAreaConteudo.add(lblRecurso3);
		
		lblRecurso4 = new MostrarRecurso("recurso");
		lblRecurso4.setBounds(333, 11, 100, 100);
		panelAreaConteudo.add(lblRecurso4);
		
		lblRecurso5 = new MostrarRecurso("recurso");
		lblRecurso5.setBounds(443, 11, 100, 100);
		panelAreaConteudo.add(lblRecurso5);
		
		lblRecurso6 = new MostrarRecurso("recurso");
		lblRecurso6.setBounds(10, 122, 100, 100);
		panelAreaConteudo.add(lblRecurso6);
		
		lblRecurso7 = new MostrarRecurso("recurso");
		lblRecurso7.setBounds(113, 122, 100, 100);
		panelAreaConteudo.add(lblRecurso7);
		
		lblRecurso8 = new MostrarRecurso("recurso");
		lblRecurso8.setBounds(223, 122, 100, 100);
		panelAreaConteudo.add(lblRecurso8);
		
		lblRecurso9 = new MostrarRecurso("recurso");
		lblRecurso9.setBounds(333, 122, 100, 100);
		panelAreaConteudo.add(lblRecurso9);
		
		lblRecurso10 = new MostrarRecurso("recurso");
		lblRecurso10.setBounds(443, 122, 100, 100);
		panelAreaConteudo.add(lblRecurso10);
		
		lblRecurso11 = new MostrarRecurso("recurso");
		lblRecurso11.setBounds(10, 247, 100, 100);
		panelAreaConteudo.add(lblRecurso11);
		
		lblRecurso12 = new MostrarRecurso("recurso");
		lblRecurso12.setBounds(113, 247, 100, 100);
		panelAreaConteudo.add(lblRecurso12);
		
		lblRecurso13 = new MostrarRecurso("recurso");
		lblRecurso13.setBounds(223, 247, 100, 100);
		panelAreaConteudo.add(lblRecurso13);
		
		lblRecurso14 = new MostrarRecurso("recurso");
		lblRecurso14.setBounds(333, 247, 100, 100);
		panelAreaConteudo.add(lblRecurso14);
		
		lblRecurso15 = new MostrarRecurso("recurso");
		lblRecurso15.setBounds(443, 247, 100, 100);
		panelAreaConteudo.add(lblRecurso15);
		
		arranjarLabels();
		
		scrollPaneMapa = new JScrollPane();
		scrollPaneMapa.setBounds(10, 43, 127, 295);
		panelLayout.add(scrollPaneMapa);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(572, 381, 57, 23);
		panelLayout.add(btnOk);
		
		txtTesteFormaExploracao = new JTextField();
		txtTesteFormaExploracao.setBounds(171, 382, 371, 20);
		panelLayout.add(txtTesteFormaExploracao);
		txtTesteFormaExploracao.setColumns(10);
		
		

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
	
	protected void arranjarLabels() {
		
		lblRecurso1.setDireita(lblRecurso2);
		lblRecurso2.setDireita(lblRecurso3);
		lblRecurso3.setDireita(lblRecurso4);
		lblRecurso4.setDireita(lblRecurso5);
		lblRecurso6.setDireita(lblRecurso7);
		lblRecurso7.setDireita(lblRecurso8);
		lblRecurso8.setDireita(lblRecurso9);
		lblRecurso9.setDireita(lblRecurso10);
		lblRecurso11.setDireita(lblRecurso12);
		lblRecurso12.setDireita(lblRecurso13);
		lblRecurso13.setDireita(lblRecurso14);
		lblRecurso14.setDireita(lblRecurso15);
		
		lblRecurso2.setEsquerda(lblRecurso1);
		lblRecurso3.setEsquerda(lblRecurso2);
		lblRecurso4.setEsquerda(lblRecurso3);
		lblRecurso5.setEsquerda(lblRecurso4);
		lblRecurso7.setEsquerda(lblRecurso6);
		lblRecurso8.setEsquerda(lblRecurso7);
		lblRecurso9.setEsquerda(lblRecurso8);
		lblRecurso10.setEsquerda(lblRecurso9);
		lblRecurso12.setEsquerda(lblRecurso11);
		lblRecurso13.setEsquerda(lblRecurso12);
		lblRecurso14.setEsquerda(lblRecurso13);
		lblRecurso15.setEsquerda(lblRecurso14);
		
		lblRecurso6.setCima(lblRecurso1);
		lblRecurso7.setCima(lblRecurso2);
		lblRecurso8.setCima(lblRecurso3);
		lblRecurso9.setCima(lblRecurso4);
		lblRecurso10.setCima(lblRecurso5);
		lblRecurso11.setCima(lblRecurso6);
		lblRecurso12.setCima(lblRecurso7);
		lblRecurso13.setCima(lblRecurso8);
		lblRecurso14.setCima(lblRecurso9);
		lblRecurso15.setCima(lblRecurso10);
		
		lblRecurso1.setBaixo(lblRecurso6);
		lblRecurso2.setBaixo(lblRecurso7);
		lblRecurso3.setBaixo(lblRecurso8);
		lblRecurso4.setBaixo(lblRecurso9);
		lblRecurso5.setBaixo(lblRecurso10);
		lblRecurso6.setBaixo(lblRecurso11);
		lblRecurso7.setBaixo(lblRecurso12);
		lblRecurso8.setBaixo(lblRecurso13);
		lblRecurso9.setBaixo(lblRecurso14);
		lblRecurso10.setBaixo(lblRecurso15);
		
	}
}
