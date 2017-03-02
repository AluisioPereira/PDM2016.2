package br.edu.ifpb.pdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        //
        Button tabChat = (Button) findViewById(R.id.tab_chat);
        Button tabMissions = (Button) findViewById(R.id.tab_missions);
        //
        final LinearLayout tabFrameChat = (LinearLayout) findViewById(R.id.tab_frame_chat);
        final LinearLayout tabFrameMissions = (LinearLayout) findViewById(R.id.tab_frame_missions);
        //
        
        Intent it = getIntent();
        String nome = it.getStringExtra("nome");
        
        TextView tv = (TextView) findViewById(R.id.tx_name);
        tv.setText(nome);
        
        tabChat.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("[AGDebug]", "Abrindo o tab do chat.");
                tabFrameChat.setVisibility(View.VISIBLE);
                tabFrameMissions.setVisibility(View.GONE);
            }
        });
        //
        tabMissions.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("[AGDebug]", "Abrindo o tab do missioes.");
                tabFrameChat.setVisibility(View.GONE);
                tabFrameMissions.setVisibility(View.VISIBLE);
            }
        });

    }
}
