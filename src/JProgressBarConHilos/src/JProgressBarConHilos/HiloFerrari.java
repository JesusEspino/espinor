package JProgressBarConHilos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloFerrari implements Runnable {
	
	JProgressBar barFerrari;
	int i;
	public HiloFerrari(JProgressBar barFerrari)
	{
		this.barFerrari = barFerrari;
		
	}
	
	

	public void run() {
		
		for(i = 0; i <= 100; i++)
		{
			barFerrari.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName()+" Ejecutandose");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		barFerrari.setForeground(Color.red);
		System.out.println("Proceso "+Thread.currentThread().getName()+" Ejecutandose");
	}

}
