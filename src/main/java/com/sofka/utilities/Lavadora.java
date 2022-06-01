package com.sofka.utilities;


public class Lavadora extends Electrodomestico {
    private Double carga;
    private final Integer CARGA = 5;

    public Lavadora() {
        super();
        this.carga = Double.valueOf(CARGA);
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga = Double.valueOf(Float.valueOf(CARGA));
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    @Override
    public Double precioFinal() {
        Double aumento = 0.0;
        if (this.carga > 30.0){
            aumento += 50;
        }
        return super.precioFinal() + aumento;
    }
}
