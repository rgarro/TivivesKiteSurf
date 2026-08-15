package com.emptyart.tiviveskitesurf;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.util.Log;
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
        Spinner beaches = (Spinner) findViewById(R.id.beach);
        String beach_name = beaches.getSelectedItem().toString();
        Log.i("Beach:",beach_name);
        //concat to api url
        //https://api-windfinder-pro.p.rapidapi.com/spots/%7Bspot_id%7D/forecasts
        // Example requesting data from a specific weather spot ID
        String windfinderUrl = "https://api-windfinder-pro.p.rapidapi.com/spots/%7Bspot_id%7D/forecasts"; //"https://windfinder.com";
        new WindfinderTask().execute(windfinderUrl);
    }
}
