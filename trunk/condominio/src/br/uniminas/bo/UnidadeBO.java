package br.uniminas.bo;
import java.util.*;

import br.uniminas.entidades.Unidade;
import br.uniminas.persistencia.UnidadeDAO;
import br.uniminas.persistencia.UnidadeHibernateDAO;

public class UnidadeBO  {

	
	
	    private UnidadeDAO dao;

	    public UnidadeBO() {
	        this.dao = new UnidadeHibernateDAO();
	    }

	    public List getAllUnidades() {
	        return dao.getAllUnidades();
	    }
	    
	    public void deleteUnidade(String string) {
	        dao.delete(string);
	    }

	    public Unidade getUnidade(String string) {
	        return dao.getUnidade(string);
	    }

	 
	    public void updateUnidade(Unidade u){
	    	dao.updateUnidade(u);
	    }
	
}
