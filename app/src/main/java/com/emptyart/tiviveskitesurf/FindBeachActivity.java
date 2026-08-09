package com.emptyart.tiviveskitesurf;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * Con una casa en Fiesta del Mar y un Atv kawasaki
 * Hacer un Tablet que sea el dash de un ATV o Cuadraciclo de ir a surfear
 * Loggeando las transiciones en una orilla de Caldera hasta que calculemos
 * una 10mil permite pescar desde la orilla una presa de mares profundos que se venga en la sombra de un casco ...
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class FindBeachActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beach);
    }

    public void onClickFindBeach(View view){
//conectar a un weather api o al MIOCIMAR, tener coordenadas de las playas
        //mapa con info en la misma actividad?
    }
}
