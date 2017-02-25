package br.edu.ifpb.pdm;

import java.util.ArrayList;
import java.util.List;

public class Logins {
	private List<Usuario> usuarios;

	public Logins() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void addUsuario(Usuario u){
		usuarios.add(u);
	}

	public void removeUsuario(Usuario u){
		usuarios.remove(u);
	}
}
