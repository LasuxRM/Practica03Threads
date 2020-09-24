package UI;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import Threads.Client;

public class GoAhead implements Runnable{

	JProgressBar	barra;
	static int		num_bar	= 1;
	
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i++) {
			
			try {
				Thread.sleep(50);
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.getBarra().setValue(i);
			if (this.getBarra().getValue() == 100)
            {
                JOptionPane.showMessageDialog(new ProgressBar(null), "Terminó  de atender cliente N°: "+num_bar);
            }   
		}
		num_bar++;
	}

	public JProgressBar getBarra() {
		return barra;
	}

	public void setBarra(JProgressBar barra) {
		this.barra = barra;
	}
	
}
