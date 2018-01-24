package br.com.treeeway.model;

public class Usuario implements Entidade{

	private String nome;
	private String nascimento;
	private String cpf;
	private EnumSexo sexo;
	private EnumFormacao formacao;
	private EnumProfissao profissao;
	private Contato contato;
	private Endereco endereco;
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public EnumFormacao getFormacao() {
		return formacao;
	}

	public void setFormacao(EnumFormacao formacao) {
		this.formacao = formacao;
	}

	public EnumProfissao getProfissao() {
		return profissao;
	}

	public void setProfissao(EnumProfissao profissao) {
		this.profissao = profissao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



}
