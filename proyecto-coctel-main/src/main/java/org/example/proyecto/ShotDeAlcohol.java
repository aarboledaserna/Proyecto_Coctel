package org.example.proyecto;

public class ShotDeAlcohol extends Coctel{

    private String tipo;

    public ShotDeAlcohol(String nombre, Double precio, Integer cantidad, String descripcion, String categoria, String PaisOrigen, Boolean enPromocion, Double gradoAlcohol, String tipo) {
        super(nombre, precio, cantidad, descripcion, categoria, PaisOrigen, enPromocion, gradoAlcohol);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Double costoDeVenta() {
        return getCantidad() * getPrecio();
    }

}
