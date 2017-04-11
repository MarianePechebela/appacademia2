package com.example.labdesenvolvimento.appacademia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class ExercicioAdapter {


    /**
     * Created by Diego on 03/04/2017.
     */

    public class ExercicioAdapter extends ArrayAdapter<Exercicio> {
        private List<Exercicio> exercicios;
        private int layout;

        public ExercicioAdapter(Context context, int resource, List<Exercicio> exercicios){
            super(context,resource,exercicios);
            this.exercicios = exercicios;
            layout = resource;
        }

        @Override
        public View getView(int position, View contentView, ViewGroup parent){
            View localView = contentView;

            if(localView == null){
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                localView = inflater.inflate(layout,null);
            }

            Exercicio exercicio = exercicios.get(position);

            if(exercicio != null){
                TextView textID = (TextView) localView.findViewById(R.id.textID);
                TextView textNome = (TextView) localView.findViewById(R.id.textNome);
                TextView textSerie = (TextView) localView.findViewById(R.id.textSerie);
                TextView textRepeticoes = (TextView) localView.findViewById(R.id.textRepeticoes);

                if(textID != null){
                    textID.setText(String.valueOf(exercicio.getID()));
                }
                if(textNome != null){
                    textNome.setText(exercicio.getNome());
                }
                if(textSerie != null){
                    textSerie.setText(exercicio.getSerie());
                }
                if(textRepeticoes != null){
                    textRepeticoes.setText(String.valueOf(exercicio.getRepeticoes()));
                }
            }
            return localView;
        }
    }

}
