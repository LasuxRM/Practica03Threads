package UI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame{
	//Creando componentes
	private	JPanel		panel		= new JPanel();
	private	JLabel		label		= new JLabel();
	private	JButton		button		= new JButton();
	private	JTextField	textField	= new JTextField();
	
	//Inicializando	

	public Window () {
		//Definiendo tamaño de la ventana
		setSize(854, 480);
		
		//Definiendo título de la ventana
		setTitle("Práctica 03 Threads & UI");
		
		//Llamando a StartComponents
		StartComponents();
		
		//Finalizar el proceso cuando presionas la "X" en la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void StartComponents() {
		label.setText("Hello World");
		button.setText("Button");
		textField.setText("Text Field...");
		
		button.setEnabled(true);
		
		//Seteando características y ojetos en el panel
		panel.setBackground(Color.gray);
		
		//Agregando elementos a la ventana
		this.getContentPane().add(panel);
		panel.add(label);
		panel.add(button);
		panel.add(textField);
	}
}
