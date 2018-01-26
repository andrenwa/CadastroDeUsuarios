package br.com.treeeway.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treeeway.model.Usuario;
import br.com.treeway.Util.FabricaConexao;

public class UsuarioDao extends Dao<Usuario> {

	
	public void inserir(Usuario usuario) {
		StringBuilder SQL= new StringBuilder();
		SQL.append("INSERT INTO USUARIO (NOME,NASCIMENTO,CPF,PROFISSAO,FORMACAO ) VALUES (?,?,?,?,?) ");
		
		
		Connection conn;
		try {
			conn = FabricaConexao.getConexao();
			PreparedStatement sql = conn.prepareStatement(SQL.toString());
			sql.setString(1, usuario.getNome());
			sql.setDate(2, new Date(usuario.getNascimento().getTime()));
			sql.setString(3, usuario.getCpf());
			sql.setString(4, "pedreiro");
			sql.setString(5, "ensimo medio");
			
			sql.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
	}
}
