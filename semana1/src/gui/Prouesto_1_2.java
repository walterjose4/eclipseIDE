package gui;
import semana_01.Trabajador;
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

public class Prouesto_1_2 extends JFrame implements ActionListener {

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
					Prouesto_1_2 frame = new Prouesto_1_2();
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
	public Prouesto_1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 0, 89, 23);
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
		Trabajador a;
		a = new Trabajador();
		
		a.codigo = 66;
		a.nombre = "Walter Jose Cañapataña Vargas";
		a.horasTrabajadas = 8;
		a.tarifaHora = 40;
		
		a.sueldo();
		
		mostrarResultados(a.codigo,a.nombre,a.horasTrabajadas,a.tarifaHora,a.sueldo());
	}
	
	void mostrarResultados(int codigo,String nombre,int horas,double tarifa,double sueldo) {
		txtS.setText("");
		imprimir("Código: "+codigo);
		imprimir("Nombres: "+nombre);
		imprimir("Horas trabajadas: "+horas);
		imprimir("Tarifa por hora: "+tarifa);
		imprimir("Sueldo: "+sueldo);
	}
	
	void imprimir(String cad) {
		txtS.append(cad+"\n");
	}
}
