package br.edu.ifpb.pdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BatePapoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bate_papo);

		Intent it = getIntent();
		Usuario recuperadoUser = (Usuario) it.getSerializableExtra("usuarioLogado2");
		String nome = recuperadoUser.getNome();
		String email = recuperadoUser.getEmail();
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("LOGADO \n [nome: " + nome + "] \n [Email: " + email +"]");

		Contato recuperadoContato = (Contato) it.getSerializableExtra("contatoUser");
		String nome1 = recuperadoContato.getUsuario().getNome();
		String email1 = recuperadoContato.getUsuario().getEmail();

		TextView tv1 = (TextView) findViewById(R.id.textView2);
		tv1.setText("CONTATO \n [nome: " + nome1 + "] \n [Email: " + email1 +"]");

	}

}
