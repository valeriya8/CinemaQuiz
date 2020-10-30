package com.example.cinemaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_POINTS = "com.example.cinemaquiz.EXTRA_PONTS";
    int points = 0;

    CheckBox friends ;
    boolean answerFriends = false;

    CheckBox twoMan;
    boolean twoAndHalMan= false;

    CheckBox enola;
    boolean enolaMovie= false;

    CheckBox picky;
    boolean pickyBlinders= false;

    CheckBox sherlockHolmes;
    boolean sherlock= false;

    CheckBox bigBangTheory;
    boolean bigBang= false;

    CheckBox mila;
    boolean milaKunis;

    CheckBox selena;
    boolean selenaGomez;

    CheckBox daniela;
    boolean danielaRuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sheldon = (ImageView) findViewById(R.id.image_sheldon);
        sheldon.setImageResource(R.drawable.sheldon);
        ImageView sherlockImage = (ImageView) findViewById(R.id.image_sherlock);
        sherlockImage.setImageResource(R.drawable.sherlock);
        ImageView milaImage = (ImageView) findViewById(R.id.image_mila);
        milaImage.setImageResource(R.drawable.mila);


    }

    private int calcPoints(int plus) {

        points = points + plus;

        //Log.v("MainActivity", "Points: "+ points);
        return points;

    }


    public void submitAnswers(View v) {

        bigBangTheory = (CheckBox) findViewById(R.id.big_bang_answer);
        bigBang = bigBangTheory.isChecked();

        friends = (CheckBox) findViewById(R.id.friend_answer);
        answerFriends = friends.isChecked();

        twoMan = (CheckBox) findViewById(R.id.two_man_answer);
        twoAndHalMan = twoMan.isChecked();

        enola = (CheckBox) findViewById(R.id.enola_answer);
        enolaMovie = enola.isChecked();

        picky = (CheckBox) findViewById(R.id.picky_blinders_answer);
        pickyBlinders = picky.isChecked();

        sherlockHolmes = (CheckBox) findViewById(R.id.sherlock_holmes_answer);
        sherlock = sherlockHolmes.isChecked();

        mila = (CheckBox) findViewById(R.id.mila_answer);
        milaKunis = mila.isChecked();

        selena = (CheckBox) findViewById(R.id.answer_selena);
        selenaGomez = selena.isChecked();

        daniela = (CheckBox) findViewById(R.id.answer_dani);
        danielaRuah = daniela.isChecked();


        if(milaKunis==true){
            calcPoints(1);
            mila.setHintTextColor(getResources().getColor(R.color.colorAccent));
        }

        if (bigBang == true) {

            calcPoints(1);
            bigBangTheory.setHintTextColor(getResources().getColor(R.color.colorAccent));
        }

        if (sherlock == true) {
            calcPoints(1);
            sherlockHolmes.setHintTextColor(getResources().getColor(R.color.colorAccent));
        }

        if(danielaRuah==true){
            daniela.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if(selenaGomez==true){
            selena.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (answerFriends == true) {
            friends.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (enolaMovie == true) {
            enola.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (pickyBlinders == true) {
            picky.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (twoAndHalMan == true) {
            twoMan.setHintTextColor(getResources().getColor(R.color.colorPrimary));
        }

        display(points);

    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.total_points);
        quantityTextView.setText("" + number);
    }

    public void resetButton(View view) {

        points = 0;
        display(points);

        bigBang = false;
        bigBangTheory.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark)); //reset text color

        if(bigBangTheory.isChecked()){
            bigBangTheory.toggle(); // UnCheck the box
        }

        sherlock = false;
        sherlockHolmes.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));

        if(sherlockHolmes.isChecked()){
            sherlockHolmes.toggle();
        }


        answerFriends = false;
        friends.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(friends.isChecked()){
            friends.toggle();
        }

        enolaMovie = false;
        enola.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(enola.isChecked()){
            enola.toggle();
        }


        pickyBlinders = false;
        picky.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(picky.isChecked()){
            picky.toggle();
        }


        twoAndHalMan = false;
        twoMan.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(twoMan.isChecked()){
            twoMan.toggle();
        }

        danielaRuah=false;
        daniela.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(daniela.isChecked()){
            daniela.toggle();
        }

        selenaGomez=false;
        selena.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if(selena.isChecked()){
            selena.toggle();
        }

        milaKunis=false;
        mila.setHintTextColor(getResources().getColor(R.color.colorPrimaryDark));
        if (mila.isChecked()){
            mila.toggle();
        }
    }

    /*private String correction(boolean checked){
        String colorGreen = getResources().getColor(R.color.green);
        String colorRed = getResources().getColor(R.color.red);

        if(checked==true){
            return colorGreen;
        }
        return colorRed;
    }*/


}
