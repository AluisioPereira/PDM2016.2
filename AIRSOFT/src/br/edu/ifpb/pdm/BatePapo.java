package br.edu.ifpb.pdm;

import java.util.List;

public class BatePapo {
	private int id;
	private List<Contato> contatos;

	public BatePapo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void addContato(Contato c) {
		contatos.add(c);
	}

	public void removeContato(Contato c) {
		contatos.remove(c);
	}

}
