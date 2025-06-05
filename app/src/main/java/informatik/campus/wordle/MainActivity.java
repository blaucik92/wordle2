package informatik.campus.wordle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
/*
-TODO
-- Array z haslami
-- rozczlonkowanie arraya na piec liter zeby wszystko sprawdzic
-- sprawdzanie hasla
-- zmiana widocznosci na kolejny wiersz
-- moze jak sie uda i nie bedzie zbyt skomplikowane po wpisaniu jeden litery od razu przeskakuje dalej
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText ET1 = findViewById(R.id.ET1);
        EditText ET2 = findViewById(R.id.ET2);
        EditText ET3 = findViewById(R.id.ET3);
        EditText ET4 = findViewById(R.id.ET4);
        EditText ET5 = findViewById(R.id.ET5);



        Button btnPruefen = findViewById(R.id.btnPruefen);



        btnPruefen.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @Override
    public void onClick(View v) {

        String dziala = "dziala";

    }
}