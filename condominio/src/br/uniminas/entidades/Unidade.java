package br.uniminas.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.uniminas.entidades.Pessoa;

@Entity
@Table(name = "unidade")
public class Unidade {
	@Id
	String U_numero;

	@OneToOne
	@JoinColumn(name = "morador", unique = true)
	Pessoa morador;

	@OneToOne
	@JoinColumn(name = "proprietario", unique = true)
	Pessoa proprietario;

	public Unidade() {
	}

	public Unidade(String numero, Pessoa mor, Pessoa prop) {
		this.U_numero = numero;
		this.morador = mor;
		this.proprietario = prop;
	}

	public Pessoa getMorador() {
		return morador;
	}

	public void setMorador(Pessoa mor) {
		this.morador = mor;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa prop) {
		this.proprietario = prop;
	}

	public void setU_numero(String numero) {
		System.out.println("setU_numero: " + numero.subSequence(0, 3));
		this.U_numero = numero.substring(0, 3);
	}

	public String getU_numero() {
		return U_numero;
	}
}
