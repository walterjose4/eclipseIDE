package gui;

import semana_01.Coordinador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_1_4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCelular;
	private JComboBox cboCategoria;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_4 frame = new Problema_1_4();
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
	public Problema_1_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(345, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(345, 34, 89, 23);
		contentPane.add(btnBorrar);
		
		lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(0, 4, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(0, 29, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Categor\u00EDa:");
		lblNewLabel_2.setBounds(0, 54, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("N\u00FAmero de celular:");
		lblNewLabel_3.setBounds(0, 79, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(113, 1, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(113, 26, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(113, 76, 86, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		cboCategoria = new JComboBox();
		cboCategoria.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2"}));
		cboCategoria.setBounds(113, 50, 86, 22);
		contentPane.add(cboCategoria);
		
		scp = new JScrollPane();
		scp.setBounds(0, 99, 434, 162);
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
		Coordinador objeto = new Coordinador();
		
		int codigo = objeto.codigo = Integer.parseInt(txtCodigo.getText());
		String nombre = objeto.nombre = txtNombre.getText();
		int categoria = objeto.categoria = cboCategoria.getSelectedIndex();
		int celular = objeto.celular = Integer.parseInt(txtCelular.getText());
		
		int sueldo = objeto.sueldo();
		
		txtS.setText("");
		imprimir("Código: "+codigo);
		imprimir("Nombre: "+nombre);
		imprimir("Categoría: "+categoria);
		imprimir("Celular: "+celular);
		imprimir("Sueldo"+sueldo);
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtCodigo.setText("");
		txtNombre.setText("");
		cboCategoria.setSelectedIndex(0);
		txtCelular.setText("");
		txtS.setText("");
		txtCodigo.requestFocus();
	}
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
