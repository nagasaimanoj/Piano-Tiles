package blogspot.nagasaimanoj.in.pianotiles;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn11, btn12, btn13, btn14, btn21, btn22, btn23, btn24, btn31, btn32, btn33, btn34, btn41, btn42, btn43, btn44;
    int rand, score = 0, prevRand;
    Random random = new Random();
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initXML();
        logic();
    }

    private void logic() {
        prevRand = rand;
        rand = random.nextInt(16) + 1;
        while (rand == prevRand)
            rand = random.nextInt(16) + 1;
        if (score == 0) {
            startGame();
        } else {
            continueGame();
        }
    }

    void continueGame() {
        str = "" + score;
        switch (rand) {
            case 1:
                btn11.setBackgroundColor(Color.CYAN);
                btn11.setText(str);
                break;
            case 2:
                btn12.setBackgroundColor(Color.CYAN);
                btn12.setText(str);
                break;
            case 3:
                btn13.setBackgroundColor(Color.CYAN);
                btn13.setText(str);
                break;
            case 4:
                btn14.setBackgroundColor(Color.CYAN);
                btn14.setText(str);
                break;
            case 5:
                btn21.setBackgroundColor(Color.CYAN);
                btn21.setText(str);
                break;
            case 6:
                btn22.setBackgroundColor(Color.CYAN);
                btn22.setText(str);
                break;
            case 7:
                btn23.setBackgroundColor(Color.CYAN);
                btn23.setText(str);
                break;
            case 8:
                btn24.setBackgroundColor(Color.CYAN);
                btn24.setText(str);
                break;
            case 9:
                btn31.setBackgroundColor(Color.CYAN);
                btn31.setText(str);
                break;
            case 10:
                btn32.setBackgroundColor(Color.CYAN);
                btn32.setText(str);
                break;
            case 11:
                btn33.setBackgroundColor(Color.CYAN);
                btn33.setText(str);
                break;
            case 12:
                btn34.setBackgroundColor(Color.CYAN);
                btn34.setText(str);
                break;
            case 13:
                btn41.setBackgroundColor(Color.CYAN);
                btn41.setText(str);
                break;
            case 14:
                btn42.setBackgroundColor(Color.CYAN);
                btn42.setText(str);
                break;
            case 15:
                btn43.setBackgroundColor(Color.CYAN);
                btn43.setText(str);
                break;
            case 16:
                btn44.setBackgroundColor(Color.CYAN);
                btn44.setText(str);
                break;
        }
    }

    private void startGame() {
        str = "GO";
        switch (rand) {
            case 1:
                btn11.setBackgroundColor(Color.GREEN);
                btn11.setText(str);
                break;
            case 2:
                btn12.setBackgroundColor(Color.GREEN);
                btn12.setText(str);
                break;
            case 3:
                btn13.setBackgroundColor(Color.GREEN);
                btn13.setText(str);
                break;
            case 4:
                btn14.setBackgroundColor(Color.GREEN);
                btn14.setText(str);
                break;
            case 5:
                btn21.setBackgroundColor(Color.GREEN);
                btn21.setText(str);
                break;
            case 6:
                btn22.setBackgroundColor(Color.GREEN);
                btn22.setText(str);
                break;
            case 7:
                btn23.setBackgroundColor(Color.GREEN);
                btn23.setText(str);
                break;
            case 8:
                btn24.setBackgroundColor(Color.GREEN);
                btn24.setText(str);
                break;
            case 9:
                btn31.setBackgroundColor(Color.GREEN);
                btn31.setText(str);
                break;
            case 10:
                btn32.setBackgroundColor(Color.GREEN);
                btn32.setText(str);
                break;
            case 11:
                btn33.setBackgroundColor(Color.GREEN);
                btn33.setText(str);
                break;
            case 12:
                btn34.setBackgroundColor(Color.GREEN);
                btn34.setText(str);
                break;
            case 13:
                btn41.setBackgroundColor(Color.GREEN);
                btn41.setText(str);
                break;
            case 14:
                btn42.setBackgroundColor(Color.GREEN);
                btn42.setText(str);
                break;
            case 15:
                btn43.setBackgroundColor(Color.GREEN);
                btn43.setText(str);
                break;
            case 16:
                btn44.setBackgroundColor(Color.GREEN);
                btn44.setText(str);
                break;
        }
    }

    private void initXML() {
        btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(this);
        btn12 = (Button) findViewById(R.id.btn12);
        btn12.setOnClickListener(this);
        btn13 = (Button) findViewById(R.id.btn13);
        btn13.setOnClickListener(this);
        btn14 = (Button) findViewById(R.id.btn14);
        btn14.setOnClickListener(this);
        btn21 = (Button) findViewById(R.id.btn21);
        btn21.setOnClickListener(this);
        btn22 = (Button) findViewById(R.id.btn22);
        btn22.setOnClickListener(this);
        btn23 = (Button) findViewById(R.id.btn23);
        btn23.setOnClickListener(this);
        btn24 = (Button) findViewById(R.id.btn24);
        btn24.setOnClickListener(this);
        btn31 = (Button) findViewById(R.id.btn31);
        btn31.setOnClickListener(this);
        btn32 = (Button) findViewById(R.id.btn32);
        btn32.setOnClickListener(this);
        btn33 = (Button) findViewById(R.id.btn33);
        btn33.setOnClickListener(this);
        btn34 = (Button) findViewById(R.id.btn34);
        btn34.setOnClickListener(this);
        btn41 = (Button) findViewById(R.id.btn41);
        btn41.setOnClickListener(this);
        btn42 = (Button) findViewById(R.id.btn42);
        btn42.setOnClickListener(this);
        btn43 = (Button) findViewById(R.id.btn43);
        btn43.setOnClickListener(this);
        btn44 = (Button) findViewById(R.id.btn44);
        btn44.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn11:
                if (rand == 1) {
                    btn11.setBackgroundColor(Color.WHITE);
                    btn11.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn11.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn12:
                if (rand == 2) {
                    btn12.setBackgroundColor(Color.WHITE);
                    btn12.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn12.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn13:
                if (rand == 3) {
                    btn13.setBackgroundColor(Color.WHITE);
                    btn13.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn13.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn14:
                if (rand == 4) {
                    btn14.setBackgroundColor(Color.WHITE);
                    btn14.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn14.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn21:
                if (rand == 5) {
                    btn21.setBackgroundColor(Color.WHITE);
                    btn21.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn21.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn22:
                if (rand == 6) {
                    btn22.setBackgroundColor(Color.WHITE);
                    btn22.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn22.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn23:
                if (rand == 7) {
                    btn23.setBackgroundColor(Color.WHITE);
                    btn23.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn23.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn24:
                if (rand == 8) {
                    btn24.setBackgroundColor(Color.WHITE);
                    btn24.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn24.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn31:
                if (rand == 9) {
                    btn31.setBackgroundColor(Color.WHITE);
                    btn31.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn31.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn32:
                if (rand == 10) {
                    btn32.setBackgroundColor(Color.WHITE);
                    btn32.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn32.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn33:
                if (rand == 11) {
                    btn33.setBackgroundColor(Color.WHITE);
                    btn33.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn33.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn34:
                if (rand == 12) {
                    btn34.setBackgroundColor(Color.WHITE);
                    btn34.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn34.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn41:
                if (rand == 13) {
                    btn41.setBackgroundColor(Color.WHITE);
                    btn41.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn41.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn42:
                if (rand == 14) {
                    btn42.setBackgroundColor(Color.WHITE);
                    btn42.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn42.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn43:
                if (rand == 15) {
                    btn43.setBackgroundColor(Color.WHITE);
                    btn43.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn43.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
            case R.id.btn44:
                if (rand == 16) {
                    btn44.setBackgroundColor(Color.WHITE);
                    btn44.setText("");
                    score++;
                    logic();
                } else {
                    clearXML();
                    btn44.setBackgroundColor(Color.RED);
                    gameOver();
                }
                break;
        }
    }

    private void clearXML() {
        btn11.setBackgroundColor(Color.WHITE);
        btn12.setBackgroundColor(Color.WHITE);
        btn13.setBackgroundColor(Color.WHITE);
        btn14.setBackgroundColor(Color.WHITE);
        btn21.setBackgroundColor(Color.WHITE);
        btn22.setBackgroundColor(Color.WHITE);
        btn23.setBackgroundColor(Color.WHITE);
        btn24.setBackgroundColor(Color.WHITE);
        btn31.setBackgroundColor(Color.WHITE);
        btn32.setBackgroundColor(Color.WHITE);
        btn33.setBackgroundColor(Color.WHITE);
        btn34.setBackgroundColor(Color.WHITE);
        btn41.setBackgroundColor(Color.WHITE);
        btn42.setBackgroundColor(Color.WHITE);
        btn43.setBackgroundColor(Color.WHITE);
        btn44.setBackgroundColor(Color.WHITE);
    }

    private void gameOver() {

    }
}