package br.com.treeeway.Servico;

import br.com.treeeway.dao.UsuarioDao;
import br.com.treeeway.model.Usuario;

public class UsuarioServico {

	UsuarioDao dao= new UsuarioDao();
	
	public void salvar(Usuario usuario) {
		dao.inserir(usuario);
	}
	
}
