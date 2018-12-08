package com.swingtut;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;

public class WyświetlHistorieDialog extends JFrame {

	private JTextArea textArea;

	public WyświetlHistorieDialog() {

		setLayout(new BorderLayout());
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);

	}

}
