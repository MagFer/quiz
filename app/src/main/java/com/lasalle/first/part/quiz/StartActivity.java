package com.lasalle.first.part.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setButtonListeners();
    }

    private void setButtonListeners() { //no que castear a button ya que View ya hereda este metodo
        findViewById(R.id.buttonStart).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonStart)
        {
            System.out.println("Me pulsan start");
            Intent intent = new Intent(
                    getApplicationContext(),
                    QuestionsActivity.class);
            startActivity(intent);
        }
    }
}
