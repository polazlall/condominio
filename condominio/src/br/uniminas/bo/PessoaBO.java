package br.uniminas.bo;

import java.util.List;

import br.uniminas.entidades.Pessoa;
import br.uniminas.persistencia.PessoaDAO;
import br.uniminas.persistencia.PessoaHibernateDAO;

public class PessoaBO {
	private PessoaDAO dao;

    public PessoaBO() {
        this.dao = new PessoaHibernateDAO();
    }

    public List getAllPessoas() {
        return dao.getAllPessoas();
    }    

    public void deletePessoa(String string) {
        dao.delete(string);
    }

    public Pessoa getPessoa(String string) {
        return dao.pesquisarPessoa(string);
    }

    public void insertPessoa(Pessoa pes) {
        dao.insert(pes);
    }
}
