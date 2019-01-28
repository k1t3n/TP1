import java.util.ArrayList;

public class CV {

	
	String nom, prenom, formation, attente;
	int expTravail;
	ArrayList<String> competences = new ArrayList<String>();
	
	
	public void affiche() {
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Experiences de travail : " + expTravail);
		competences.forEach(competence -> {
			System.out.println("Competence : " + competence);
		});
		System.out.println("Attentes : " + attente);
	}
	
	
	
	
	
	
	
	
}
