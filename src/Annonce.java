import java.util.Date;
import java.util.List;


public class Annonce {
	private String Id_Annonce;
	private String Description;
	private int prix;
	private Date DateLimite;
	private int EtatAnnonce;
	private String IdVendeur;
	private int PrixReserve;
	private List<Acheteur> ListePersonneAnnonce;
	
	
	public Annonce(String id,String desc,int prix,Date date,int etat,String idvendeur,List <Acheteur> a) {
		this.Id_Annonce=id;
		this.Description=desc;
		this.prix = prix;
		this.DateLimite =date;
		this.EtatAnnonce =etat;
		this.IdVendeur=idvendeur;
		this.ListePersonneAnnonce =a;
	}
	
	public Annonce(String id,String desc,int prix,Date date,int etat,String idvendeur,List <Acheteur> a,int prixr) {
		this.Id_Annonce=id;
		this.Description=desc;
		this.prix = prix;
		this.DateLimite =date;
		this.EtatAnnonce =etat;
		this.IdVendeur=idvendeur;
		this.ListePersonneAnnonce =a;
		this.PrixReserve = prixr;
		
	}

	public int getPrix() {
		return prix;
	}
	public String getDesc() {
		
		return this.Description;
	}
	
	public Date getDateLimite() {
		return this.DateLimite;
	}

}
