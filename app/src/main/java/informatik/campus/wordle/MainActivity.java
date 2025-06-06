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

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
/*
-TODO
-- Array z haslami (dziala z arraya zostaje wybrane jedno haslo za kazdym startem aplikacji)
-- rozczlonkowanie arraya na piec liter zeby wszystko sprawdzic
-- sprawdzanie hasla
-- zmiana widocznosci na kolejny wiersz
-- moze jak sie uda i nie bedzie zbyt skomplikowane to po wpisaniu jednej litery od razu przeskakuje dalej
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
        EditText ET6 = findViewById(R.id.ET6);
        EditText ET7 = findViewById(R.id.ET7);
        EditText ET8 = findViewById(R.id.ET8);
        EditText ET9 = findViewById(R.id.ET9);
        EditText ET10 = findViewById(R.id.ET10);
        EditText ET11 = findViewById(R.id.ET11);
        EditText ET12 = findViewById(R.id.ET12);
        EditText ET13 = findViewById(R.id.ET13);
        EditText ET14 = findViewById(R.id.ET14);
        EditText ET15 = findViewById(R.id.ET15);
        EditText ET16 = findViewById(R.id.ET16);
        EditText ET17 = findViewById(R.id.ET17);
        EditText ET18 = findViewById(R.id.ET18);
        EditText ET19 = findViewById(R.id.ET19);
        EditText ET20 = findViewById(R.id.ET20);
        EditText ET21 = findViewById(R.id.ET21);
        EditText ET22 = findViewById(R.id.ET22);
        EditText ET23 = findViewById(R.id.ET23);
        EditText ET24 = findViewById(R.id.ET24);
        EditText ET25 = findViewById(R.id.ET25);
        EditText ET26 = findViewById(R.id.ET26);
        EditText ET27 = findViewById(R.id.ET27);
        EditText ET28 = findViewById(R.id.ET28);
        EditText ET29 = findViewById(R.id.ET29);
        EditText ET30 = findViewById(R.id.ET30);

        TextView testHasla = findViewById(R.id.HasloTest);



        Button btnPruefen = findViewById(R.id.btnPruefen);
        btnPruefen.setOnClickListener(this);




        String[] naturWorter = {
                "WIESE", "BLUME", "ERDEN", "BÄUME", "FLUSS",
                "WELLE", "NEBEL", "STEIN", "GRUBE", "ASTEN",
                "BERGE", "HÖHLE", "EICHE", "RINDE", "SUMPF"
        };



        String zufall = naturWorter[new Random().nextInt(naturWorter.length)];

        char[] buchstaben = zufall.toCharArray();


        testHasla.setText(zufall);

        ET1.setText(buchstaben[1]);
        ET2.setText(buchstaben[0]);
        ET3.setText(buchstaben[4]);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @Override
    public void onClick(View v) {



    }
}