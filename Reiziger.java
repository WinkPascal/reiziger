package reiziger;

import java.util.Date;

public class Reiziger {
	private String naam;
	private Date gbdatum;

	public Reiziger() {
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Date getGBdatum() {
		return gbdatum;
	}

	public void setGBdatum(String datum) {
		gbdatum = java.sql.Date.valueOf(datum);
	}
}
