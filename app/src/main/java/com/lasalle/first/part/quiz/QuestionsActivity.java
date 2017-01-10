package com.lasalle.first.part.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    private void setButtonListeners() { //no que castear a button ya que View ya hereda este metodo
        findViewById(R.id.buttonStart).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonSubmit)
        {
            System.out.println("Me pulsan submit");
            Intent intent = new Intent(
                    getApplicationContext(),
                    QuestionsActivity.class);
            startActivity(intent);
        }
    }
}
