package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class Annee {
	
	
	public  Mois annee[];
	@JsonIgnore
	public String moisCourant;
	@JsonIgnore
	public int indiceMoisCourant;
	Map<Integer, String[]> hm = new HashMap<>();
	@JsonIgnore
	String[] jours;
		
	Annee (){
			Iterator iterator = hm.entrySet().iterator();
			AnneeListeJour ();
			
			annee = new Mois[12];
			
			annee[0] = new Mois("Janvier",31,"Dimanche",7,"hiver","bg-mois-hiver","white",jours);
			annee[1] = new Mois("Février",28,"Mercredi",7,"hiver","bg-mois-hiver","white",jours);
			annee[2] = new Mois("Mars",31,"Mercredi",7,"hiver","bg-mois-hiver","white",jours);
			
			annee[3] = new Mois("Avril",31,"Samedi",7,"hiver","bg-mois-hiver","springgreen",jours);
			annee[4] = new Mois("Mai",28,"Lundi",7,"hiver","bg-mois-hiver","springgreen",jours);
			annee[5] = new Mois("Juin",31,"Jeudi",7,"hiver","bg-mois-hiver","springgreen",jours);
				
			annee[6] = new Mois("Juillet",31,"Samedi",7,"hiver","bg-mois-hiver","red",jours);
			annee[7] = new Mois("Aout",28,"Mardi",7,"hiver","bg-mois-hiver","red",jours);
			annee[8] = new Mois("Septembre",31,"Vendredi",7,"hiver","bg-mois-hiver","red",jours);
			
			annee[9] = new Mois("Octobre",31,"Dimanche",7,"hiver","bg-mois-hiver","orange",jours);
			annee[10] = new Mois("Novembre",28,"Mercredi",7,"hiver","bg-mois-hiver","orange",jours);
			annee[11] = new Mois("Décembre",31,"Vendredi",7,"hiver","bg-mois-hiver","orange",jours);
			
			//this.moisCourant = moisCourant;
			//indiceMoisCourant = indice;
		}
	
	
	
	public String[] getListeJour(int indiceMois ){
		return annee[indiceMois].getListeJours();
	}
	
	
	
	public void AnneeListeJour (){
		
		String ljour[];
	
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
		         "17","18","19","20","21","22","23","24","25",
		         "26","27","41"};
		
		hm.put(1, ljour);
		/************************************************************************/
		ljour = new String[] {"", "", "", "", "", "", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30", "31"};
		hm.put(2, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(3, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		hm.put(4, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(5, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(6, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(7, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(8, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(9, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(10, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","28"};
		
		hm.put(11, ljour);
		/************************************************************************/
		ljour = new String[] { "","","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16",
                "17","18","19","20","21","22","23","24","25",
                "26","27","41"};
		
		hm.put(12, ljour);
		jours =ljour; 
		/************************************************************************/
		
	}

	
	
//	public void tableauSimple() {
//		String[] tableauSimple = new String[] {"Paul", "Jean", "Pierre"};
//		ArrayList tableauDynamique = new ArrayList(Arrays.asList(tableauSimple));
//	}
//	
	
	
	
	public  Mois getMoisCourant(int moisCourant) {
		
		return annee[moisCourant];
		
	}
		
}
