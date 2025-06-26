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

        String[] techWorter = {
                "KABEL", "MOUSE", "LASER", "CHIPS", "BYTES",
                "LOGIN", "CLOUD", "ROUTY", "STROM",
                "MODUS", "PIXEL", "CODES", "INPUT", "LOGIC",
                "SERIE", "AKKUS", "DRUCK", "TOOLS", "FIBER",
                "EMAIL", "LINUX", "MODUL", "DATEN", "RESET",
                "PATCH"
        };

        zufall = techWorter[new Random().nextInt(techWorter.length)];
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

        



        String input1 = ET1.getText().toString().toUpperCase();
        String input2 = ET2.getText().toString().toUpperCase();
        String input3 = ET3.getText().toString().toUpperCase();
        String input4 = ET4.getText().toString().toUpperCase();
        String input5 = ET5.getText().toString().toUpperCase();

        String input6 = ET6.getText().toString().toUpperCase();
        String input7 = ET7.getText().toString().toUpperCase();
        String input8 = ET8.getText().toString().toUpperCase();
        String input9 = ET9.getText().toString().toUpperCase();
        String input10 = ET10.getText().toString().toUpperCase();

        String input11 = ET11.getText().toString().toUpperCase();
        String input12 = ET12.getText().toString().toUpperCase();
        String input13 = ET13.getText().toString().toUpperCase();
        String input14 = ET14.getText().toString().toUpperCase();
        String input15 = ET15.getText().toString().toUpperCase();

        String input16 = ET16.getText().toString().toUpperCase();
        String input17 = ET17.getText().toString().toUpperCase();
        String input18 = ET18.getText().toString().toUpperCase();
        String input19 = ET19.getText().toString().toUpperCase();
        String input20 = ET20.getText().toString().toUpperCase();

        String input21 = ET21.getText().toString().toUpperCase();
        String input22 = ET22.getText().toString().toUpperCase();
        String input23 = ET23.getText().toString().toUpperCase();
        String input24 = ET24.getText().toString().toUpperCase();
        String input25 = ET25.getText().toString().toUpperCase();

        String input26 = ET26.getText().toString().toUpperCase();
        String input27 = ET27.getText().toString().toUpperCase();
        String input28 = ET28.getText().toString().toUpperCase();
        String input29 = ET29.getText().toString().toUpperCase();
        String input30 = ET30.getText().toString().toUpperCase();



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

        if(runda == 2)
        {
// ET6
            if (input6.equals(String.valueOf(buchstaben[0]))) {
                ET6.setBackgroundColor(Color.GREEN);
            } else if (
                    input6.equals(String.valueOf(buchstaben[1])) ||
                            input6.equals(String.valueOf(buchstaben[2])) ||
                            input6.equals(String.valueOf(buchstaben[3])) ||
                            input6.equals(String.valueOf(buchstaben[4]))
            ) {
                ET6.setBackgroundColor(Color.YELLOW);
            } else {
                ET6.setBackgroundColor(Color.RED);
            }

// ET7
            if (input7.equals(String.valueOf(buchstaben[1]))) {
                ET7.setBackgroundColor(Color.GREEN);
            } else if (
                    input7.equals(String.valueOf(buchstaben[0])) ||
                            input7.equals(String.valueOf(buchstaben[2])) ||
                            input7.equals(String.valueOf(buchstaben[3])) ||
                            input7.equals(String.valueOf(buchstaben[4]))
            ) {
                ET7.setBackgroundColor(Color.YELLOW);
            } else {
                ET7.setBackgroundColor(Color.RED);
            }

// ET8
            if (input8.equals(String.valueOf(buchstaben[2]))) {
                ET8.setBackgroundColor(Color.GREEN);
            } else if (
                    input8.equals(String.valueOf(buchstaben[0])) ||
                            input8.equals(String.valueOf(buchstaben[1])) ||
                            input8.equals(String.valueOf(buchstaben[3])) ||
                            input8.equals(String.valueOf(buchstaben[4]))
            ) {
                ET8.setBackgroundColor(Color.YELLOW);
            } else {
                ET8.setBackgroundColor(Color.RED);
            }

// ET9
            if (input9.equals(String.valueOf(buchstaben[3]))) {
                ET9.setBackgroundColor(Color.GREEN);
            } else if (
                    input9.equals(String.valueOf(buchstaben[0])) ||
                            input9.equals(String.valueOf(buchstaben[1])) ||
                            input9.equals(String.valueOf(buchstaben[2])) ||
                            input9.equals(String.valueOf(buchstaben[4]))
            ) {
                ET9.setBackgroundColor(Color.YELLOW);
            } else {
                ET9.setBackgroundColor(Color.RED);
            }

// ET10
            if (input10.equals(String.valueOf(buchstaben[4]))) {
                ET10.setBackgroundColor(Color.GREEN);
            } else if (
                    input10.equals(String.valueOf(buchstaben[0])) ||
                            input10.equals(String.valueOf(buchstaben[1])) ||
                            input10.equals(String.valueOf(buchstaben[2])) ||
                            input10.equals(String.valueOf(buchstaben[3]))
            ) {
                ET10.setBackgroundColor(Color.YELLOW);
            } else {
                ET10.setBackgroundColor(Color.RED);
            }
        }


        if(runda == 3)
        {
            // ET11
            if (input11.equals(String.valueOf(buchstaben[0]))) {
                ET11.setBackgroundColor(Color.GREEN);
            } else if (
                    input11.equals(String.valueOf(buchstaben[1])) ||
                            input11.equals(String.valueOf(buchstaben[2])) ||
                            input11.equals(String.valueOf(buchstaben[3])) ||
                            input11.equals(String.valueOf(buchstaben[4]))
            ) {
                ET11.setBackgroundColor(Color.YELLOW);
            } else {
                ET11.setBackgroundColor(Color.RED);
            }

// ET12
            if (input12.equals(String.valueOf(buchstaben[1]))) {
                ET12.setBackgroundColor(Color.GREEN);
            } else if (
                    input12.equals(String.valueOf(buchstaben[0])) ||
                            input12.equals(String.valueOf(buchstaben[2])) ||
                            input12.equals(String.valueOf(buchstaben[3])) ||
                            input12.equals(String.valueOf(buchstaben[4]))
            ) {
                ET12.setBackgroundColor(Color.YELLOW);
            } else {
                ET12.setBackgroundColor(Color.RED);
            }

// ET13
            if (input13.equals(String.valueOf(buchstaben[2]))) {
                ET13.setBackgroundColor(Color.GREEN);
            } else if (
                    input13.equals(String.valueOf(buchstaben[0])) ||
                            input13.equals(String.valueOf(buchstaben[1])) ||
                            input13.equals(String.valueOf(buchstaben[3])) ||
                            input13.equals(String.valueOf(buchstaben[4]))
            ) {
                ET13.setBackgroundColor(Color.YELLOW);
            } else {
                ET13.setBackgroundColor(Color.RED);
            }

// ET14
            if (input14.equals(String.valueOf(buchstaben[3]))) {
                ET14.setBackgroundColor(Color.GREEN);
            } else if (
                    input14.equals(String.valueOf(buchstaben[0])) ||
                            input14.equals(String.valueOf(buchstaben[1])) ||
                            input14.equals(String.valueOf(buchstaben[2])) ||
                            input14.equals(String.valueOf(buchstaben[4]))
            ) {
                ET14.setBackgroundColor(Color.YELLOW);
            } else {
                ET14.setBackgroundColor(Color.RED);
            }

// ET15
            if (input15.equals(String.valueOf(buchstaben[4]))) {
                ET15.setBackgroundColor(Color.GREEN);
            } else if (
                    input15.equals(String.valueOf(buchstaben[0])) ||
                            input15.equals(String.valueOf(buchstaben[1])) ||
                            input15.equals(String.valueOf(buchstaben[2])) ||
                            input15.equals(String.valueOf(buchstaben[3]))
            ) {
                ET15.setBackgroundColor(Color.YELLOW);
            } else {
                ET15.setBackgroundColor(Color.RED);
            }
        }

        if(runda == 4)
        {
// ET16
            if (input16.equals(String.valueOf(buchstaben[0]))) {
                ET16.setBackgroundColor(Color.GREEN);
            } else if (
                    input16.equals(String.valueOf(buchstaben[1])) ||
                            input16.equals(String.valueOf(buchstaben[2])) ||
                            input16.equals(String.valueOf(buchstaben[3])) ||
                            input16.equals(String.valueOf(buchstaben[4]))
            ) {
                ET16.setBackgroundColor(Color.YELLOW);
            } else {
                ET16.setBackgroundColor(Color.RED);
            }

// ET17
            if (input17.equals(String.valueOf(buchstaben[1]))) {
                ET17.setBackgroundColor(Color.GREEN);
            } else if (
                    input17.equals(String.valueOf(buchstaben[0])) ||
                            input17.equals(String.valueOf(buchstaben[2])) ||
                            input17.equals(String.valueOf(buchstaben[3])) ||
                            input17.equals(String.valueOf(buchstaben[4]))
            ) {
                ET17.setBackgroundColor(Color.YELLOW);
            } else {
                ET17.setBackgroundColor(Color.RED);
            }

// ET18
            if (input18.equals(String.valueOf(buchstaben[2]))) {
                ET18.setBackgroundColor(Color.GREEN);
            } else if (
                    input18.equals(String.valueOf(buchstaben[0])) ||
                            input18.equals(String.valueOf(buchstaben[1])) ||
                            input18.equals(String.valueOf(buchstaben[3])) ||
                            input18.equals(String.valueOf(buchstaben[4]))
            ) {
                ET18.setBackgroundColor(Color.YELLOW);
            } else {
                ET18.setBackgroundColor(Color.RED);
            }

// ET19
            if (input19.equals(String.valueOf(buchstaben[3]))) {
                ET19.setBackgroundColor(Color.GREEN);
            } else if (
                    input19.equals(String.valueOf(buchstaben[0])) ||
                            input19.equals(String.valueOf(buchstaben[1])) ||
                            input19.equals(String.valueOf(buchstaben[2])) ||
                            input19.equals(String.valueOf(buchstaben[4]))
            ) {
                ET19.setBackgroundColor(Color.YELLOW);
            } else {
                ET19.setBackgroundColor(Color.RED);
            }

// ET20
            if (input20.equals(String.valueOf(buchstaben[4]))) {
                ET20.setBackgroundColor(Color.GREEN);
            } else if (
                    input20.equals(String.valueOf(buchstaben[0])) ||
                            input20.equals(String.valueOf(buchstaben[1])) ||
                            input20.equals(String.valueOf(buchstaben[2])) ||
                            input20.equals(String.valueOf(buchstaben[3]))
            ) {
                ET20.setBackgroundColor(Color.YELLOW);
            } else {
                ET20.setBackgroundColor(Color.RED);
            }
        }

        if(runda == 5)
        {
// ET20
            if (input20.equals(String.valueOf(buchstaben[4]))) {
                ET20.setBackgroundColor(Color.GREEN);
            } else if (
                    input20.equals(String.valueOf(buchstaben[0])) ||
                            input20.equals(String.valueOf(buchstaben[1])) ||
                            input20.equals(String.valueOf(buchstaben[2])) ||
                            input20.equals(String.valueOf(buchstaben[3]))
            ) {
                ET20.setBackgroundColor(Color.YELLOW);
            } else {
                ET20.setBackgroundColor(Color.RED);
            }


// ET21
        if (input21.equals(String.valueOf(buchstaben[0]))) {
            ET21.setBackgroundColor(Color.GREEN);
        } else if (
                input21.equals(String.valueOf(buchstaben[1])) ||
                        input21.equals(String.valueOf(buchstaben[2])) ||
                        input21.equals(String.valueOf(buchstaben[3])) ||
                        input21.equals(String.valueOf(buchstaben[4]))
        ) {
            ET21.setBackgroundColor(Color.YELLOW);
        } else {
            ET21.setBackgroundColor(Color.RED);
        }

// ET22
        if (input22.equals(String.valueOf(buchstaben[1]))) {
            ET22.setBackgroundColor(Color.GREEN);
        } else if (
                input22.equals(String.valueOf(buchstaben[0])) ||
                        input22.equals(String.valueOf(buchstaben[2])) ||
                        input22.equals(String.valueOf(buchstaben[3])) ||
                        input22.equals(String.valueOf(buchstaben[4]))
        ) {
            ET22.setBackgroundColor(Color.YELLOW);
        } else {
            ET22.setBackgroundColor(Color.RED);
        }

// ET23
        if (input23.equals(String.valueOf(buchstaben[2]))) {
            ET23.setBackgroundColor(Color.GREEN);
        } else if (
                input23.equals(String.valueOf(buchstaben[0])) ||
                        input23.equals(String.valueOf(buchstaben[1])) ||
                        input23.equals(String.valueOf(buchstaben[3])) ||
                        input23.equals(String.valueOf(buchstaben[4]))
        ) {
            ET23.setBackgroundColor(Color.YELLOW);
        } else {
            ET23.setBackgroundColor(Color.RED);
        }

// ET24
        if (input24.equals(String.valueOf(buchstaben[3]))) {
            ET24.setBackgroundColor(Color.GREEN);
        } else if (
                input24.equals(String.valueOf(buchstaben[0])) ||
                        input24.equals(String.valueOf(buchstaben[1])) ||
                        input24.equals(String.valueOf(buchstaben[2])) ||
                        input24.equals(String.valueOf(buchstaben[4]))
        ) {
            ET24.setBackgroundColor(Color.YELLOW);
        } else {
            ET24.setBackgroundColor(Color.RED);
        }

// ET25
        if (input25.equals(String.valueOf(buchstaben[4]))) {
            ET25.setBackgroundColor(Color.GREEN);
        } else if (
                input25.equals(String.valueOf(buchstaben[0])) ||
                        input25.equals(String.valueOf(buchstaben[1])) ||
                        input25.equals(String.valueOf(buchstaben[2])) ||
                        input25.equals(String.valueOf(buchstaben[3]))
        ) {
            ET25.setBackgroundColor(Color.YELLOW);
        } else {
            ET25.setBackgroundColor(Color.RED);
        }
        }

        if(runda == 6)
        {

// ET26
            if (input26.equals(String.valueOf(buchstaben[0]))) {
                ET26.setBackgroundColor(Color.GREEN);
            } else if (
                    input26.equals(String.valueOf(buchstaben[1])) ||
                            input26.equals(String.valueOf(buchstaben[2])) ||
                            input26.equals(String.valueOf(buchstaben[3])) ||
                            input26.equals(String.valueOf(buchstaben[4]))
            ) {
                ET26.setBackgroundColor(Color.YELLOW);
            } else {
                ET26.setBackgroundColor(Color.RED);
            }

// ET27
            if (input27.equals(String.valueOf(buchstaben[1]))) {
                ET27.setBackgroundColor(Color.GREEN);
            } else if (
                    input27.equals(String.valueOf(buchstaben[0])) ||
                            input27.equals(String.valueOf(buchstaben[2])) ||
                            input27.equals(String.valueOf(buchstaben[3])) ||
                            input27.equals(String.valueOf(buchstaben[4]))
            ) {
                ET27.setBackgroundColor(Color.YELLOW);
            } else {
                ET27.setBackgroundColor(Color.RED);
            }

// ET28
            if (input28.equals(String.valueOf(buchstaben[2]))) {
                ET28.setBackgroundColor(Color.GREEN);
            } else if (
                    input28.equals(String.valueOf(buchstaben[0])) ||
                            input28.equals(String.valueOf(buchstaben[1])) ||
                            input28.equals(String.valueOf(buchstaben[3])) ||
                            input28.equals(String.valueOf(buchstaben[4]))
            ) {
                ET28.setBackgroundColor(Color.YELLOW);
            } else {
                ET28.setBackgroundColor(Color.RED);
            }

// ET29
            if (input29.equals(String.valueOf(buchstaben[3]))) {
                ET29.setBackgroundColor(Color.GREEN);
            } else if (
                    input29.equals(String.valueOf(buchstaben[0])) ||
                            input29.equals(String.valueOf(buchstaben[1])) ||
                            input29.equals(String.valueOf(buchstaben[2])) ||
                            input29.equals(String.valueOf(buchstaben[4]))
            ) {
                ET29.setBackgroundColor(Color.YELLOW);
            } else {
                ET29.setBackgroundColor(Color.RED);
            }

// ET30
            if (input30.equals(String.valueOf(buchstaben[4]))) {
                ET30.setBackgroundColor(Color.GREEN);
            } else if (
                    input30.equals(String.valueOf(buchstaben[0])) ||
                            input30.equals(String.valueOf(buchstaben[1])) ||
                            input30.equals(String.valueOf(buchstaben[2])) ||
                            input30.equals(String.valueOf(buchstaben[3]))
            ) {
                ET30.setBackgroundColor(Color.YELLOW);
            } else {
                ET30.setBackgroundColor(Color.RED);
            }
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