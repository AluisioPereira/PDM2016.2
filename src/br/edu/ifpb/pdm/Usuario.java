package br.edu.ifpb.pdm;

import java.util.Random;

public class Usuario {
	private int id;
	private String email;
	private String senha;

	public Usuario(String email, String senha) {
		Random ran = new Random();
		this.id=ran.nextInt(1001);
		this.email = email;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void encerrar() {
		this.email = "";
		this.senha = "";
	}

}
