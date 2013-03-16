package iaws.NBMR.coUps.domaine;

public class Utilisateur {
	String nom;
	String prenom;
	String adrMail;
	String adrPostale;
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getAdrMail() {
		return adrMail;
	}
	public String getAdrPostale() {
		return adrPostale;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAdrMail(String adrMail) {
		this.adrMail = adrMail;
	}
	public void setAdrPostale(String adrPostale) {
		this.adrPostale = adrPostale;
	}
}
