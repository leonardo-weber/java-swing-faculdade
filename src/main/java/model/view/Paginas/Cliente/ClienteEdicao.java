package model.view.Paginas.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

import com.github.lgooddatepicker.components.DatePicker;

import controller.CarroController;
import controller.ClienteController;
import model.vo.ClienteVO;

public class ClienteEdicao extends JPanel {
	
	private JTextField nameTextField;
	private JFormattedTextField phoneTextField;
	private JFormattedTextField cpfTextField;
	private JFormattedTextField cnhTextField;
	private DatePicker dataNascimentoDatePicker;
	
	private JLabel titleLabel;
	private JLabel nameLabel;
	private JLabel phoneLabel;
	private JLabel cpfLabel;
	private JLabel cnhLabel;
	private JLabel sexoLabel;
	private JLabel dataNascimentoLabel;
	
	private JButton cadastrarClienteButton;
	private JButton btnLimparCampos;
	
	private JComboBox comboBoxSexo;
	
	private MaskFormatter mascaraCNH;
	private MaskFormatter mascaraCPF;
	private MaskFormatter mascaraTelefone;
	
	private JComboBox comboBoxClientesCadastrados;
	private JLabel lblClientesCadastrados;
	
	private List<ClienteVO> listaClientesCadastrados;
	private ClienteVO cliente;
	
	public void preencherCamposCliente () {
		nameTextField.setText(cliente.getNome());
		nameTextField.setText(cliente.getNome());
		nameTextField.setText(cliente.getNome());
		nameTextField.setText(cliente.getNome());
		nameTextField.setText(cliente.getNome());
	}
	
	public ClienteEdicao() {
		
		setBackground(UIManager.getColor("Button.darkShadow"));
		setLayout(null);
		
		ClienteController clienteController = new ClienteController();
		listaClientesCadastrados = clienteController.consultarListaClientes();
		
		comboBoxClientesCadastrados = new JComboBox(listaClientesCadastrados.toArray());
		comboBoxClientesCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxClientesCadastrados.setBounds(229, 68, 473, 24);
		add(comboBoxClientesCadastrados);
		
		lblClientesCadastrados = new JLabel("Clientes Cadastrados");
		lblClientesCadastrados.setBounds(26, 73, 154, 15);
		add(lblClientesCadastrados);

		titleLabel = new JLabel("Cadastro de Clientes");
		titleLabel.setBounds(26, 11, 149, 58);
		add(titleLabel);
		
		nameLabel = new JLabel("Nome");
		nameLabel.setBounds(26, 106, 70, 15);
		add(nameLabel);
		
		phoneLabel = new JLabel("Telefone");
		phoneLabel.setBounds(26, 265, 70, 15);
		add(phoneLabel);
		
		cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(26, 172, 70, 15);
		add(cpfLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(118, 104, 584, 19);
		add(nameTextField);
		nameTextField.setColumns(10);
		
		phoneTextField = new JFormattedTextField(mascaraTelefone);
		phoneTextField.setBounds(118, 263, 584, 19);
		phoneTextField.setColumns(10);
		add(phoneTextField);
		
		cpfTextField = new JFormattedTextField(mascaraCPF);
		cpfTextField.setBounds(118, 170, 584, 19);
		cpfTextField.setColumns(10);
		add(cpfTextField);
		
		cadastrarClienteButton = new JButton("Cadastrar Cliente");
		cadastrarClienteButton.setBounds(420, 388, 282, 25);
		cadastrarClienteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		cnhLabel = new JLabel("CNH");
		cnhLabel.setBounds(26, 137, 70, 15);
		add(cnhLabel);
		add(cadastrarClienteButton);
		
		cnhTextField = new JFormattedTextField(mascaraCNH);
		cnhTextField.setColumns(10);
		cnhTextField.setBounds(118, 135, 584, 19);
		add(cnhTextField);
				
		dataNascimentoDatePicker = new DatePicker();
		dataNascimentoDatePicker.setBounds(118, 232, 584, 19);
		add(dataNascimentoDatePicker);
		
		dataNascimentoLabel = new JLabel("Data Nascimento");
		dataNascimentoLabel.setBounds(26, 234, 70, 15);
		add(dataNascimentoLabel);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setBounds(118, 201, 584, 24);
		comboBoxSexo.setSelectedIndex(-1);
		add(comboBoxSexo);
		
		sexoLabel = new JLabel("Sexo");
		sexoLabel.setBounds(26, 203, 70, 15);
		add(sexoLabel);
		
		btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLimparCampos.setBounds(420, 351, 282, 25);
		add(btnLimparCampos);


	}

}