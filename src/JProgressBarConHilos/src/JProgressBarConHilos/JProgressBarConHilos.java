package JProgressBarConHilos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JProgressBarConHilos extends JFrame {

	private JPanel contentPane;
	JProgressBar BarMustang;
	JProgressBar BarFerrari;

	HiloMustang miHiloMustang;
	HiloFerrari miHiloFerrari;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarConHilos frame = new JProgressBarConHilos();
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
	public JProgressBarConHilos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miHiloMustang = new HiloMustang(BarMustang);
				Thread hM = new Thread(miHiloMustang,"Mustang");
				hM.start();
				miHiloFerrari = new HiloFerrari(BarFerrari);
				Thread hF = new Thread(miHiloFerrari,"Ferrari");
				hF.start();
				BarMustang.setForeground(Color.BLUE);
				BarFerrari.setForeground(Color.BLUE);
				
			}
		});
		btnIniciar.setBounds(36, 120, 89, 23);
		contentPane.add(btnIniciar);
		
		BarFerrari = new JProgressBar();
		BarFerrari.setBounds(94, 57, 280, 26);
		contentPane.add(BarFerrari);
		
		JLabel lblMustang = new JLabel("Mustang:");
		lblMustang.setBounds(10, 20, 56, 14);
		contentPane.add(lblMustang);
		
		JLabel lblFerrari = new JLabel("Ferrari:");
		lblFerrari.setBounds(10, 57, 46, 14);
		contentPane.add(lblFerrari);
		
		BarMustang = new JProgressBar();
		BarMustang.setBounds(94, 20, 280, 23);
		contentPane.add(BarMustang);
	}
}
