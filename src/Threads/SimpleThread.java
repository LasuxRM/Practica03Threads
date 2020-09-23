package Threads;

import UI.Window;

public class SimpleThread extends Thread{
	
	public SimpleThread (String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
		}
	}

	public static void main(String[] args) {
		int alta=100;
		int baja=0;
		
		//Instanciando Window
		Window W1 = new Window();
		
		
		W1.setVisible(true);
		
		
		SimpleThread h1 =new SimpleThread("Juan");
		SimpleThread h2 =new SimpleThread("María");
		
		//implementar priority con yeld
		h1.setPriority(MAX_PRIORITY);
		h2.setPriority(MIN_PRIORITY);
		
		h1.start();
		h2.start();
		
		
	}
}
