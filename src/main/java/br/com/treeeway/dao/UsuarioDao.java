package br.com.treeeway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treeeway.model.Usuario;
import br.com.treeway.Util.FabricaConexao;

public class UsuarioDao extends Dao<Usuario> {

	
	public void inserir(Usuario usuario) {
		StringBuilder SQL= new StringBuilder();
		SQL.append("INSERT INTO USUARIO VALUES (NOME,NASCIMENTO,CPF,PROFISSAO,FORMACAO ) VALUES (?,?,?,?,?) ");
		
		
		Connection conn;
		try {
			conn = FabricaConexao.getConexao();
			PreparedStatement sql = conn.prepareStatement(SQL.toString());
			sql.setString(1, usuario.getNome());
			sql.setString(2, usuario.getNascimento());
			sql.setString(3, usuario.getCpf());
			sql.setString(4, usuario.getProfissao().name());
			sql.setString(5, usuario.getFormacao().name());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
	}
}
