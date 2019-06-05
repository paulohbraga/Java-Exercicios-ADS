package exercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteOCpf;
	private JLabel lblVerificadorDeCpf;
	private JLabel lblIsvalid;

	private void mudarTexto() {
		lblIsvalid.setText("Válido");
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
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
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtDigiteOCpf = new JTextField();
		txtDigiteOCpf.setBounds(58, 106, 177, 26);
		panel.add(txtDigiteOCpf);
		txtDigiteOCpf.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudarTexto();
			}


		});
		btnNewButton.setBounds(247, 106, 117, 29);
		panel.add(btnNewButton);
		
		lblVerificadorDeCpf = new JLabel("Verificador de CPF");
		lblVerificadorDeCpf.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblVerificadorDeCpf.setBounds(134, 8, 144, 20);
		panel.add(lblVerificadorDeCpf);
		
		lblIsvalid = new JLabel("");
		lblIsvalid.setBounds(185, 177, 61, 16);
		panel.add(lblIsvalid);
	}
}
