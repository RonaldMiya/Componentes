package rmiya.com.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private static final String TAG = ButtonActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }


    //public con parametro view
    public void PressButton(View view) {
        Log.d( TAG, "Boton presionado" );

        //forma corta 1s --> LENGTH_SHORT, forma larga 3s --> LENGTH_LONG
        Toast.makeText(this, "Presiono el boton 1", Toast.LENGTH_SHORT).show();
    }
}
