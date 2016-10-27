package it.alfasoft.vahid.dao;

import it.alfasoft.vahid.Studente;
import it.alfasoft.vahid.db.DBEsempio;

public class StudenteDao {
	DBEsempio db=new DBEsempio();
	public Studente getStudenteConMatricola(String mat){
		return db.getStudenti().get(mat);
	}

}
