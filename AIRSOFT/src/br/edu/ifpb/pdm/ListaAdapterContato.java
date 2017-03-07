package br.edu.ifpb.pdm;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaAdapterContato extends ArrayAdapter<Contato> {
	private Context context;
	private ArrayList<Contato> contatos;

	public ListaAdapterContato(Context context, ArrayList<Contato> contatos) {
		super(context, 0, contatos);
		this.context = context;
		this.contatos = contatos;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Contato contatoPosicao = this.contatos.get(position);
		convertView = LayoutInflater.from(this.context).inflate(R.layout.contato, null);
		ImageView imgView = (ImageView) convertView.findViewById(R.id.imageView001);
		imgView.setImageResource(contatoPosicao.getImagem());		

		TextView textDescricao = (TextView) convertView.findViewById(R.id.textView002);
		textDescricao.setText(contatoPosicao.getDescricao());
		
		TextView textView = (TextView) convertView.findViewById(R.id.textView001);
		textView.setText(contatoPosicao.getUsuario().getNome());
		
		return convertView;

	}

}
