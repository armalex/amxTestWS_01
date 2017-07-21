package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString(includeFieldNames = true, exclude = "nom")
public class Mois {
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String nom;
    private int nbrJours;
    private String premierJour;
    private int indiceDepart;
    private String saison;
    private String saisonImg;
    private String couleurTitre;
    private String[] listeJours; 
	
    
    public Mois(){
    	super();
    }
    
    
    public Mois(String nom, int nbrJours, String premierJour, int indiceDepart, String saison, String saisonImg,
			String couleurTitre, String[] listeJours) {
		super();
		this.nom = nom;
		this.nbrJours = nbrJours;
		this.premierJour = premierJour;
		this.indiceDepart = indiceDepart;
		this.saison = saison;
		this.saisonImg = saisonImg;
		this.couleurTitre = couleurTitre;
		this.listeJours = listeJours;
	}
	
	
	 public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbrJours() {
		return nbrJours;
	}
	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}
	public String getPremierJour() {
		return premierJour;
	}
	public void setPremierJour(String premierJour) {
		this.premierJour = premierJour;
	}
	public int getIndiceDepart() {
		return indiceDepart;
	}
	public void setIndiceDepart(int indiceDepart) {
		this.indiceDepart = indiceDepart;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	public String getSaisonImg() {
		return saisonImg;
	}
	public void setSaisonImg(String saisonImg) {
		this.saisonImg = saisonImg;
	}
	public String getCouleurTitre() {
		return couleurTitre;
	}
	public void setCouleurTitre(String couleurTitre) {
		this.couleurTitre = couleurTitre;
	}

	public String[] getListeJours() {
		return listeJours;
	}
	public void setListeJours(String[] listeJours) {
		this.listeJours = listeJours;
	}

}
