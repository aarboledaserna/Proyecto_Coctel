package org.example.proyecto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CoctelConJugo extends Coctel{

    private LocalDate diaEnQueSeVence;

    public CoctelConJugo(String nombre, Double precio, Integer cantidad, String descripcion, String categoria, String PaisOrigen, Boolean enPromocion, Double gradoAlcohol, LocalDate diaEnQueSeVence) {
        super(nombre, precio, cantidad, descripcion, categoria, PaisOrigen, enPromocion, gradoAlcohol);
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    public LocalDate getDiaEnQueSeVence() {
        return diaEnQueSeVence;
    }

    public void setDiaEnQueSeVence(LocalDate diaEnQueSeVence) {
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    @Override
    public Double costoDeVenta() {
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), diaEnQueSeVence);
        Double descuento = 0.0;

        if (diasRestantes == 3) {
            descuento = 0.02;
        } else if (diasRestantes == 2) {
            descuento = 0.035;
        } else if (diasRestantes == 1) {
            descuento = 0.05;
        }

        Double costoNormal = getCantidad() * getPrecio();
        return costoNormal - (costoNormal * descuento);
    }

}
