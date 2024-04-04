package org.example;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Gson object
        Gson gson = new Gson();

        // Serialize an object to JSON
        Alumno alumno = new Alumno("María Sisamón", 26);
        String json = gson.toJson(alumno);
        System.out.println("Serialized JSON: " + json);

        // Deserialize JSON to an object
        String jsonString = "{\"nombre\":\"Pedro Romero\",\"edad\":24}";
        Alumno deserializedAl = gson.fromJson(jsonString, Alumno.class);
        System.out.println("Deserialized Alumno: " + deserializedAl);
    }
}