package br.edu.ifpb.pdm;

import java.util.List;

public class BatePapo {
	private int id;
	private List<Contatos> contatos;

	public BatePapo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Contatos> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contatos> contatos) {
		this.contatos = contatos;
	}

	public void addContato(Contatos c) {
		contatos.add(c);
	}

	public void removeContato(Contatos c) {
		contatos.remove(c);
	}

}
