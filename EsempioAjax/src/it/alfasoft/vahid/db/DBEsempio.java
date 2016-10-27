package it.alfasoft.vahid.db;

import it.alfasoft.vahid.Studente;

import java.util.HashMap;
import java.util.Map;

public class DBEsempio {
	
	  private Map<String,Studente> studenti=new HashMap<>();

	public DBEsempio() {
		
		Studente s1=new Studente("vahid","Khoshkhou","aaa");
		Studente s2=new Studente("Andrea","Laneri","bbb");
		Studente s3=new Studente("Martina","Debernardi","ccc");
		
		studenti.put(s1.getMatricola(), s1);
		studenti.put(s2.getMatricola(), s2);
		studenti.put(s3.getMatricola(), s3);
		
		
	}

	public  Map<String,Studente> getStudenti() {
		return studenti;
	}

	
	  
	  
	  
}
