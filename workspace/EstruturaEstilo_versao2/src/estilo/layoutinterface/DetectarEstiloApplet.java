package estilo.layoutinterface;

import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import estilo.estrutura.Estilos;
import estilo.estrutura.FormaExploracao;
import estilo.estrutura.FormaExploracaoKB;
import estilo.estrutura.OrdemComposicao;
import estilo.estrutura.OrdemComposicaoKB;
import estilo.estrutura.OrdemDetalhamento;
import estilo.estrutura.OrdemDetalhamentoKB;
import estilo.estrutura.RecursoEstilo;
import estilo.estrutura.RecursosKB;
import estilo.util.Constantes;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class DetectarEstiloApplet extends JApplet{
	
	private JPanel panel;
	private JTextArea txtEstilo;
	private JScrollPane scrollPane;
	private JFormattedTextField txtAnimacao;
	private JFormattedTextField txtEsquema;
	private JFormattedTextField txtFigura;
	private JFormattedTextField txtNarracao;
	private JFormattedTextField txtSimulacao;
	private JFormattedTextField txtAutoAvaliacao;
	private JFormattedTextField txtExemplo;
	private JFormattedTextField txtFoto;
	private JFormattedTextField txtPaginaWeb;
	private JFormattedTextField txtSlide;
	private JFormattedTextField txtDemonstracao;
	private JFormattedTextField txtExercicio;
	private JFormattedTextField txtGrafico;
	private JFormattedTextField txtPalestra;
	private JFormattedTextField txtTabela;
	private JFormattedTextField txtDiagrama;
	private JFormattedTextField txtExperimento;
	private JFormattedTextField txtMapa;
	private JFormattedTextField txtQuestionario;
	private JFormattedTextField txtVideo;

	private ArrayList<JCheckBox> checkBoxesRecursos = new ArrayList<JCheckBox>();
	private HashMap<JCheckBox, JFormattedTextField> map = new HashMap<JCheckBox, JFormattedTextField>();
	private JRadioButton rbRede;
	private JRadioButton rbLinear;
	private ButtonGroup bgFormaExploracao;
	private JRadioButton rbEspecificoParaGeral;
	private JRadioButton rbGeralParaEspecifico;
	private ButtonGroup bgOrdemDetalhamento;
	
	public DetectarEstiloApplet() {
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1000, 700);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Vector v = new Vector();  
		v.addElement("--Selecione um Item--");
		v.addElement(Constantes.ORDEM_COMPOSICAO_1);
		v.addElement(Constantes.ORDEM_COMPOSICAO_2);
		v.addElement(Constantes.ORDEM_COMPOSICAO_3);
		
		JComboBox cmbOrdemComposicao = new JComboBox(v);
		cmbOrdemComposicao.setBounds(159, 58, 443, 20);
		panel.add(cmbOrdemComposicao);
		
		JLabel lblOrdemDeComposio = new JLabel("Ordem de Composi\u00E7\u00E3o");
		lblOrdemDeComposio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOrdemDeComposio.setBounds(10, 61, 146, 14);
		panel.add(lblOrdemDeComposio);
		
		JLabel lblRecursos = new JLabel("Recursos");
		lblRecursos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRecursos.setBounds(10, 111, 146, 14);
		panel.add(lblRecursos);
		
		JCheckBox ckAnimacao = new JCheckBox("Anima\u00E7\u00E3o");
		ckAnimacao.setBounds(10, 141, 97, 23);
		panel.add(ckAnimacao);
		ckAnimacao.setName("Animacao");
		checkBoxesRecursos.add(ckAnimacao);
		
		JCheckBox ckEsquema = new JCheckBox("Esquema");
		ckEsquema.setBounds(10, 184, 97, 23);
		panel.add(ckEsquema);
		ckEsquema.setName("Esquema");
		checkBoxesRecursos.add(ckEsquema);
		
		JCheckBox ckFigura = new JCheckBox("Figura");
		ckFigura.setBounds(10, 221, 97, 23);
		panel.add(ckFigura);
		ckFigura.setName("Figura");
		checkBoxesRecursos.add(ckFigura);
		
		JCheckBox ckExemplo = new JCheckBox("Exemplo");
		ckExemplo.setBounds(235, 184, 97, 23);
		panel.add(ckExemplo);
		ckExemplo.setName("Exemplo");
		checkBoxesRecursos.add(ckExemplo);
		
		JCheckBox ckFoto = new JCheckBox("Foto");
		ckFoto.setBounds(235, 221, 97, 23);
		panel.add(ckFoto);
		ckFoto.setName("Foto");
		checkBoxesRecursos.add(ckFoto);
		
		JCheckBox ckAutoAvaliacao = new JCheckBox("Auto-Avalia\u00E7\u00E3o");
		ckAutoAvaliacao.setBounds(235, 141, 139, 23);
		panel.add(ckAutoAvaliacao);
		ckAutoAvaliacao.setName("AutoAvaliacao");
		checkBoxesRecursos.add(ckAutoAvaliacao);
		
		JCheckBox ckDemonstracao = new JCheckBox("Demonstra\u00E7\u00E3o");
		ckDemonstracao.setBounds(506, 141, 125, 23);
		panel.add(ckDemonstracao);
		ckDemonstracao.setName("Demonstracao");
		checkBoxesRecursos.add(ckDemonstracao);
		
		JCheckBox ckExercicio = new JCheckBox("Exerc\u00EDcio");
		ckExercicio.setBounds(506, 184, 97, 23);
		panel.add(ckExercicio);
		ckExercicio.setName("Exercicio");
		checkBoxesRecursos.add(ckExercicio);
		
		JCheckBox ckGrafico = new JCheckBox("Gr\u00E1fico");
		ckGrafico.setBounds(506, 221, 97, 23);
		panel.add(ckGrafico);
		ckGrafico.setName("Grafico");
		checkBoxesRecursos.add(ckGrafico);
		
		JCheckBox ckNarracao = new JCheckBox("Narra\u00E7\u00E3o");
		ckNarracao.setBounds(10, 265, 97, 23);
		panel.add(ckNarracao);
		ckNarracao.setName("Narracao");
		checkBoxesRecursos.add(ckNarracao);
		
		JCheckBox ckPaginaWeb = new JCheckBox("P\u00E1gina Web");
		ckPaginaWeb.setBounds(235, 265, 97, 23);
		panel.add(ckPaginaWeb);
		ckPaginaWeb.setName("PaginaWeb");
		checkBoxesRecursos.add(ckPaginaWeb);
		
		JCheckBox ckPalestra = new JCheckBox("Palestra");
		ckPalestra.setBounds(506, 265, 97, 23);
		panel.add(ckPalestra);
		ckPalestra.setName("Palestra");
		checkBoxesRecursos.add(ckPalestra);
		
		JCheckBox ckSimulacao = new JCheckBox("Simula\u00E7\u00E3o");
		ckSimulacao.setBounds(10, 301, 97, 23);
		panel.add(ckSimulacao);
		ckSimulacao.setName("Simulacao");
		checkBoxesRecursos.add(ckSimulacao);
		
		JCheckBox ckSlide = new JCheckBox("Slide");
		ckSlide.setBounds(235, 301, 97, 23);
		panel.add(ckSlide);
		ckSlide.setName("Slide");
		checkBoxesRecursos.add(ckSlide);
		
		JCheckBox ckTabela = new JCheckBox("Tabela");
		ckTabela.setBounds(506, 301, 97, 23);
		panel.add(ckTabela);
		ckTabela.setName("Tabela");
		checkBoxesRecursos.add(ckTabela);
		
		JCheckBox ckDiagrama = new JCheckBox("Diagrama");
		ckDiagrama.setBounds(767, 141, 97, 23);
		panel.add(ckDiagrama);
		ckDiagrama.setName("Diagrama");
		checkBoxesRecursos.add(ckDiagrama);
		
		JCheckBox ckExperimento = new JCheckBox("Experimento");
		ckExperimento.setBounds(767, 184, 97, 23);
		panel.add(ckExperimento);
		ckExperimento.setName("Experimento");
		checkBoxesRecursos.add(ckExperimento);
		
		JCheckBox ckMapa = new JCheckBox("Mapa");
		ckMapa.setBounds(767, 221, 97, 23);
		panel.add(ckMapa);
		ckMapa.setName("Mapa");
		checkBoxesRecursos.add(ckMapa);
		
		JCheckBox ckQuestionario = new JCheckBox("Question\u00E1rio");
		ckQuestionario.setBounds(767, 265, 111, 23);
		panel.add(ckQuestionario);
		ckQuestionario.setName("Questionario");
		checkBoxesRecursos.add(ckQuestionario);
		
		JCheckBox ckVideo = new JCheckBox("V\u00EDdeo");
		ckVideo.setBounds(767, 301, 97, 23);
		panel.add(ckVideo);
		ckVideo.setName("Video");
		checkBoxesRecursos.add(ckVideo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 98, 579, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(16, 342, 600, 2);
		panel.add(separator_1);
		
		JLabel lblFormaDeExplorao = new JLabel("Forma de Explora\u00E7\u00E3o");
		lblFormaDeExplorao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFormaDeExplorao.setBounds(10, 355, 146, 14);
		panel.add(lblFormaDeExplorao);
		
		rbRede = new JRadioButton("Rede");
		rbRede.setBounds(172, 352, 109, 23);
		panel.add(rbRede);
		
		rbLinear = new JRadioButton("Linear");
		rbLinear.setBounds(297, 352, 109, 23);
		panel.add(rbLinear);
		
		bgFormaExploracao = new ButtonGroup();
		bgFormaExploracao.add(rbRede);
		bgFormaExploracao.add(rbLinear);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 380, 621, 4);
		panel.add(separator_2);
		
		JLabel lblOrdemDeDetalhamento = new JLabel("Ordem de Detalhamento");
		lblOrdemDeDetalhamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOrdemDeDetalhamento.setBounds(10, 395, 173, 14);
		panel.add(lblOrdemDeDetalhamento);
		
		rbEspecificoParaGeral = new JRadioButton("Espec\u00EDfico para Geral");
		rbEspecificoParaGeral.setBounds(212, 391, 194, 23);
		panel.add(rbEspecificoParaGeral);
		
		rbGeralParaEspecifico = new JRadioButton("Geral Para Espec\u00EDfico");
		rbGeralParaEspecifico.setBounds(423, 391, 208, 23);
		panel.add(rbGeralParaEspecifico);
		
		bgOrdemDetalhamento = new ButtonGroup();
		bgOrdemDetalhamento.add(rbGeralParaEspecifico);
		bgOrdemDetalhamento.add(rbEspecificoParaGeral);
		
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 420, 604, 2);
		panel.add(separator_3);
		
		JButton btnRetornarEstilos = new JButton("Retornar Estilos");
		btnRetornarEstilos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OrdemComposicao ordem = new OrdemComposicao();
				if (cmbOrdemComposicao.getSelectedIndex() > 0)
					ordem = new OrdemComposicao(cmbOrdemComposicao.getSelectedItem().toString());
				Estilos estilos = new Estilos();
				
				acionaBaseOrdemComposicao(ordem, estilos);
							
				acionaBaseRecursos(estilos);
					
				acionaBaseFormaExploracao(estilos);
				
				acionaBaseOrdemDetalhamento(estilos);
				
				System.out.println(estilos.toString());
				txtEstilo.setText(estilos.mostrarQtdes());
			}

			
		});
		btnRetornarEstilos.setBounds(64, 547, 139, 23);
		panel.add(btnRetornarEstilos);
	
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(235, 457, 671, 180);
		panel.add(scrollPane);

		
		NumberFormat nf = NumberFormat.getNumberInstance(); 
		nf.setMaximumIntegerDigits(Constantes.MAX_DIGITOS_TEXTRECURSOS);
		
		txtEstilo = new JTextArea();
		txtEstilo.setBounds(262, 494, 671, 180);
		scrollPane.setViewportView(txtEstilo);
		
		txtAnimacao = new JFormattedTextField(nf);
		txtAnimacao.setBounds(117, 141, 32, 20);
		panel.add(txtAnimacao);
		txtAnimacao.setColumns(10);
		map.put(ckAnimacao, txtAnimacao);
		
		txtEsquema = new JFormattedTextField(nf);
		txtEsquema.setColumns(10);
		txtEsquema.setBounds(117, 184, 32, 20);
		panel.add(txtEsquema);
		map.put(ckEsquema, txtEsquema);
		
		txtFigura = new JFormattedTextField(nf);
		txtFigura.setColumns(10);
		txtFigura.setBounds(117, 221, 32, 20);
		panel.add(txtFigura);
		map.put(ckFigura, txtFigura);
		
		txtNarracao = new JFormattedTextField(nf);
		txtNarracao.setColumns(10);
		txtNarracao.setBounds(117, 265, 32, 20);
		panel.add(txtNarracao);
		map.put(ckNarracao, txtNarracao);
		
		txtSimulacao = new JFormattedTextField(nf);
		txtSimulacao.setColumns(10);
		txtSimulacao.setBounds(117, 301, 32, 20);
		panel.add(txtSimulacao);
		map.put(ckSimulacao, txtSimulacao);
		
		txtAutoAvaliacao = new JFormattedTextField(nf);
		txtAutoAvaliacao.setColumns(10);
		txtAutoAvaliacao.setBounds(392, 141, 32, 20);
		panel.add(txtAutoAvaliacao);
		map.put(ckAutoAvaliacao, txtAutoAvaliacao);
		
		txtExemplo = new JFormattedTextField(nf);
		txtExemplo.setColumns(10);
		txtExemplo.setBounds(392, 184, 32, 20);
		panel.add(txtExemplo);
		map.put(ckExemplo, txtExemplo);
		
		txtFoto = new JFormattedTextField(nf);
		txtFoto.setColumns(10);
		txtFoto.setBounds(392, 221, 32, 20);
		panel.add(txtFoto);
		map.put(ckFoto, txtFoto);
		
		txtPaginaWeb = new JFormattedTextField(nf);
		txtPaginaWeb.setColumns(10);
		txtPaginaWeb.setBounds(392, 265, 32, 20);
		panel.add(txtPaginaWeb);
		map.put(ckPaginaWeb, txtPaginaWeb);
		
		txtSlide = new JFormattedTextField(nf);
		txtSlide.setColumns(10);
		txtSlide.setBounds(392, 301, 32, 20);
		panel.add(txtSlide);
		map.put(ckSlide, txtSlide);
		
		txtDemonstracao = new JFormattedTextField(nf);
		txtDemonstracao.setColumns(10);
		txtDemonstracao.setBounds(667, 141, 32, 20);
		panel.add(txtDemonstracao);
		map.put(ckDemonstracao, txtDemonstracao);
		
		txtExercicio = new JFormattedTextField(nf);
		txtExercicio.setColumns(10);
		txtExercicio.setBounds(667, 184, 32, 20);
		panel.add(txtExercicio);
		map.put(ckExercicio, txtExercicio);
		
		txtGrafico = new JFormattedTextField(nf);
		txtGrafico.setColumns(10);
		txtGrafico.setBounds(667, 221, 32, 20);
		panel.add(txtGrafico);
		map.put(ckGrafico, txtGrafico);
		
		txtPalestra = new JFormattedTextField(nf);
		txtPalestra.setColumns(10);
		txtPalestra.setBounds(667, 265, 32, 20);
		panel.add(txtPalestra);
		map.put(ckPalestra, txtPalestra);
		
		txtTabela = new JFormattedTextField(nf);
		txtTabela.setColumns(10);
		txtTabela.setBounds(667, 301, 32, 20);
		panel.add(txtTabela);
		map.put(ckTabela, txtTabela);
		
		txtDiagrama = new JFormattedTextField(nf);
		txtDiagrama.setColumns(10);
		txtDiagrama.setBounds(901, 144, 32, 20);
		panel.add(txtDiagrama);
		map.put(ckDiagrama, txtDiagrama);
		
		txtExperimento = new JFormattedTextField(nf);
		txtExperimento.setColumns(10);
		txtExperimento.setBounds(901, 187, 32, 20);
		panel.add(txtExperimento);
		map.put(ckExperimento, txtExperimento);
		
		txtMapa = new JFormattedTextField(nf);
		txtMapa.setColumns(10);
		txtMapa.setBounds(901, 224, 32, 20);
		panel.add(txtMapa);
		map.put(ckMapa, txtMapa);
		
		txtQuestionario = new JFormattedTextField(nf);
		txtQuestionario.setColumns(10);
		txtQuestionario.setBounds(901, 268, 32, 20);
		panel.add(txtQuestionario);
		map.put(ckQuestionario, txtQuestionario);
		
		txtVideo = new JFormattedTextField(nf);
		txtVideo.setColumns(10);
		txtVideo.setBounds(901, 304, 32, 20);
		panel.add(txtVideo);
		map.put(ckVideo, txtVideo);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), panel, cmbOrdemComposicao, lblOrdemDeComposio, lblRecursos, ckAnimacao, ckEsquema, ckFigura, ckExemplo, ckFoto, ckAutoAvaliacao, ckDemonstracao, ckExercicio, ckGrafico, ckNarracao, ckPaginaWeb, ckPalestra, ckSimulacao, ckSlide, ckTabela, ckDiagrama, ckExperimento, ckMapa, ckQuestionario, ckVideo, separator, separator_1, lblFormaDeExplorao, rbRede, rbLinear, separator_2, lblOrdemDeDetalhamento, rbEspecificoParaGeral, rbGeralParaEspecifico, separator_3, btnRetornarEstilos, scrollPane, txtEstilo, txtAnimacao, txtEsquema, txtFigura, txtNarracao, txtSimulacao, txtAutoAvaliacao, txtExemplo, txtFoto, txtPaginaWeb, txtSlide, txtDemonstracao, txtExercicio, txtGrafico, txtPalestra, txtTabela, txtDiagrama, txtExperimento, txtMapa, txtQuestionario, txtVideo}));
		
	}
	
	public void acionaBaseRecursos(Estilos estilos){ 
	
	for (JCheckBox jcb : checkBoxesRecursos) {
		
		String className = jcb.getName();
		
		if (jcb.isSelected()){
			int i = 1;
			try{
				i = Integer.parseInt((map.get(jcb)).getText());
			} catch (NumberFormatException e){
				i = 1;
			} 
			
			if (i <= 0) i = 1;
			
			for (int j = 0; j < i; j++) {
				
				Class<?> c = null;
				try {
					c = Class.forName("estilo.recursos."+className);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Constructor<?> cons = null;
				try {
					cons = c.getConstructor();
				} catch (NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Object object = cons.newInstance();
				
				RecursoEstilo recurso = null;
				try {
					recurso = (RecursoEstilo)cons.newInstance();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				RecursosKB recursosKB = new RecursosKB();
				recursosKB.tell(estilos);
				recursosKB.tell(recurso);
				recursosKB.run();
				System.out.println("após " + className + " " + j + ": \n" + estilos.toString());
				
				
			}
		}
	}
	
	}
	
	public void acionaBaseFormaExploracao(Estilos estilos) {
		//forma exploracao
		if(rbRede.isSelected()){
			FormaExploracao forma = new FormaExploracao("Rede");
			FormaExploracaoKB formaExploracaoKB = new FormaExploracaoKB();
			formaExploracaoKB.tell(estilos);
			formaExploracaoKB.tell(forma);
			formaExploracaoKB.run();
			System.out.println("após Forma Rede: \n" + estilos.toString());
		} else if (rbLinear.isSelected()){
			FormaExploracao forma = new FormaExploracao("Linear");
			FormaExploracaoKB formaExploracaoKB = new FormaExploracaoKB();
			formaExploracaoKB.tell(estilos);
			formaExploracaoKB.tell(forma);
			formaExploracaoKB.run();
			System.out.println("após Forma Linear: \n" + estilos.toString());					
		}
	}
	
	public void acionaBaseOrdemDetalhamento(Estilos estilos) {
		//ordem detalhamentp
		if(rbEspecificoParaGeral.isSelected()) {
			OrdemDetalhamento ordemDet = new OrdemDetalhamento("Específico Para Geral");
			OrdemDetalhamentoKB ordemKB = new OrdemDetalhamentoKB();
			ordemKB.tell(estilos);
			ordemKB.tell(ordemDet);
			ordemKB.run();
			System.out.println("após Ordem Esp p Geral: \n" + estilos.toString());
		} else if (rbGeralParaEspecifico.isSelected()) {
			OrdemDetalhamento ordemDet = new OrdemDetalhamento("Geral Para Específico");
			OrdemDetalhamentoKB ordemKB = new OrdemDetalhamentoKB();
			ordemKB.tell(estilos);
			ordemKB.tell(ordemDet);
			ordemKB.run();
			System.out.println("após Geral p Esp: \n" + estilos.toString());					
		}
	}


	public void acionaBaseOrdemComposicao(OrdemComposicao ordem, Estilos estilos) {
		OrdemComposicaoKB ordemComposicaoKB = new OrdemComposicaoKB();
		ordemComposicaoKB.tell(estilos);
		ordemComposicaoKB.tell(ordem);
		ordemComposicaoKB.run();
		System.out.println("após Ordem Composição \"" + ordem.getNomeOrdemComposicao() + "\": \n" + estilos.toString());
	}


}
