package br.uniminas.persistencia;

import java.util.List;

import br.uniminas.entidades.Unidade;

public interface UnidadeDAO {

	public List getAllUnidades();

	public Unidade getUnidade(String string);

	public void updateUnidade(Unidade u);

	public void delete(String string);
}
