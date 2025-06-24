package informatik.campus.wordle;

import android.graphics.Color;
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
- jakis emoji ze sie udalo lub cos
- wszystkie litery zawsze duze jak sie wpisuje oraz wycentrowane(pierwsza sie centruje reszta nie z jakiegos powodu)
-- moze jak sie uda i nie bedzie zbyt skomplikowane to po wpisaniu jednej litery od razu przeskakuje dalej
*/

    String zufall;
    char[] buchstaben;

    int runda = 1;


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




        // Hasla oraz losowanie hasla

        String[] naturWorter = {
                "WIESE", "BLUME", "ERDEN", "BÄUME", "FLUSS",
                "WELLE", "NEBEL", "STEIN", "GRUBE", "ASTEN",
                "BERGE", "HÖHLE", "EICHE", "RINDE", "SUMPF"
        };

        zufall = naturWorter[new Random().nextInt(naturWorter.length)];
        buchstaben = zufall.toCharArray();


        testHasla.setText(zufall);





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



    @Override
    public void onClick(View v) {


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


        Button btnPruefen = findViewById(R.id.btnPruefen);
        btnPruefen.setOnClickListener(this);


        String[] techWorter = {
                "KABEL", "MOUSE", "LASER", "CHIPS", "BYTES",
                "LOGIN", "CLOUD", "ROUTY", "STROM",
                "MODUS", "PIXEL", "CODES", "INPUT", "LOGIC",
                "SERIE", "AKKUS", "DRUCK", "TOOLS", "FIBER",
                "EMAIL", "LINUX", "MODUL", "DATEN", "RESET",
                "PATCH"
        };



        String input1 = ET1.getText().toString().toUpperCase();
        String input2 = ET2.getText().toString().toUpperCase();
        String input3 = ET3.getText().toString().toUpperCase();
        String input4 = ET4.getText().toString().toUpperCase();
        String input5 = ET5.getText().toString().toUpperCase();

        // ET1
        if (input1.equals(String.valueOf(buchstaben[0]))) {
            ET1.setBackgroundColor(Color.GREEN);
        } else if (
                input1.equals(String.valueOf(buchstaben[1])) ||
                        input1.equals(String.valueOf(buchstaben[2])) ||
                        input1.equals(String.valueOf(buchstaben[3])) ||
                        input1.equals(String.valueOf(buchstaben[4]))
        ) {
            ET1.setBackgroundColor(Color.YELLOW);
        } else {
            ET1.setBackgroundColor(Color.RED);
        }

        // ET2
        if (input2.equals(String.valueOf(buchstaben[1]))) {
            ET2.setBackgroundColor(Color.GREEN);
        } else if (
                input2.equals(String.valueOf(buchstaben[0])) ||
                        input2.equals(String.valueOf(buchstaben[2])) ||
                        input2.equals(String.valueOf(buchstaben[3])) ||
                        input2.equals(String.valueOf(buchstaben[4]))
        ) {
            ET2.setBackgroundColor(Color.YELLOW);
        } else {
            ET2.setBackgroundColor(Color.RED);
        }

        // ET3
        if (input3.equals(String.valueOf(buchstaben[2]))) {
            ET3.setBackgroundColor(Color.GREEN);
        } else if (
                input3.equals(String.valueOf(buchstaben[0])) ||
                        input3.equals(String.valueOf(buchstaben[1])) ||
                        input3.equals(String.valueOf(buchstaben[3])) ||
                        input3.equals(String.valueOf(buchstaben[4]))
        ) {
            ET3.setBackgroundColor(Color.YELLOW);
        } else {
            ET3.setBackgroundColor(Color.RED);
        }

        // ET4
        if (input4.equals(String.valueOf(buchstaben[3]))) {
            ET4.setBackgroundColor(Color.GREEN);
        } else if (
                input4.equals(String.valueOf(buchstaben[0])) ||
                        input4.equals(String.valueOf(buchstaben[1])) ||
                        input4.equals(String.valueOf(buchstaben[2])) ||
                        input4.equals(String.valueOf(buchstaben[4]))
        ) {
            ET4.setBackgroundColor(Color.YELLOW);
        } else {
            ET4.setBackgroundColor(Color.RED);
        }

        // ET5
        if (input5.equals(String.valueOf(buchstaben[4]))) {
            ET5.setBackgroundColor(Color.GREEN);
        } else if (
                input5.equals(String.valueOf(buchstaben[0])) ||
                        input5.equals(String.valueOf(buchstaben[1])) ||
                        input5.equals(String.valueOf(buchstaben[2])) ||
                        input5.equals(String.valueOf(buchstaben[3]))
        ) {
            ET5.setBackgroundColor(Color.YELLOW);
        } else {
            ET5.setBackgroundColor(Color.RED);
        }





        if (runda == 1) {
            // Zablokuj ET1–ET5
            ET1.setEnabled(false);
            ET2.setEnabled(false);
            ET3.setEnabled(false);
            ET4.setEnabled(false);
            ET5.setEnabled(false);

            // Odblokuj ET6–ET10
            ET6.setEnabled(true);
            ET7.setEnabled(true);
            ET8.setEnabled(true);
            ET9.setEnabled(true);
            ET10.setEnabled(true);
        }

        if (runda == 2) {
            ET6.setEnabled(false);
            ET7.setEnabled(false);
            ET8.setEnabled(false);
            ET9.setEnabled(false);
            ET10.setEnabled(false);

            ET11.setEnabled(true);
            ET12.setEnabled(true);
            ET13.setEnabled(true);
            ET14.setEnabled(true);
            ET15.setEnabled(true);
        }

        if (runda == 3) {
            ET11.setEnabled(false);
            ET12.setEnabled(false);
            ET13.setEnabled(false);
            ET14.setEnabled(false);
            ET15.setEnabled(false);

            ET16.setEnabled(true);
            ET17.setEnabled(true);
            ET18.setEnabled(true);
            ET19.setEnabled(true);
            ET20.setEnabled(true);
        }

        if (runda == 4) {
            ET16.setEnabled(false);
            ET17.setEnabled(false);
            ET18.setEnabled(false);
            ET19.setEnabled(false);
            ET20.setEnabled(false);

            ET21.setEnabled(true);
            ET22.setEnabled(true);
            ET23.setEnabled(true);
            ET24.setEnabled(true);
            ET25.setEnabled(true);
        }

        if (runda == 5) {
            ET21.setEnabled(false);
            ET22.setEnabled(false);
            ET23.setEnabled(false);
            ET24.setEnabled(false);
            ET25.setEnabled(false);

            ET26.setEnabled(true);
            ET27.setEnabled(true);
            ET28.setEnabled(true);
            ET29.setEnabled(true);
            ET30.setEnabled(true);
        }


        runda++;


    }
}