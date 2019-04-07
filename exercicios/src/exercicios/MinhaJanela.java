package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;

public class MinhaJanela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private int quadrado = 2;
	private JLabel labelX1 = new JLabel("X1:");
	private JLabel labelX2 = new JLabel("X2:");
	private JLabel lblNewLabel;
	private JLabel message;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela frame = new MinhaJanela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MinhaJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double c = Double.parseDouble(txtC.getText());
				
				double delta = Math.pow(b, quadrado) - 4*(a*c);
				
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				if (delta < 0) {
					message.setText("Delta negativo, não existem raízes reais");
					
					labelX1.setText("X1: Não real ");
					labelX2.setText("X2: Não real");
					
				} else if (delta == 0) {
					message.setText("Delta = 0, entao temos 2 raízes iguais");
					
					labelX1.setText("X1: " + Double.toString(x1));
					labelX2.setText("X2: " + Double.toString(x2));
				} else {
					message.setText("Delta positivo, as raízes são diferentes");
					
					labelX1.setText("X1: " + Double.toString(x1));
					labelX2.setText("X2: " + Double.toString(x2));
					
				}
				
			}
		});
		btnNewButton.setBounds(166, 243, 117, 29);
		contentPane.add(btnNewButton);
		
		txtA = new JTextField("0");
		txtA.setBounds(40, 92, 100, 29);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setText("0");
		txtB.setBounds(178, 92, 93, 29);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setText("0");
		txtC.setBounds(317, 92, 93, 28);
		contentPane.add(txtC);
		txtC.setColumns(10);
		labelX1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		labelX1.setBounds(166, 133, 105, 26);
		contentPane.add(labelX1);
		
		lblNewLabel = new JLabel("Equação do 2º grau");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(123, 31, 203, 25);
		contentPane.add(lblNewLabel);
		
		labelX2 = new JLabel("X2:");
		labelX2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		labelX2.setBounds(166, 156, 105, 26);
		contentPane.add(labelX2);
		
		message = new JLabel("");
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		message.setBounds(64, 194, 322, 16);
		contentPane.add(message);
		
		table = new JTable();
		table.setBounds(66, 212, 27, -12);
		contentPane.add(table);
	}
}
