package gui;
import semana_01.Equipo;
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

public class Propuesto_1_5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scp;
	private JTextArea txtS;
	
	//Variables globales
	int codigo;
	double precioDolares,precioSoles,precioEuros;
	String marca,color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_1_5 frame = new Propuesto_1_5();
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
	public Propuesto_1_5() {
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
		
		scp = new JScrollPane();
		scp.setBounds(0, 25, 434, 236);
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
		Equipo a;
		a = new Equipo();
		
		codigo = a.codigo = 653;
		marca = a.marca = "Samsung";
		color = a.color = "Marrón";
		precioDolares = a.precioDolares = 12;
		precioSoles = a.precioEquipoSoles();
		precioEuros = a.precioEquipoEuros();
		
		mostrarResultados();
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
	
	void mostrarResultados() {
		txtS.setText("");
		imprimir("Código: "+codigo);
		imprimir("Marca: "+marca);
		imprimir("Color: "+color);
		imprimir("Precio en dolares: "+precioDolares);
		imprimir("Precio en soles: "+precioSoles);
		imprimir("Precio en euros: "+precioEuros);
	}
}
