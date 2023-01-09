package com.example.facturacion;
import com.google.cloud.functions.CloudEventsFunction;
import io.cloudevents.CloudEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Autentification {
    static String data;
    public static void main(String[] args) throws IOException{
        URL url = new URL("https://quickstart-function-ajeb6npmea-rj.a.run.app");    
        URLConnection connection = url.openConnection();
        
        // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");
 
        try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream())))
        {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                if(line.equals("true")){
                    System.out.println("request recibida");
                }
            }
            
        }
    }
    

    
    
}
