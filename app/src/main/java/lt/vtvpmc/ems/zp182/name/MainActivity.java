package lt.vtvpmc.ems.zp182.name;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText editTextName;
    public Button buttonEnter;
    public TextView inputOutputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnter = (Button) findViewById(R.id.buttonEnter);
        inputOutputName = (TextView) findViewById(R.id.inputOutputName);
        editTextName = (EditText) findViewById(R.id.editTextName);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputOutputName.setText(editTextName.getText());
            }
        });


    }
}
