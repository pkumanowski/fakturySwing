package com.swingtut;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

	private static final Frame Frame = null;
	private JButton utwórzFakturę;
	private JButton wyswietlHistorie;
	private JButton dodajKontrahenta;

	public Toolbar() {
		utwórzFakturę = new JButton("Utwórz Fakturę");
		wyswietlHistorie = new JButton("Wyświetl Historię");
		dodajKontrahenta = new JButton("Dodaj Kontrahenta");

		utwórzFakturę.addActionListener(this);
		dodajKontrahenta.addActionListener(this);
		wyswietlHistorie.addActionListener(this);

		setLayout(new FlowLayout());

		add(dodajKontrahenta);
		add(utwórzFakturę);
		add(wyswietlHistorie);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();

		if (clicked == dodajKontrahenta) {
			DodajKontrahentaDialog dialog = new DodajKontrahentaDialog();

		}
		if (clicked == utwórzFakturę) {
			FakturyDialog dialog = new FakturyDialog();

		}
		if (clicked == wyswietlHistorie) {
			WyświetlHistorieDialog dialog = new WyświetlHistorieDialog();

		}

	}
}
