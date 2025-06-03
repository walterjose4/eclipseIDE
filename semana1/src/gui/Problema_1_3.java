package gui;

import semana_01.Persona;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_1_3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;
	private JTextField txtEstatura;
	private JTextField txtPeso;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_3 frame = new Problema_1_3();
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
	public Problema_1_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(0, 25, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setBounds(0, 50, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Estatura:");
		lblNewLabel_3.setBounds(159, 0, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Peso:");
		lblNewLabel_4.setBounds(159, 25, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(63, -3, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(63, 22, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(63, 47, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(225, -3, 86, 20);
		contentPane.add(txtEstatura);
		txtEstatura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(225, 22, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(345, -4, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(345, 21, 89, 23);
		contentPane.add(btnBorrar);
		
		scp = new JScrollPane();
		scp.setBounds(0, 75, 434, 186);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Persona objeto = new Persona();
		
		String nombre = objeto.nombre=txtNombre.getText();
		String apellido = objeto.apellido=txtApellido.getText();
		int edad = objeto.edad=Integer.parseInt(txtEdad.getText());
		double estatura = objeto.estatura=Double.parseDouble(txtEstatura.getText());
		double peso = objeto.peso=Double.parseDouble(txtPeso.getText());
		
		txtS.setText("");
		imprimir("Nombre: "+nombre);
		imprimir("Apellido: "+apellido);
		imprimir("Edad: "+edad);
		imprimir("Estatura: "+estatura);
		imprimir("Peso: "+peso);
		imprimir("Estado: "+objeto.estado());
		imprimir("IMC: "+objeto.imc());
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtNombre.setText("");
		txtApellido.setText("");
		txtEdad.setText("");
		txtEstatura.setText("");
		txtPeso.setText("");
		txtS.setText("");
		txtNombre.requestFocus();
	}
}
