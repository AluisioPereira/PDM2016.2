package br.edu.ifpb.pdm;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		//
		Button tabChat = (Button) findViewById(R.id.tab_chat);
		Button tabMissions = (Button) findViewById(R.id.tab_missions);
		
		
		
		Usuario u1 = new Usuario("aluisio", "aluisio@gmail.com", "aluisio");
		Usuario u2 = new Usuario("ari", "ari@gmail.com", "ari");
		Usuario u3 = new Usuario("user3", "user3@gmail.com", "user3");
		ArrayList<Contato> listacontato = new ArrayList<Contato>();
		Contato a = new Contato(R.drawable.bg_label_green, "Aluno", u1);
		Contato b = new Contato(R.drawable.bg_label_orange, "Professor", u2);
		Contato c = new Contato(R.drawable.bg_label_yellow, "user3", u3);
		
		listacontato.add(a);
		listacontato.add(b);
		listacontato.add(c);
		
		ListaAdapterContato  adapterContatos = new ListaAdapterContato(this, listacontato);
		ListView listView0 = (ListView) findViewById(R.id.listView001);
		listView0.setAdapter(adapterContatos);	
		
		
		
		//
		final LinearLayout tabFrameChat = (LinearLayout) findViewById(R.id.tab_frame_chat);
		final LinearLayout tabFrameMissions = (LinearLayout) findViewById(R.id.tab_frame_missions);
		//

		Intent it = getIntent();
		String nome = it.getStringExtra("nome");

		TextView tv = (TextView) findViewById(R.id.tx_name);
		tv.setText(nome);

		tabChat.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Log.d("[AGDebug]", "Abrindo o tab do chat.");
				tabFrameChat.setVisibility(View.VISIBLE);
				tabFrameMissions.setVisibility(View.GONE);
			}
		});
		//
		tabMissions.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.d("[AGDebug]", "Abrindo o tab do missioes.");
				tabFrameChat.setVisibility(View.GONE);
				tabFrameMissions.setVisibility(View.VISIBLE);
			}
		});

	}
}
