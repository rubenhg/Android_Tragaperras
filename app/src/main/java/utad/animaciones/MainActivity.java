package utad.animaciones;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView [] frames;
    private Drawable [][] images;
    private Integer [] [] values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frames = new ImageView[9];
        images = new Drawable[3][9];
        values = new Integer[3][9];

        frames[0] = (ImageView)findViewById(R.id.image1);
        frames[1] = (ImageView)findViewById(R.id.image2);
        frames[2] = (ImageView)findViewById(R.id.image3);
        frames[3] = (ImageView)findViewById(R.id.image4);
        frames[4] = (ImageView)findViewById(R.id.image5);
        frames[5] = (ImageView)findViewById(R.id.image6);
        frames[6] = (ImageView)findViewById(R.id.image7);
        frames[7] = (ImageView)findViewById(R.id.image8);
        frames[8] = (ImageView)findViewById(R.id.image9);

        //Columna1

        images [0][0] = getResources().getDrawable(R.drawable.tragaperras1);
        values[0][0] = 1;
        images [0][1] = getResources().getDrawable(R.drawable.tragaperras2);
        values[0][1] = 2;
        images [0][2] = getResources().getDrawable(R.drawable.tragaperras3);
        values[0][2] = 3;
        images [0][3] = getResources().getDrawable(R.drawable.tragaperras4);
        values[0][3] = 4;
        images [0][4] = getResources().getDrawable(R.drawable.tragaperras5);
        values[0][4] = 5;
        images [0][5] = getResources().getDrawable(R.drawable.tragaperras6);
        values[0][5] = 6;
        images [0][6] = getResources().getDrawable(R.drawable.tragaperras7);
        values[0][6] = 7;
        images [0][7] = getResources().getDrawable(R.drawable.tragaperras8);
        values[0][7] = 8;
        images [0][8] = getResources().getDrawable(R.drawable.tragaperras9);
        values[0][8] = 9;

        //Columna2

        images [1][0] = getResources().getDrawable(R.drawable.tragaperras3);
        values[1][0] = 1;
        images [1][1] = getResources().getDrawable(R.drawable.tragaperras5);
        values[1][1] = 2;
        images [1][2] = getResources().getDrawable(R.drawable.tragaperras7);
        values[1][2] = 3;
        images [1][3] = getResources().getDrawable(R.drawable.tragaperras9);
        values[1][3] = 4;
        images [1][4] = getResources().getDrawable(R.drawable.tragaperras2);
        values[1][4] = 5;
        images [1][5] = getResources().getDrawable(R.drawable.tragaperras4);
        values[1][5] = 6;
        images [1][6] = getResources().getDrawable(R.drawable.tragaperras6);
        values[1][6] = 7;
        images [1][7] = getResources().getDrawable(R.drawable.tragaperras8);
        values[1][7] = 8;
        images [1][8] = getResources().getDrawable(R.drawable.tragaperras1);
        values[1][8] = 9;

        //Columna2

        images [2][0] = getResources().getDrawable(R.drawable.tragaperras5);
        values[2][0] = 1;
        images [2][1] = getResources().getDrawable(R.drawable.tragaperras7);
        values[2][1] = 2;
        images [2][2] = getResources().getDrawable(R.drawable.tragaperras9);
        values[2][2] = 3;
        images [2][3] = getResources().getDrawable(R.drawable.tragaperras2);
        values[2][3] = 4;
        images [2][4] = getResources().getDrawable(R.drawable.tragaperras4);
        values[2][4] = 5;
        images [2][5] = getResources().getDrawable(R.drawable.tragaperras6);
        values[2][5] = 6;
        images [2][6] = getResources().getDrawable(R.drawable.tragaperras8);
        values[2][6] = 7;
        images [2][7] = getResources().getDrawable(R.drawable.tragaperras1);
        values[2][7] = 8;
        images [2][8] = getResources().getDrawable(R.drawable.tragaperras3);
        values[2][8] = 9;

    }
}
