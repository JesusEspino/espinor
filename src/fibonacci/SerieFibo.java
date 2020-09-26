package fibonacci;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SerieFibo extends JFrame {

	private JPanel frmFibonacci;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieFibo frame = new SerieFibo();
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
	public SerieFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 300);
		frmFibonacci = new JPanel();
		frmFibonacci.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmFibonacci);
		frmFibonacci.setLayout(null);
		
		JComboBox cboResultados = new JComboBox();
		cboResultados.setBounds(26, 131, 137, 22);
		frmFibonacci.add(cboResultados);
		
		JButton btnGenerarSerie = new JButton("Generar Serie");
		btnGenerarSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0,intValor1 = 0,intValor2 = 0,intIteraciones = 0,intSuma = 0;
				
				intValor1 = Integer.parseInt(txtValor1.getText());
				intValor2 = Integer.parseInt(txtValor2.getText());
				intIteraciones = Integer.parseInt(txtIteraciones.getText());
				do
				{
					i = i + 1;
					intSuma = intValor1 + intValor2;
					cboResultados.addItem(Integer.toString(intSuma));
					intValor1 = intValor2;
					intValor2 = intSuma;
					
				}while(i <= intIteraciones);			
			}
		});
		btnGenerarSerie.setBounds(46, 191, 137, 23);
		frmFibonacci.add(btnGenerarSerie);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(141, 71, 1, 1);
		frmFibonacci.add(desktopPane);
		
		JLabel lblValor1 = new JLabel("Valor 1:");
		lblValor1.setBounds(65, 11, 46, 14);
		frmFibonacci.add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Valor 2:");
		lblValor2.setBounds(65, 50, 46, 14);
		frmFibonacci.add(lblValor2);
		
		JLabel lblNumDeIteraciones = new JLabel("Num de iteraciones:");
		lblNumDeIteraciones.setBounds(10, 94, 101, 14);
		frmFibonacci.add(lblNumDeIteraciones);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(119, 8, 64, 20);
		frmFibonacci.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(119, 47, 64, 20);
		frmFibonacci.add(txtValor2);
		txtValor2.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(119, 91, 64, 20);
		frmFibonacci.add(txtIteraciones);
		txtIteraciones.setColumns(10);
	}
}
