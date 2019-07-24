package com.example.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;
    Button btn4, btn5, btn6;
    Button btn7, btn8, btn9;

    int turn=0;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);

        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
        btn7.setOnClickListener(MainActivity.this);
        btn8.setOnClickListener(MainActivity.this);
        btn9.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_1)
        {
            if (turn%2 == 0)
            {
                btn1.setText("X");
            }

            else
            {
                btn1.setText("O");
            }

            if ((btn1.getText() == "X") && (btn2.getText() == "X") && (btn3.getText() == "X"))
            {
                show1();
            }

            if ((btn1.getText() == "X") && (btn4.getText() == "X") && (btn7.getText() == "X"))
            {
                show1();
            }

            if ((btn1.getText() == "X") && (btn5.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }


            if ((btn1.getText() == "O") && (btn2.getText() == "O") && (btn3.getText() == "O"))
            {
                show2();
            }

            if ((btn1.getText() == "O") && (btn4.getText() == "O") && (btn7.getText() == "O"))
            {
                show2();
            }

            if ((btn1.getText() == "O") && (btn5.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            btn1.setEnabled(false);

            turn++;

            if(flag)
            {
                btn1.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_2)
        {
            if(turn%2 == 0)
            {
                btn2.setText("X");
            }

            else
            {
                btn2.setText("O");
            }

            if ((btn2.getText() == "X") && (btn1.getText() == "X") && (btn3.getText() == "X"))
            {
                show1();
            }

            if ((btn2.getText() == "X") && (btn5.getText() == "X") && (btn8.getText() == "X"))
            {
                show1();
            }

            if ((btn2.getText() == "O") && (btn1.getText() == "O") && (btn3.getText() == "O"))
            {
                show2();
            }

            if ((btn2.getText() == "O") && (btn5.getText() == "O") && (btn8.getText() == "O"))
            {
                show2();
            }

            btn2.setEnabled(false);

            turn++;

            if(flag)
            {
                btn2.setEnabled(true);
                turn=0;
                flag=false;
            }


            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_3)
        {
            if(turn%2 == 0)
            {
                btn3.setText("X");
            }

            else
            {
                btn3.setText("O");
            }


            if ((btn3.getText() == "X") && (btn2.getText() == "X") && (btn1.getText() == "X"))
            {
                show1();
            }

            if ((btn3.getText() == "X") && (btn6.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }

            if ((btn3.getText() == "X") && (btn5.getText() == "X") && (btn7.getText() == "X"))
            {
                show1();
            }

            if ((btn3.getText() == "O") && (btn2.getText() == "O") && (btn1.getText() == "O"))
            {
                show2();
            }

            if ((btn3.getText() == "O") && (btn6.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            if ((btn3.getText() == "O") && (btn5.getText() == "O") && (btn7.getText() == "O"))
            {
                show2();
            }

            btn3.setEnabled(false);

            turn++;

            if(flag)
            {
                btn3.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_4)
        {
            if(turn%2 == 0)
            {
                btn4.setText("X");
            }

            else
            {
                btn4.setText("O");
            }

            if ((btn4.getText() == "X") && (btn5.getText() == "X") && (btn6.getText() == "X"))
            {
                show1();
            }

            if ((btn4.getText() == "X") && (btn1.getText() == "X") && (btn7.getText() == "X"))
            {
                show1();
            }

            if ((btn4.getText() == "O") && (btn5.getText() == "O") && (btn6.getText() == "O"))
            {
                show2();
            }

            if ((btn4.getText() == "O") && (btn1.getText() == "O") && (btn7.getText() == "O"))
            {
                show2();
            }

            btn4.setEnabled(false);

            turn++;

            if(flag)
            {
                btn4.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_5)
        {
            if(turn%2 == 0)
            {
                btn5.setText("X");
            }
            else
            {
                btn5.setText("O");
            }

            if ((btn5.getText() == "X") && (btn1.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }

            if ((btn5.getText() == "X") && (btn3.getText() == "X") && (btn7.getText() == "X"))
            {
                show1();
            }

            if ((btn5.getText() == "X") && (btn4.getText() == "X") && (btn6.getText() == "X"))
            {
                show1();
            }

            if ((btn5.getText() == "X") && (btn2.getText() == "X") && (btn8.getText() == "X"))
            {
                show1();
            }

            if ((btn5.getText() == "O") && (btn1.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            if ((btn5.getText() == "O") && (btn3.getText() == "O") && (btn7.getText() == "O"))
            {
                show2();
            }

            if ((btn5.getText() == "O") && (btn4.getText() == "O") && (btn6.getText() == "O"))
            {
                show2();
            }

            if ((btn5.getText() == "O") && (btn2.getText() == "O") && (btn8.getText() == "O"))
            {
                show2();
            }

            btn5.setEnabled(false);

            turn++;

            if(flag)
            {
                btn5.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_6)
        {
            if(turn%2 == 0)
            {
                btn6.setText("X");
            }
            else
            {
                btn6.setText("O");
            }

            if ((btn6.getText() == "X") && (btn3.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }

            if ((btn6.getText() == "X") && (btn4.getText() == "X") && (btn5.getText() == "X"))
            {
                show1();
            }

            if ((btn6.getText() == "O") && (btn3.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            if ((btn6.getText() == "O") && (btn4.getText() == "O") && (btn5.getText() == "O"))
            {
                show2();
            }

            btn6.setEnabled(false);

            turn++;

            if(flag)
            {
                btn6.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_7)
        {
            if(turn%2 == 0)
            {
                btn7.setText("X");
            }

            else
            {
                btn7.setText("O");
            }

            if ((btn7.getText() == "X") && (btn5.getText() == "X") && (btn3.getText() == "X"))
            {
                show1();
            }

            if ((btn7.getText() == "X") && (btn4.getText() == "X") && (btn1.getText() == "X"))
            {
                show1();
            }

            if ((btn7.getText() == "X") && (btn8.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }

            if ((btn7.getText() == "O") && (btn5.getText() == "O") && (btn3.getText() == "O"))
            {
                show2();
            }

            if ((btn7.getText() == "O") && (btn4.getText() == "O") && (btn1.getText() == "O"))
            {
                show2();
            }

            if ((btn7.getText() == "O") && (btn8.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            btn7.setEnabled(false);

            turn++;

            if(flag)
            {
                btn7.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_8)
        {
            if(turn%2 == 0)
            {
                btn8.setText("X");
            }

            else
            {
                btn8.setText("O");
            }

            if ((btn8.getText() == "X") && (btn5.getText() == "X") && (btn2.getText() == "X"))
            {
                show1();
            }

            if ((btn8.getText() == "X") && (btn7.getText() == "X") && (btn9.getText() == "X"))
            {
                show1();
            }

            if ((btn8.getText() == "O") && (btn5.getText() == "O") && (btn2.getText() == "O"))
            {
                show2();
            }

            if ((btn8.getText() == "O") && (btn7.getText() == "O") && (btn9.getText() == "O"))
            {
                show2();
            }

            btn8.setEnabled(false);

            turn++;

            if(flag)
            {
                btn8.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }

        if(v.getId()==R.id.btn_9)
        {
            if(turn%2 == 0)
            {
                btn9.setText("X");
            }

            else
            {
                btn9.setText("O");
            }

            if ((btn9.getText() == "X") && (btn5.getText() == "X") && (btn1.getText() == "X"))
            {
                show1();
            }

            if ((btn9.getText() == "X") && (btn6.getText() == "X") && (btn3.getText() == "X"))
            {
                show1();
            }

            if ((btn9.getText() == "X") && (btn8.getText() == "X") && (btn7.getText() == "X"))
            {
                show1();
            }

            if ((btn9.getText() == "O") && (btn5.getText() == "O") && (btn1.getText() == "O"))
            {
                show2();
            }

            if ((btn9.getText() == "O") && (btn6.getText() == "O") && (btn3.getText() == "O"))
            {
                show2();
            }

            if ((btn9.getText() == "O") && (btn8.getText() == "O") && (btn7.getText() == "O"))
            {
                show2();

            }

            btn9.setEnabled(false);

            turn++;

            if(flag)
            {
                btn9.setEnabled(true);
                turn=0;
                flag=false;
            }

            if(turn==9)
            {
                gameReset();
            }

        }
    }


    public void show1()

    {
        Toast.makeText(MainActivity.this,"Player 1 Won",Toast.LENGTH_LONG).show();
        gameReset();
        flag=true;

    }

    public void show2()
    {
        Toast.makeText(MainActivity.this,"Player 2 won", Toast.LENGTH_LONG).show();
        gameReset();
        flag=true;
    }


    public void gameReset()
    {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        turn=0;

    }
}
