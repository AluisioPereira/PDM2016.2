package br.edu.ifpb.pdm;

import java.util.List;

public class Conversa {
	private int emissorId;
	private int receptorId;
	private List<Mensagem> mensagens;

	public Conversa() {
	}

	public int getEmissorId() {
		return emissorId;
	}

	public void setEmissorId(int emissorId) {
		this.emissorId = emissorId;
	}

	public int getReceptorId() {
		return receptorId;
	}

	public void setReceptorId(int receptorId) {
		this.receptorId = receptorId;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public void addMensagem(Mensagem m) {
		mensagens.add(m);
	}

	public void removeMensagem(Mensagem m) {
		mensagens.remove(m);
	}

}
