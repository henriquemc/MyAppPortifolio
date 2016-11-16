package br.com.lhsolucoes.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /** Called when the user touches the button */
    public void showButtonText(View view) {
        CharSequence text = ((Button)view).getText();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();

    }

}
