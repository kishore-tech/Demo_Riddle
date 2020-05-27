package sg.edu.rp.c346.id18037611.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity3 extends AppCompatActivity {

    //Suppose to be Activity 2
    //Suppose to be Activity 2
    //Suppose to be Activity 2

    TextView tvAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer03);

        tvAnswer = findViewById(R.id.textView);
        //tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionsSelected + " answer is: Gone");
    }
}
