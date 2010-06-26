package com.ferrabone.test.D20;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class D20 extends Activity {
    /** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        Button RollButton = (Button) this.findViewById(R.id.B_Roll);
        RollButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Random generador = new Random();
        		int entero;
        		TextView texto;
        		
        		texto = (TextView) findViewById(R.id.TV_Resultado);
        		
        		entero = generador.nextInt(20)+1;
        		
        		texto.setText(String.valueOf(entero));
        	    }
           }
        );
        
    
   }
	
}

