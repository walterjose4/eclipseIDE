//Ejercicio_propuesto_1.java
package gui;
import semana_02.Celular;
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

public class Ejercicio_propuesto_1 extends JFrame implements ActionListener {

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
					Ejercicio_propuesto_1 frame = new Ejercicio_propuesto_1();
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
	public Ejercicio_propuesto_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(166, 0, 89, 23);
		contentPane.add(btnProcesar);
		scp.setBounds(0, 30, 434, 231);
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
		Celular a;
		a = new Celular(983387630,856,2,"Walter Jose Cañapataña Vargas");
		listado(a);
		
		a.setSegundosConsumidos(a.getSegundosConsumidos()+20);
		a.setPrecioPorSegundo(a.getPrecioPorSegundo()-0.05*a.getPrecioPorSegundo());
		
		listado(a);
	}
	
	void listado(Celular x) {
		imprimir("Dirección de memoria: "+x);
		imprimir("Número: "+x.getNumero());
		imprimir("Segundos consumidos: "+x.getSegundosConsumidos());
		imprimir("Precio por segundo: S/"+x.getPrecioPorSegundo());
		imprimir("Usuario: "+x.getUsuario());
		imprimir("Costo por consumo: S/"+x.costoPorConsumo());
		imprimir("Impuesto: S/"+x.impuesto());
		imprimir("Total a pagar: S/"+x.totalPagar());
		imprimir("--------------------------");
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
