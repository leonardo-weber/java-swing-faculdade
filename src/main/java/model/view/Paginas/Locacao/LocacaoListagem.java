package model.view.Paginas.Locacao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import controller.LocacaoController;
import model.bo.LocacaoBO;
import model.vo.FuncionarioVO;
import model.vo.LocacaoVO;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LocacaoListagem extends JPanel {

	private JLabel titleLabel;
	private JButton btnPesquisar;
	private JButton btnDeletar;
	private JButton btnEditar;
	
	private JTable tabelaLocacao;
	private ArrayList<LocacaoVO> listaLocacoes; 
	private String[] colunasTabelas = { "Data Inicial", "Data Final", "Valor", "Cliente", "Carro" } ;
	
	LocacaoController locacaoController = new LocacaoController();
	
	private LocacaoVO locacaoSelecionada;
	
	private void inicializarTabela() {
		tabelaLocacao.setModel(new DefaultTableModel(new Object[][] { colunasTabelas, }, colunasTabelas));
	}
	
	private void popularTabelaFuncionarios() {	
		DefaultTableModel model = (DefaultTableModel) tabelaLocacao.getModel();
		for (LocacaoVO locacao : listaLocacoes) {
			Object[] novaLinhaDaTabela = new Object[colunasTabelas.length];
			novaLinhaDaTabela[0] = locacao.getData_inicio();
			novaLinhaDaTabela[1] = locacao.getData_fim();
			novaLinhaDaTabela[2] = locacao.getValor();
			novaLinhaDaTabela[3] = locacao.getCliente().getNome();
			novaLinhaDaTabela[4] = locacao.getCarro().getModelo();
			
			model.addRow(novaLinhaDaTabela);
		}
	}
	
	private boolean deletarFuncionario () {
		return locacaoController.excluirLocacao(locacaoSelecionada);
	}

	public LocacaoListagem() {
		
		setBackground(UIManager.getColor("Button.darkShadow"));
		setLayout(null);
		
		titleLabel = new JLabel("Listagem de locações");
		titleLabel.setBounds(26, 11, 646, 58);
		add(titleLabel);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					listaLocacoes = (ArrayList<LocacaoVO>) locacaoController.consultarListaLocacao();
					popularTabelaFuncionarios();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "erro");
				}
				
			}
		});
		btnPesquisar.setBounds(572, 375, 117, 25);
		add(btnPesquisar);
		
		tabelaLocacao = new JTable();
		tabelaLocacao.setBounds(26, 81, 663, 252);
		add(tabelaLocacao);
		
		btnDeletar = new JButton("Deletar");
		btnDeletar.setEnabled(false);
		btnDeletar.setBounds(443, 375, 117, 25);
		add(btnDeletar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		btnEditar.setBounds(314, 375, 117, 25);
		add(btnEditar);
		
		this.inicializarTabela();

	}

}
