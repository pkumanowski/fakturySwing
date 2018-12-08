package com.swingtut;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class DodajKontrahentaDialog extends JFrame {

	private JButton zapiszKontrahenta;
	private JLabel dane;
	private JLabel nip;
	private JTextField poleDanych;
	private JTextField poleNIP;

	public DodajKontrahentaDialog() {

		pack();
		setSize(400, 300);
		setVisible(true);
		zapiszKontrahenta = new JButton("Zapisz");

		zapiszKontrahenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dane = poleDanych.getText();
				String nip = poleNIP.getText();

				FormEvent ev = new FormEvent(this, dane, nip);

			}
		});

		dane = new JLabel("Dane Kontahenta: ");
		nip = new JLabel("NIP: ");
		poleDanych = new JTextField(10);
		poleNIP = new JTextField(10);

		setLayout(new GridBagLayout());

//		add(dane, constraints);
//		add(zapiszKontrahenta, BorderLayout.SOUTH);

		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 1;
		gc.weighty = 1;

		// first row

		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;

		add(dane, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleDanych, gc);

		// second row

		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(nip, gc);

		gc.gridy = 1;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleNIP, gc);

		// third row

		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(zapiszKontrahenta, gc);

	}

}
