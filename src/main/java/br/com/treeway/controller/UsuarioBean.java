package br.com.treeway.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.treeeway.Servico.UsuarioServico;
import br.com.treeeway.model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

	Usuario usuario=new Usuario();	
	
	private String nome;
	
	private Date nascimento = new Date();
	

	public void init() {
		nome= null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String salvar() {
		usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setNascimento(nascimento);
		UsuarioServico servico =  new UsuarioServico();
		
		
		System.out.println("Ola ");
		
		servico.salvar(usuario);
		
		init();
		return "welcome.xhtml";
		
		
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
