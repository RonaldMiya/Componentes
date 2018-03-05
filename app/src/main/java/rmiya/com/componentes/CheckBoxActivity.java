package rmiya.com.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setChecked(true);

        if(checkBox.isChecked())
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();

    }

    public void androidCheckBoxClicked(View view) {

        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " seleccionado!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                break;
            case R.id.checkBox3:
                break;
            case R.id.checkBox4:
                break;
            case R.id.checkBox5:
                break;
            case R.id.checkBox6:
                break;
            case R.id.checkBox7:
                break;
            case R.id.checkBox8:
                break;
            case R.id.checkBox9:
                break;
        }


    }
}
