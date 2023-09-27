package programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class DadosVeiculo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	
    private JPanel clients;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosVeiculo window = new DadosVeiculo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DadosVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do veículo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 158, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChassi.setBounds(10, 44, 158, 14);
		frame.getContentPane().add(lblChassi);
		
		JLabel lblPesoBrutoTotalptb = new JLabel("Peso Bruto Total(PTB):");
		lblPesoBrutoTotalptb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoBrutoTotalptb.setBounds(10, 69, 168, 14);
		frame.getContentPane().add(lblPesoBrutoTotalptb);
		
		JLabel lblPesoDoSemireboque = new JLabel("Peso do Semi-reboque:");
		lblPesoDoSemireboque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDoSemireboque.setBounds(10, 94, 168, 14);
		frame.getContentPane().add(lblPesoDoSemireboque);
		
		JLabel lblOutrosEquipamentos = new JLabel("Outros equipamentos:");
		lblOutrosEquipamentos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOutrosEquipamentos.setBounds(10, 119, 158, 14);
		frame.getContentPane().add(lblOutrosEquipamentos);
		
		JLabel lblVelocidadeIda = new JLabel("Velocidade Ida:");
		lblVelocidadeIda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVelocidadeIda.setBounds(10, 144, 158, 14);
		frame.getContentPane().add(lblVelocidadeIda);
		
		JLabel lblVelocidadeVolta = new JLabel("Velocidade Volta:");
		lblVelocidadeVolta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVelocidadeVolta.setBounds(10, 169, 158, 14);
		frame.getContentPane().add(lblVelocidadeVolta);
		
		textField = new JTextField();
		textField.setBounds(182, 43, 207, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 68, 207, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 93, 207, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 119, 207, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 143, 207, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 168, 207, 20);
		frame.getContentPane().add(textField_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(51, 213, 306, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblDadosOperacionais = new JLabel("Dados operacionais:");
		lblDadosOperacionais.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosOperacionais.setBounds(10, 226, 158, 14);
		frame.getContentPane().add(lblDadosOperacionais);
		
		JLabel lblTempoDeCarga = new JLabel("Tempo de carga:");
		lblTempoDeCarga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTempoDeCarga.setBounds(10, 259, 158, 14);
		frame.getContentPane().add(lblTempoDeCarga);
		
		JLabel lblTempoDescarga = new JLabel("Tempo descarga:");
		lblTempoDescarga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTempoDescarga.setBounds(10, 284, 168, 14);
		frame.getContentPane().add(lblTempoDescarga);
		
		JLabel lblDistnciaIda = new JLabel("Distância ida:");
		lblDistnciaIda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistnciaIda.setBounds(10, 309, 168, 14);
		frame.getContentPane().add(lblDistnciaIda);
		
		JLabel lblDistnciaVolta = new JLabel("Distância volta:");
		lblDistnciaVolta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistnciaVolta.setBounds(10, 334, 158, 14);
		frame.getContentPane().add(lblDistnciaVolta);
		
		JLabel lblJornadatil = new JLabel("Jornada útil:");
		lblJornadatil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJornadatil.setBounds(10, 359, 158, 14);
		frame.getContentPane().add(lblJornadatil);
		
		JLabel lblTurnosDirios = new JLabel("Turnos diários:");
		lblTurnosDirios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTurnosDirios.setBounds(10, 384, 158, 14);
		frame.getContentPane().add(lblTurnosDirios);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(182, 383, 207, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(182, 358, 207, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 334, 207, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 308, 207, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(182, 283, 207, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(182, 258, 207, 20);
		frame.getContentPane().add(textField_11);
		

		
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(300, 579, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblDiasteis = new JLabel("Dias úteis:");
		lblDiasteis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiasteis.setBounds(10, 410, 158, 14);
		frame.getContentPane().add(lblDiasteis);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(182, 409, 207, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(182, 434, 207, 20);
		frame.getContentPane().add(textField_13);
		
		JLabel lblParadasManuteno = new JLabel("Paradas manutenção:");
		lblParadasManuteno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParadasManuteno.setBounds(10, 435, 158, 14);
		frame.getContentPane().add(lblParadasManuteno);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(10, 514, 158, 14);
		frame.getContentPane().add(lblTipo);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(182, 513, 207, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(182, 538, 207, 20);
		frame.getContentPane().add(textField_15);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidade.setBounds(10, 539, 158, 14);
		frame.getContentPane().add(lblQuantidade);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(51, 465, 306, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblDadosDaCarga = new JLabel("Dados da carga:");
		lblDadosDaCarga.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosDaCarga.setBounds(10, 478, 158, 14);
		frame.getContentPane().add(lblDadosDaCarga);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(178, 9, 211, 22);
		frame.getContentPane().add(comboBox);
	}
}
