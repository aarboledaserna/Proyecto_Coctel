package org.example.proyecto;

public abstract class Coctel {
    private String nombre;
    private Double precio;
    private Integer cantidad;
    private String descripcion;
    private String categoria;
    private String PaisOrigen;
    private Boolean enPromocion;
    private Double gradoAlcohol;

    public Coctel(String nombre, Double precio, Integer cantidad, String descripcion, String categoria, String PaisOrigen, Boolean enPromocion, Double gradoAlcohol) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.PaisOrigen = PaisOrigen;
        this.enPromocion = enPromocion;
        this.gradoAlcohol = gradoAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public Boolean getEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(Boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public Double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(Double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public abstract Double costoDeVenta();

}
