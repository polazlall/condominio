package br.uniminas.persistencia;

import java.util.List;

import br.uniminas.entidades.Pessoa;

public interface PessoaDAO {
	public List getAllPessoas();

	public Pessoa getPessoa(String string);

	public Pessoa pesquisarPessoa(String cpf);

	public void insert(Pessoa pes);

	public void delete(String string);
}
