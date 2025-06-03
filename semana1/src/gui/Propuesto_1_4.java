//Propuesto_1_4.java
package gui;
import semana_01.Caja;
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

public class Propuesto_1_4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scp;
	private JTextArea txtS;
	
	//Variables globales
	double largo,ancho,alto,peso,volumen,pesoVolumetrico,pesoFacturable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_1_4 frame = new Propuesto_1_4();
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
	public Propuesto_1_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(172, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		scp = new JScrollPane();
		scp.setBounds(0, 40, 434, 221);
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
		Caja a;
		a = new Caja();
		
		largo = a.largo=5;
		ancho = a.ancho=7;
		alto = a.alto=8;
		peso = a.peso=10;
		
		volumen = a.volumen();
		pesoVolumetrico = a.pesoVolumetrico();
		pesoFacturable = a.pesoFacturable();
		
		mostrarResultados();
	}
	
	void mostrarResultados(){
		txtS.setText("");
		imprimir("Largo: "+largo);
		imprimir("Ancho: "+ancho);
		imprimir("Alto: "+alto);
		imprimir("Peso: "+peso);
		imprimir("Volumen: "+volumen);
		imprimir("Peso volumétrico: "+pesoVolumetrico);
		imprimir("Peso facturable: "+pesoFacturable);
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
