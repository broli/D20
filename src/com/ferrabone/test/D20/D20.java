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
        		String array[];
        		
        		array = new String[3];
        		array[0] = "Si";
        		array[1]= "No";
        		array[2]="Talvez";
        		
        		texto = (TextView) findViewById(R.id.TV_Resultado);
        		
        		entero = generador.nextInt(3);
        		
        		texto.setText(array[entero]);
        	    }
           }
        );
        
    
   }
	
}

