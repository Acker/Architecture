
public  class User {
	private int id;
	private String nom;
	private String prenom;
	private static int compteur=0;
	
	public User(String n, String p) {
		this.id=compteur;
		
		//on verifie que les parametres ne sont pas vides
		if(nom.isEmpty())
		{
			System.out.println("Erreur d'initialisation");
			this.nom="toto";
			this.prenom="toto";
		}
		else
			{
			this.nom=n;
			this.prenom=p;
			compteur ++;
			}
		
	}
	
public int getId() {
	
	return this.id;
}
public String getNom() {
	
	return this.nom;
}
public String getPrenom() {
	
	return this.prenom;
}


}
