package br.uniminas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {
	@Id
	@Column(name = "P_cpf")
	private String p_cpf;

	@Column(name = "P_nome")
	private String p_nome;

	@Column(name = "P_telefone")
	private String p_telefone;

	@OneToOne
	@JoinColumn(name = "numero_unidade")
	private Unidade unidade;

	public Pessoa() {
	}

	public Pessoa(String cpf, String nome, String tel) {
		this.p_cpf = cpf;
		this.p_nome = nome;
		this.p_telefone = tel;
		// this.unidade=u;

	}

	public String getP_cpf() {
		return p_cpf;
	}

	public void setP_cpf(String p_cpf) {
		this.p_cpf = p_cpf;
	}

	public String getP_nome() {
		return p_nome;
	}

	public void setP_nome(String p_nome) {
		this.p_nome = p_nome;
	}

	public String getP_telefone() {
		return p_telefone;
	}

	public void setP_telefone(String p_telefone) {
		this.p_telefone = p_telefone;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
}