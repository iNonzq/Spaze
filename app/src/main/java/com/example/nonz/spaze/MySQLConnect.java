package com.example.nonz.spaze;


import android.app.Activity;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class MySQLConnect {

    private final Activity main;
    private List<String> list;
    private String URL = "http://10.0.2.2/" , GET_URL = "android/get_post.php?status=0";

    public MySQLConnect()
    {
        main = null;
    }

    public MySQLConnect(Activity main)
    {
        main = mainA;
        list = new ArrayList<String>();
    }

    public List<String> getData()
    {
        String url= URL + GET_URL;

        StringRequest stringRequest = new StringReader(url, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                showJSON(response);
                Toast.makeText(main, list.get(0), Toast.LENGTH_SHORT).show();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(main, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
            }



        });

        RequestQueue requestQueue = Volley.newRequestQueue(main.getApplicationContext());
        requestQueue.add(stringRequest);

        return list;
    }

    public void showJSON(String response)
    {
        String comment = "";

        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("result");

            for (int i=0; i < result.length(); i++)
            {
                JSONObject collectData = result.getJSONObject(i);
                comment = collectData.getString("commect");
                list.add(comment);
            }
        }catch (JSONException ex){ex.printStackTrace();}
    }

}
