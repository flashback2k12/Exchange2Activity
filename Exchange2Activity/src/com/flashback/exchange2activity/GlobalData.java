package com.flashback.exchange2activity;

public class GlobalData {

	public static GlobalData gd = new GlobalData();
	
	private String Vorname;
	private String Nachname;

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	
}
