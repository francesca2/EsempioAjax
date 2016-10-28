package it.alfasoft.francesca.dao;

import it.alfasoft.francesca.Studente;
import it.alfasoft.francesca.db.DBEsempio;

public class StudenteDao {
	DBEsempio db=new DBEsempio();
	public Studente getStudenteConMatricola(String mat){
		return db.getStudenti().get(mat);
	}

}
