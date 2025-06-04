package gui;
import semana_03.Factura;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semana_03_Ejercicio_propuesto_1 extends JFrame implements ActionListener {

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
					Semana_03_Ejercicio_propuesto_1 frame = new Semana_03_Ejercicio_propuesto_1();
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
	public Semana_03_Ejercicio_propuesto_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(162, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		scp = new JScrollPane();
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
		Factura a;
		Factura b;
		Factura c;
		
		a = new Factura("4328","Sedapar",4,2.5);
		b = new Factura("9821","Netflix");
		c = new Factura();
		
		listado(a);
		listado(b);
		listado(c);
	}
	
	void listado(Factura x) {
		imprimir();
		imprimir("Memoria: "+x);
		imprimir("Ruc: "+x.getRuc());
		imprimir("Empresa: "+x.getEmpresa());
		imprimir("Unidades: "+x.getUnidades());
		imprimir("Precio Unitario: "+x.getPrecioUnitario());
		imprimir("Valor de la constante: "+Factura.CADENA);
		imprimir("Cantidad de objetos creados: "+Factura.getCantFacturas());
		imprimir("Suma de los importes facturados: "+Factura.getSumaImportes());
	}
	
	void imprimir (String cad) {
		txtS.append(cad+"\n");
	}
	
	void imprimir() {
		txtS.append("-----------------------------\n");
	}
}
