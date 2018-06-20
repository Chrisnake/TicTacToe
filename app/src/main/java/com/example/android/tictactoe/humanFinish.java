package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class humanFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_finish);


        Button replayHuman = findViewById(R.id.replayHuman);
        replayHuman.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent playIntent = new Intent(humanFinish.this, Human.class); //Points it back to the human activity
                startActivity(playIntent);
            }
        });

        Button replayCPU = findViewById(R.id.replayCPU);
        replayCPU.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent playIntent = new Intent(humanFinish.this, CPU.class); //Points it back to the human activity
                startActivity(playIntent);
            }
        });

        Button Home = findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent playIntent = new Intent(humanFinish.this, MainMenu.class); //Points it back to the human activity
                startActivity(playIntent);
            }
        });
    }
}
