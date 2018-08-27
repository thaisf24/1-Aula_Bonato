package br.usjt.sin.progmulti.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    //Thais Fernandes RA: 201310430
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.MENSAGEM);
        TextView textView = new TextView (this);
        textView.setTextSize(40);
        textView.setText(mensagem);

        ViewGroup layout = findViewById(R.id.display_message_activity_layout);
        layout.addView (textView);


    }
}
