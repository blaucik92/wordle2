package informatik.campus.wordle;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText ET1;
        EditText ET2;
        EditText ET3;
        EditText ET4;
        EditText ET5;

        Button btnPruefen;


        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        ET3 = findViewById(R.id.ET3);
        ET4 = findViewById(R.id.ET4);
        ET5 = findViewById(R.id.ET5);

        btnPruefen.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(EditText ET1, EditText ET2 )
    {

    }


}