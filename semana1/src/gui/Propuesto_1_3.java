package gui;
import semana_01.Numeros;
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

public class Propuesto_1_3 extends JFrame implements ActionListener {

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
					Propuesto_1_3 frame = new Propuesto_1_3();
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
	public Propuesto_1_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(176, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		scp = new JScrollPane();
		scp.setBounds(0, 39, 434, 222);
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
		Numeros a;
		a = new Numeros();
		
		int numero1 = a.numero1 = 9;
		int numero2 = a.numero2 = 4;
		int numero3 = a.numero3 = 8;
		
		int menor = a.numeroMenor();
		int mayor = a.numeroMayor();
		int medio = a.numeroMedio();
		
		mostrarResultados(numero1,numero2,numero3,menor,mayor,medio);
	}
	
	void mostrarResultados(int numero1, int numero2, int numero3,int menor, int mayor, int medio) {
		txtS.setText("");
		imprimir("Número 1: "+numero1);
		imprimir("Número 2: "+numero2);
		imprimir("Número 3: "+numero3);
		imprimir("Número menor: "+menor);
		imprimir("Número mayor: "+mayor);
		imprimir("Número del medio: "+medio);
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
