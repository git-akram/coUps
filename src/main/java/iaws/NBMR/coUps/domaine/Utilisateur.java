package iaws.NBMR.coUps.domaine;
/**
 * Class qui représente les utilisateurs dans l'application coUps
 * @author NBMR
 */
public class Utilisateur {

	private String email;
	private String nom;
	private String prenom;
	private String adresse;
	private Coordonnees coordonnees;
	
	/**
	 * Méthode qui permet de récupérer les emails des utilisateurs
	 * @return l'email de l'utilisateur
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Méthode qui permet de modifier les emails des utilisateurs
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Méthode qui permet de récupérer les noms des utilisateurs
	 * @return le nom de l'utilisateur
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Méthode qui permet de modifier les noms des utilisateurs
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Méthode qui permet de récupérer les prénoms des utilisateurs
	 * @return le prénom de l'utilisateur
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * Méthode qui permet de modifier les prénoms des utilisateurs
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Méthode qui permet de récupérer les adresses postales des utilisateurs
	 * @return l'addresse postale de l'utilisateur
	 */
	public String getAdressePostale() {
		return adresse;
	}
	/**
	 * Méthode qui permet de modifier les adresses postales des utilisateurs
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Méthode qui permet de récupérer les coordonnées des utilisateurs
	 * @return les coordonnées de l'utilisateur
	 */
	public Coordonnees getCoordonnees() {
		return coordonnees;
	}
	/**
	 * Méthode qui permet de modifier les coordonnées des utilisateurs
	 * @param coordonnees
	 */
	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}
}
