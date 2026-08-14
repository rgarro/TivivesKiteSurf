package com.emptyart.tiviveskitesurf;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
public class FetchWindDataTask extends AsyncTask<String, Void, String> {

    private static final String TAG = "WindfinderTask";

    @Override
    protected String doInBackground(String... urls){
        String result = "";
        HttpURLConnection urlConnection = null;//https://api-windfinder-pro.p.rapidapi.com/spots/%7Bspot_id%7D/forecasts
        BufferedReader reader = null;

        try {
            // Android 2.3 requires a direct HttpURLConnection configuration
            URL url = new URL(urls[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(10000); // 10 seconds timeout
            urlConnection.setReadTimeout(10000);

            // Connect and check HTTP response code
            urlConnection.connect();
            int responseCode = urlConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response stream line by line
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(urlConnection.getInputStream())
                );
                String line;
                StringBuilder buffer = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    buffer.append(line);
                }
                in.close();
                result = buffer.toString();
            } else {
                Log.e(TAG, "HTTP Error Code: " + responseCode);
            }

        } catch (Exception e) {
            Log.e(TAG, "Connection or parsing error: " + e.getMessage());
        } finally {
            // Always free up system resources on old Android platforms
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return result;
    }
}
