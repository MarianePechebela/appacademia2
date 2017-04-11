package com.example.labdesenvolvimento.appacademia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectMainOpetion(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnInserir:
                intent = new Intent(this,InsertExercicioActivity.class);
                break;
            case R.id.btnListar:
                intent = new Intent(this,ListExercicioActivity.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
