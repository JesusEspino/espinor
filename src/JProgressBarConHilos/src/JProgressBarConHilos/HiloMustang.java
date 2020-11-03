package JProgressBarConHilos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloMustang implements Runnable {

	JProgressBar barMustang;
	int i;
	public HiloMustang(JProgressBar barMustang)
	{
		this.barMustang = barMustang;
		
	}
	
	

	public void run() {
		
		for(i = 0; i <= 100; i++)
		{
			barMustang.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName()+" Ejecutandose");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		barMustang.setForeground(Color.BLACK);
		System.out.println("Proceso "+Thread.currentThread().getName()+" Ejecutandose");
	}
	

}
