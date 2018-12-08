package com.swingtut;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FakturyDialog extends JFrame {

	private JButton zapiszFakturę;
	private JLabel nazwa;
	private JLabel miara;
	private JLabel ilość;
	private JLabel cena;
	private JLabel podatek;
	private JTextField poleNazwy;
	private JTextField poleMiary;
	private JTextField poleIlości;
	private JTextField poleCeny;
	private JTextField polePodatku;

	public FakturyDialog() {
		zapiszFakturę = new JButton("Zapisz");

		pack();
		setSize(400, 300);
		setVisible(true);
		zapiszFakturę = new JButton("Zapisz");
		nazwa = new JLabel("Nazwa przedmiotu: ");
		miara = new JLabel("Miara: ");
		ilość = new JLabel("Ilość: ");
		cena = new JLabel("Cena: ");
		podatek = new JLabel("Podatek: ");
		poleNazwy = new JTextField(10);
		poleMiary = new JTextField(10);
		poleIlości = new JTextField(10);
		poleCeny = new JTextField(10);
		polePodatku = new JTextField(10);

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 1;
		gc.weighty = 1;

		// first row

		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;

		add(nazwa, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleNazwy, gc);

		// second row

		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(miara, gc);

		gc.gridy = 1;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleMiary, gc);

		// third row

		gc.gridy = 2;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ilość, gc);

		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleIlości, gc);

		// fourth row

		gc.gridy = 3;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(cena, gc);

		gc.gridy = 3;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(poleCeny, gc);

		// fifth row

		gc.gridy = 4;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(podatek, gc);

		gc.gridy = 4;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(polePodatku, gc);

		// sixth row

		gc.gridy = 6;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(zapiszFakturę, gc);

	}
}
