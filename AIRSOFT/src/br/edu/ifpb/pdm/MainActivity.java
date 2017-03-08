package br.edu.ifpb.pdm;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {
	private ListaAdapterContato adapterContatos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		//
		final Button tabChat = (Button) findViewById(R.id.tab_chat);
		final Button tabMissions = (Button) findViewById(R.id.tab_missions);

		Usuario u1 = new Usuario("Aluísio", "aluisio@gmail.com", "aluisio");
		Usuario u2 = new Usuario("Aristofanio", "ari@gmail.com", "ari");
		Usuario u3 = new Usuario("Outro", "outro@gmail.com", "outro");

		ArrayList<Contato> listacontato = new ArrayList<Contato>();
		Contato a = new Contato(R.drawable.bg_label_green, "Aluno de ADS", u1);
		Contato b = new Contato(R.drawable.bg_label_orange, "Professor de PDM", u2);
		Contato c = new Contato(R.drawable.bg_label_yellow, "Descrição", u3);

		listacontato.add(a);
		listacontato.add(b);
		listacontato.add(c);

		adapterContatos = new ListaAdapterContato(this, listacontato);
		ListView listView0 = (ListView) findViewById(R.id.listView001);
		listView0.setAdapter(adapterContatos);
		listView0.setOnItemClickListener(this);

		//
		final LinearLayout tabFrameChat = (LinearLayout) findViewById(R.id.tab_frame_chat);
		final LinearLayout tabFrameMissions = (LinearLayout) findViewById(R.id.tab_frame_missions);
		//

		Intent it = getIntent();
		Usuario recuperadoUser = (Usuario) it.getSerializableExtra("usuarioLogado");
		String nome = recuperadoUser.getNome();

		TextView tv = (TextView) findViewById(R.id.tx_name);
		tv.setText(nome);

		tabChat.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View view) {
				tabChat.setBackgroundColor(getResources().getColor(android.R.color.tertiary_text_light));
				tabMissions.setBackgroundColor(getResources().getColor(android.R.color.transparent));
				Log.d("[AGDebug]", "Abrindo o tab do chat.");
				tabFrameChat.setVisibility(View.VISIBLE);
				tabFrameMissions.setVisibility(View.GONE);
			}
		});
		//
		tabMissions.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				tabChat.setBackgroundColor(getResources().getColor(android.R.color.transparent));
				tabMissions.setBackgroundColor(getResources().getColor(android.R.color.tertiary_text_light));
				
				Log.d("[AGDebug]", "Abrindo o tab do missioes.");
				tabFrameChat.setVisibility(View.GONE);
				tabFrameMissions.setVisibility(View.VISIBLE);
			}
		});

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent it = getIntent();
		Usuario recuperadoUser2 = (Usuario) it.getSerializableExtra("usuarioLogado");

		Contato clicadoUser = adapterContatos.getItem(position);
		Intent i = new Intent(this, BatePapoActivity.class);
		i.putExtra("usuarioLogado2", recuperadoUser2);
		i.putExtra("contatoUser", clicadoUser);

		startActivity(i);

	}

	public void clicarNovaMissao(View view) {
		Toast.makeText(this, "Ambiente de NOVA MISSÃO em desenvolvimento!", Toast.LENGTH_LONG).show();

	}

	public void clicarMissaoAnterior(View view) {
		Toast.makeText(this, "Ambiente de MISSÕES ANTERIORES em desenvolvimento!", Toast.LENGTH_LONG).show();

	}

	public void clicarConfiguracao(View view) {
		Toast.makeText(this, "Ambiente de CONFIGURAÇÕES em desenvolvimento!", Toast.LENGTH_LONG).show();

	}

	public void clicarGaleriaFotos(View view) {
		Toast.makeText(this, "Ambiente de GALERIA DE FOTOS em desenvolvimento!", Toast.LENGTH_LONG).show();

	}
}
