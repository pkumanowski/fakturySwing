package com.swingtut;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String dane;
	private String nip;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String dane, String nip) {
		super(source);

		this.dane = dane;
		this.nip = nip;
	}

	public String getDane() {
		return dane;
	}

	public void setDane(String dane) {
		this.dane = dane;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

}
