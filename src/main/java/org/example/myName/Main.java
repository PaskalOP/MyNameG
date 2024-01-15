package org.example.myName;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Dto myName = new Dto("Olha","Paskal");
        Gson myNameJO = new GsonBuilder().setPrettyPrinting().create();


        System.out.println(myNameJO.toJson(myName));
    }
}