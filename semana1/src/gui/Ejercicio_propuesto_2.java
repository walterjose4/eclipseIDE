package gui;
import semana_02.Computadora;
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

public class Ejercicio_propuesto_2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_propuesto_2 frame = new Ejercicio_propuesto_2();
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
	public Ejercicio_propuesto_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(170, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		scp = new JScrollPane();
		scp.setBounds(0, 31, 434, 230);
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
		Computadora a;
		a = new Computadora(435,3.54,"Huawei","gray");
		Computadora b=a;
		
		listado(b);
	}
	
	void listado(Computadora x) {
		txtS.setText("");
		impresion("Dirección en memoria: "+x);
		impresion("codigo: "+x.getCodigo());
		impresion("Precio en dolares: "+x.getDolares());
		impresion("Marca: "+x.getMarca());
		impresion("Color: "+x.getColor());
		impresion("Precio en soles: S/"+x.precioSoles());
		impresion("Precio en Euros : $/"+x.precioEuros());
	}
	
	void impresion(String cad) {
		txtS.append(cad+"\n");
	}
}
//This is a new line