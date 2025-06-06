//Semana03_ejercicio_propuesto_2.java
package gui;
import semana_03.Empleado;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semana03_ejercicio_propuesto_2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
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
					Semana03_ejercicio_propuesto_2 frame = new Semana03_ejercicio_propuesto_2();
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
	public Semana03_ejercicio_propuesto_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(179, 0, 89, 23);
		contentPane.add(btnProcesar);
		
		scp = new JScrollPane();
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
		Empleado a;
		Empleado b;
		Empleado c;
		
		a = new Empleado(1234,0,123456789,"Walter");
		b = new Empleado(5678,"Jose");
		c = new Empleado();
		
		listado(a);
		listado(b);
		listado(c);
		mostrarDatos();
	}
	
	public void listado(Empleado x) {
		imprimir("Codigo: "+x.getCodigo());
		imprimir("Categoria: "+x.getCategoria());
		imprimir("Número de celular: "+x.getNumeroCelular());
		imprimir("Nombre: "+x.getNombre());
		imprimir();
	}
	
	public void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
	public void imprimir() {
		txtS.append("\n");
	}
	
	public void mostrarDatos() {
		imprimir("Factor de descuento: "+Empleado.FACTOR_DESCUENTO);
		imprimir("Cantidad de objetos creados: "+Empleado.getContador());
		imprimir("Suma de los sueldos netos: "+Empleado.getSumaSueldosNetos());
	}
}
