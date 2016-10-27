package it.alfasoft.vahid.servllet;

import it.alfasoft.vahid.Studente;
import it.alfasoft.vahid.dao.StudenteDao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class StudenteServlet
 */
@WebServlet(description = "questo viene chiamata tramite ajax", urlPatterns = { "/prendiStudente" })
public class StudenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String matricola=request.getParameter("matricoloa");
		
		
		PrintWriter out=response.getWriter();
		
		Gson gson=new Gson();
		
		JsonObject jobj= new JsonObject();
		
		Studente stud=this.getStudente(matricola);
		
		
		JsonElement sudenteJson= gson.toJsonTree(stud);
		
		if(stud== null){
			jobj.addProperty("success",false);
			
		}else{
			jobj.addProperty("success",true);
		}
		
		jobj.add("studente", sudenteJson);
		
		out.println(jobj.toString());
		
		System.out.println(jobj);
		
		
		out.close();
	}
	
	public Studente getStudente(String mat){
		StudenteDao sDao=new StudenteDao();
		
		return sDao.getStudenteConMatricola(mat);
		
	}

}
