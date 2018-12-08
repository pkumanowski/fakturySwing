package com.swingtut;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private Toolbar toolbar;
	

	public MainFrame() {
		super("Manager Faktur");
		setLayout(new BorderLayout());
		toolbar = new Toolbar();

		
		WyświetlHistorieDialog historia = new WyświetlHistorieDialog();
		add(toolbar, BorderLayout.NORTH);

//		historia.setFormListener(new FormListener()){
//			public void formEventOccured(FormEvent e) {
//				String dane = e.getDane();
//				String nip = e.getNip();
//			}
//		});
//		
		

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
