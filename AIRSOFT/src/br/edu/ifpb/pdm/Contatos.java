package br.edu.ifpb.pdm;

import java.util.List;

public class Contatos {
	private int id;
	private List<Usuario> usuarios;

	public Contatos() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}

	public void removeUsuario(Usuario u) {
		usuarios.remove(u);
	}

}
