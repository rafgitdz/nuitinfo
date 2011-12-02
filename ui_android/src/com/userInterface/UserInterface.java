package com.userInterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class UserInterface extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);
        ((Button)findViewById(R.id.connexion)).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
			}
		});
    }
}