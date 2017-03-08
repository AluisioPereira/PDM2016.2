package br.edu.ifpb.pdm;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		final Button login = (Button) findViewById(R.id.btnAcessar);

		Usuario u1 = new Usuario("Aluísio", "aluisio@gmail.com", "aluisio");
		Usuario u2 = new Usuario("Aristofanio", "ari@gmail.com", "ari");
		Usuario u3 = new Usuario("Outro", "outro@gmail.com", "outro");
		
		Logins l = new Logins();
		l.addUsuario(u1);
		l.addUsuario(u2);
		l.addUsuario(u3);
		final List<Usuario> list = new ArrayList(l.getUsuarios());
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText emailc = (EditText) findViewById(R.id.email);
				String emaild = emailc.getText().toString();

				EditText senhac = (EditText) findViewById(R.id.senha);
				String senhad = senhac.getText().toString();

				TextView tv = (TextView) findViewById(R.id.texto);


				Usuario u1 = verificarUser(list, emaild, senhad);

				if (u1 != null) {
					Intent i = new Intent(PrincipalActivity.this, MainActivity.class);
					i.putExtra("usuarioLogado", u1);
					startActivity(i);
				} else {
					Toast.makeText(PrincipalActivity.this, "Acesso negado!", Toast.LENGTH_LONG).show();
				}	
				
			}
		});



	}

	public Usuario verificarUser(List<Usuario> list, String emaild, String senhad) {

		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getEmail().equals(emaild)) && (list.get(i).getSenha().equals(senhad))) {
				return list.get(i);
			}
		}
		return null;

	}
}
