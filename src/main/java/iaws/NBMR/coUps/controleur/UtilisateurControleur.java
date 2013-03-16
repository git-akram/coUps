package iaws.NBMR.coUps.controleur;

import java.util.ArrayList;

import iaws.NBMR.coUps.domaine.Utilisateur;

/**.
 * Cette Classe permet d'implémenter les services fournis par l'application coUps
 * @author NBMR
 */
public class UtilisateurControleur {
	
	/**.
	 * Méthode qui permet à un utilisateur de s'inscrire à coUps
	 * @param ut
	 * @return true si l'inscription a été exécuté avec succès et false si l'inscription a échoué
	 */
	public boolean inscrire(Utilisateur ut){
		return true;
	}
	/**.
	 * Méthode qui permet de chercher la liste des voisins à l'aide des services OSM
	 * @param idUtilisateur
	 * @return une liste d'utilisateurs voisins
	 */
	public ArrayList<Utilisateur> localiserVoisins(int idUtilisateur){
		ArrayList<Utilisateur> voisins=new ArrayList<Utilisateur>();
		
		return voisins;
	}
}
