package gui;

import semana_01.Docente;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtNombre;
	private JTextField txtHorasTrabajadas;
	private JTextField txtTarifaHoraria;
	private JScrollPane scp;
	private JTextArea txtS;
	private JButton btnBorrar;
	private JLabel lblNewLabel_3;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(345, 1, 89, 23);
		contentPane.add(btnProcesar);
		
		lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(10, 5, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("horas trabajadas");
		lblNewLabel_1.setBounds(10, 30, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("tarifa horaria");
		lblNewLabel_2.setBounds(10, 55, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(107, 2, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHorasTrabajadas = new JTextField();
		txtHorasTrabajadas.setBounds(107, 27, 86, 20);
		contentPane.add(txtHorasTrabajadas);
		txtHorasTrabajadas.setColumns(10);
		
		txtTarifaHoraria = new JTextField();
		txtTarifaHoraria.setBounds(107, 55, 86, 20);
		contentPane.add(txtTarifaHoraria);
		txtTarifaHoraria.setColumns(10);
		
		scp = new JScrollPane();
		scp.setBounds(10, 80, 401, 170);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(345, 35, 89, 23);
		contentPane.add(btnBorrar);
		
		lblNewLabel_3 = new JLabel("c\u00F3digo");
		lblNewLabel_3.setBounds(208, 5, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(258, 2, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
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
		Docente objeto = new Docente();
		objeto.codigo = Integer.parseInt(txtCodigo.getText());
		objeto.nombre = txtNombre.getText();
		objeto.horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
		objeto.tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
		imprimir("Codigo: "+objeto.codigo);
		imprimir("Nombre: "+objeto.nombre);
		imprimir("Horas trabajadas: "+objeto.horasTrabajadas);
		imprimir("Tarifa horaria: "+objeto.tarifaHoraria);
		imprimir("sueldo bruto: "+objeto.sueldoBruto());
		imprimir("Descuento: "+objeto.descuento());
		imprimir("Sueldo neto: "+objeto.sueldoNeto());
		
		System.out.println("Código: "+objeto.codigo);
		System.out.println("Nombre: "+objeto.nombre);
		System.out.println("Horas trabajadas: "+objeto.horasTrabajadas);
		System.out.println("Tarifa horaria: "+objeto.tarifaHoraria);
		System.out.println("Sueldo bruto: "+objeto.sueldoBruto());
		System.out.println("descuento: "+objeto.descuento());
		System.out.println("sueldo neto: "+objeto.sueldoNeto());
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtCodigo.setText("");
		txtNombre.setText("");
		txtHorasTrabajadas.setText("");
		txtTarifaHoraria.setText("");
		txtS.setText("");
		txtCodigo.requestFocus();
		
	}
	void imprimir(String s) {
		txtS.append(s+"\n");
	}
}
