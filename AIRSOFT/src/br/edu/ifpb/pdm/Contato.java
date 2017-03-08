package br.edu.ifpb.pdm;

import java.io.Serializable;

public class Contato implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8740846303936561198L;
	private int imagem;
	private String descricao;
	private Usuario usuario;

	public Contato() {
	}

	public Contato(int imagem, String descricao, Usuario usuario) {
		this.imagem = imagem;
		this.descricao = descricao;
		this.usuario = usuario;
	}

	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
