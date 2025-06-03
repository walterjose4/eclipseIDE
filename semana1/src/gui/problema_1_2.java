package gui;

import semana_01.Filmacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class problema_1_2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnprocesar;
	private JButton btnborrar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtcodigo;
	private JTextField txtTitulo;
	private JTextField txtduracion;
	private JTextField txtprecioSoles;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema_1_2 frame = new problema_1_2();
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
	public problema_1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(this);
		btnprocesar.setBounds(345, 0, 89, 23);
		contentPane.add(btnprocesar);
		
		btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(this);
		btnborrar.setBounds(345, 28, 89, 23);
		contentPane.add(btnborrar);
		
		lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(10, 4, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("T\u00EDtulo:");
		lblNewLabel_1.setBounds(10, 32, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Duraci\u00F3n:");
		lblNewLabel_2.setBounds(10, 57, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Precio S/:");
		lblNewLabel_3.setBounds(10, 82, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(78, 1, 86, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(78, 29, 86, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtduracion = new JTextField();
		txtduracion.setBounds(78, 54, 86, 20);
		contentPane.add(txtduracion);
		txtduracion.setColumns(10);
		
		txtprecioSoles = new JTextField();
		txtprecioSoles.setBounds(78, 79, 86, 20);
		contentPane.add(txtprecioSoles);
		txtprecioSoles.setColumns(10);
		
		scp = new JScrollPane();
		scp.setBounds(0, 101, 434, 160);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnborrar) {
			actionPerformedBtnborrar(e);
		}
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		Filmacion objeto=new Filmacion();
		int codigo=objeto.codigo=Integer.parseInt(txtcodigo.getText());
		String titulo=objeto.titulo=txtTitulo.getText();
		int duracionMinutos=objeto.duracionMinutos=Integer.parseInt(txtduracion.getText());
		double precioSoles=objeto.precioSoles=Double.parseDouble(txtprecioSoles.getText());
		
		imprimir("Código: "+codigo);
		imprimir("Título: "+titulo);
		imprimir("Duración: "+duracionMinutos);
		imprimir("Precio: "+precioSoles);
		imprimir("Precio en dolares: "+objeto.precioVideoDolares());
	}
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
	protected void actionPerformedBtnborrar(ActionEvent e) {
		txtcodigo.setText("");
		txtTitulo.setText("");
		txtduracion.setText("");
		txtprecioSoles.setText("");
		txtS.setText("");
		txtcodigo.requestFocus();
	}
}
