package br.uniminas.action;

import java.util.*;

import br.uniminas.entidades.*;
import br.uniminas.bo.UnidadeBO;
import br.uniminas.bo.PessoaBO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CadastrarPessoaAction extends ActionSupport {

	private UnidadeBO uniService = new UnidadeBO();

	private PessoaBO pesService = new PessoaBO();

	private Pessoa pessoa;

	private Unidade unidade;

	private String cpf;

	boolean cad_mor;

	boolean cad_prop;

	private List<Pessoa> pessoas;

	private List<Unidade> unidades;

	public String getAllPessoas() {
		pessoas = pesService.getAllPessoas();
		return "success";
	}

	public String setUpForInsertOrUpdate() {
		prep();
		if (pessoa != null && pessoa.getP_cpf() != null) {
			pessoa = pesService.getPessoa(pessoa.getP_cpf());
			unidade = uniService.getUnidade(unidade.getU_numero());
		}
		return "success";
	}

	public String setUpForInsertOrUpdate2() {
		prep();
		if (pessoa != null && pessoa.getP_cpf() != null) {
			pessoa = pesService.getPessoa(pessoa.getP_cpf());
			unidade = uniService.getUnidade(unidade.getU_numero());
		}
		return "success";
	}

	public String consultaPessoa(Pessoa p_cpf) {

		if (pessoa.getP_cpf().equals(pesService.getPessoa(cpf) {
			return "success";
		} else {
			addActionError("Pessoa não cadastrada!");
			return ERROR;
		}
	}

	public String insertOrUpdate() {

		if (!validationSuccessful()) {
			return "erro";
		} else {
			pessoa.setUnidade(unidade);
			pesService.insertPessoa(pessoa);
			System.out.println("Fez pessoa");
			// uni.setU_numero(num);
			if (cad_mor)
				unidade.setMorador(pessoa);
			if (cad_prop)
				unidade.setProprietario(pessoa);
			uniService.updateUnidade(unidade);
			System.out.println("Fez unidade");
			return "success";
		}

	}

	public String deletePessoa() {
		pesService.deletePessoa(pessoa.getP_cpf());
		return "success";
	}

	private void prep() {
		unidades = uniService.getAllUnidades();
		Map session = ActionContext.getContext().getSession();
		session.put("unidades", unidades);
	}

	private boolean validationSuccessful() {
		if (pessoa.getP_cpf() == null || pessoa.getP_cpf().trim().length() < 11
				|| pessoa.getP_cpf().trim().length() > 11) {
			addActionMessage("Por favor insira o CPF válido!");
		}
		if (pessoa.getP_nome() == null
				|| pessoa.getP_nome().trim().length() < 1) {
			addActionMessage("Por favor insira o nome");
		}
		if (pessoa.getP_telefone() == null
				|| pessoa.getP_telefone().trim().length() < 7
				|| pessoa.getP_telefone().trim().length() > 7) {
			addActionMessage("Por favor insira o telefone");
		}

		if (this.hasActionMessages()) {
			return false;
		} else {
			System.out.println("Passou da valiadação");
			return true;
		}
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	public boolean isCad_mor() {
		return cad_mor;
	}

	public void setCad_mor(boolean cad_mor) {
		this.cad_mor = cad_mor;
	}

	public boolean isCad_prop() {
		return cad_prop;
	}

	public void setCad_prop(boolean cad_prop) {
		this.cad_prop = cad_prop;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}