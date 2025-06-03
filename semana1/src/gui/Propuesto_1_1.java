package gui;

import semana_01.Expositor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Propuesto_1_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private final JScrollPane scp = new JScrollPane();
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_1_1 frame = new Propuesto_1_1();
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
	public Propuesto_1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(181, 0, 89, 23);
		contentPane.add(btnProcesar);
		scp.setBounds(0, 23, 434, 238);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Expositor a;
		a = new Expositor();
		a.codigo=4;
		a.nombre="walter Jose Cañapataña Vargas";
		a.horasTrabajadas=40;
		a.tarifaHora=35;
		a.sueldoBruto();
		a.descuentoAfp();
		a.descuentoEps();
		a.sueldoNeto();
		
		mostrar(a.codigo,a.nombre,a.horasTrabajadas,a.tarifaHora,a.sueldoBruto(),a.descuentoAfp(),a.descuentoEps(),a.sueldoNeto());
	}
	void mostrar(int codigo, String nombre, int horasTrabajadas, double tarifaHora, double sueldoBruto, double descuentoAfp, double descuentoEps, double sueldoNeto) {
		txtS.setText("");
		imprimir("Código: "+codigo);
		imprimir("Nombres: "+nombre);
		imprimir("Horas trabajadas: "+horasTrabajadas);
		imprimir("Tarifa horaria: "+tarifaHora);
		imprimir("Sueldo bruto: "+sueldoBruto);
		imprimir("Descuento AFP: "+descuentoAfp);
		imprimir("Descuento EPS: "+descuentoEps);
		imprimir("Sueldo neto: "+sueldoNeto);
	}
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
