package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnAnsMagicBall);
        final ImageView imageView = (ImageView) findViewById(R.id.id_imageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int[] imageArray = {
                        R.drawable.asiseeityes,
                        R.drawable.askmeagain,
                        R.drawable.betternottelyounow,
                        R.drawable.cannotpredictnow,
                        R.drawable.concentrateandaskagain,
                        R.drawable.dontcountonit,
                        R.drawable.itiscertain,
                        R.drawable.itisdecidedlyso,
                        R.drawable.mostlikely,
                        R.drawable.myreplyisno,
                        R.drawable.mysourcesaysno,
                        R.drawable.outlookgood,
                        R.drawable.outlooknotsogood,
                        R.drawable.replyhaizytryagain,
                        R.drawable.signspointtoyes,
                        R.drawable.verydoubtful,
                        R.drawable.withoutadoubt,
                        R.drawable.yes,
                        R.drawable.yesdefinitly,
                        R.drawable.youmayrelyonit};

                Random random = new Random();
                final int randomArray = random.nextInt(20);
                imageView.setImageResource(imageArray[randomArray]);

            }
        });

    }


}
