package com.sofka.utilities;

public class Television extends Electrodomestico{

    private Double resolucion;
    private Boolean sintonizador;
    private final Double RESOLUCION = 20.0;
    private final Boolean SINTONIZADOR = false;

    public Television() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizador = SINTONIZADOR;
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.sintonizador = SINTONIZADOR;
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Double resolucion, Boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    @Override
    public Double precioFinal(){
        Double aumento = 0.0;
        if (this.resolucion > 40.0){
            aumento = this.precioBase * 0.3;
        }
        return super.precioFinal() + aumento;
    }

}
