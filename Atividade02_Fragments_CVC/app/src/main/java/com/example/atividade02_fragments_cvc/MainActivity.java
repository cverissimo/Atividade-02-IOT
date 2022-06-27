package com.example.atividade02_fragments_cvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{

    private RightFragment rightfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightfragment = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.frgRight);
    }

    @Override
    public void onFragmentInteraction(String text)
    {
        rightfragment.definirCor(text);
    }
}