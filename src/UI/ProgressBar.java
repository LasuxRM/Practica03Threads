package UI;

import Threads.Client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame{
	
	private JButton			b1;
    private JButton			b2;
    private JButton			b3;
    private JProgressBar	jbar1;
    private JProgressBar	jbar2;
    private JProgressBar	jbar3;
    private JProgressBar	jbar4;
    private JLabel			jLabel1;
    private JLabel			jLabel2;
    private JLabel			jLabel3;
	
    public ProgressBar(Client cli) {
    	//Definiendo título de la ventana
		setTitle("Práctica 03 Threads & UI");
		
		initComponents(cli);
		
	}
	
	private void initComponents(Client cli) {

        b1		= new JButton();
        b2		= new JButton();
        b3		= new JButton();
        jbar1	= new JProgressBar();
        jbar2	= new JProgressBar();
        jbar3	= new JProgressBar();
        jbar4	= new JProgressBar();
        jLabel1	= new JLabel();
        jLabel2	= new JLabel();
        jLabel3	= new JLabel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jLabel1.setText("Ventanilla01");
        jLabel2.setText("Ventanilla02");
        jLabel3.setText("Ventanilla03");

        b1.setText("Start");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt1) {
            	BTN_Action1(evt1, cli);
            }
        });
        jbar1.setStringPainted(true);
        
        b2.setText("Reboot");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt2) {
            	BTN_Action2(evt2);
            }
        });
        jbar2.setStringPainted(true);
        
        b3.setText("Stop");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt3) {
            	BTN_Action3(evt3);
            }
        });
        jbar3.setStringPainted(true);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jbar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b1)
                            .addGap(310, 310, 310)
                            .addComponent(b3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jbar1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                    .addGap(384, 384, 384))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(301, 301, 301)
                                    .addComponent(jbar3, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jbar2, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jLabel1)
                    .addGap(245, 245, 245)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(98, 98, 98))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbar1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jbar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(247, 247, 247)
                    .addComponent(jbar4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b3)
                        .addComponent(b2)
                        .addComponent(b1))
                    .addContainerGap())
            );
        pack();
    }
	
	private void BTN_Action1(ActionEvent event1, Client cli) {
		GoAhead ga1 = new GoAhead();
		ga1.setBarra(jbar1);
		
		Thread hilo1 = new Thread(ga1);
		hilo1.start();
	}
	private void BTN_Action2(ActionEvent event2) {
		GoAhead ga2 = new GoAhead();
		ga2.setBarra(jbar2);
		
		Thread hilo2 = new Thread(ga2);
		hilo2.start();
	}
	private void BTN_Action3(ActionEvent event3) {
		GoAhead ga3 = new GoAhead();
		ga3.setBarra(jbar3);
		
		Thread hilo3 = new Thread(ga3);
		hilo3.start();
	}
	
	

}
