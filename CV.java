import java.util.ArrayList;

public class CV {

	
	String nom, prenom, formation, attente;
	int expTravail;
	String[] competences;
	
	
	public CV(String nom, String prenom, String formation, String attente, int expTravail,
			String... competences) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.attente = attente;
		this.expTravail = expTravail;
		this.competences = competences;
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenue chez Barette!");
		ArrayList<CV> cvTable = new ArrayList<CV>();
		cvTable.add(new CV("Valiquette", "Yanick", "Cegep Montmorency", "Aucune attentes", 15, "Java PROFESSIONAL" )) ;
		cvTable.add(new CV("Velciov", "Michael", "Cegep Montmorency", "Aucune attentes", 16, "Java Expert"));
		cvTable.forEach(cv -> {
			cv.affiche();
		});
	}
	
	public void affiche() {
		System.out.println("\nNom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Experiences de travail : " + expTravail);
		for (String competence : competences) {
			System.out.println("Competence : " + competence);
		}
		System.out.println("Attentes : " + attente);
	}
	
	
	
	
	
	
	
	
}
