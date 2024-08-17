package org.example;


import org.example.proyecto.CoctelConJugo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CoctelConJugo coctelConJugo = new CoctelConJugo("whisky",20.0,5,"Alcohol con hielo","Alcohol del albino","Colombia",false,20.0, LocalDate.now());

    }
}