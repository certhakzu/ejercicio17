package com.sofka.utilities;


public class Electrodomestico {
    protected Double precioBase;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    private static final Integer PRECIO_BASE = 100;
    private static final String COLOR_DEFAULT = "BLANCO";
    private static final Character CONSUMO_ENERGETICO = 'F';
    private static final Integer PESO_DEFAULT = 5;

    public Electrodomestico() {
        precioBase = Double.valueOf(PRECIO_BASE);
        color = COLOR_DEFAULT;
        consumoEnergetico = CONSUMO_ENERGETICO;
        peso = Double.valueOf(PESO_DEFAULT);
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        switch (String.valueOf(letra).toUpperCase()){
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                this.consumoEnergetico = Character.toUpperCase(letra);
                break;
            default:
                this.consumoEnergetico = CONSUMO_ENERGETICO;
        }
    }

    private void comprobarColor(String color){
        switch (color.toUpperCase()){
            case COLOR_DEFAULT:
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":
                this.color = color.toUpperCase();
                break;
            default:
                this.color = COLOR_DEFAULT;
        }
    }

    public Double precioFinal(){
        Integer aumento = 0;
        switch (consumoEnergetico){
            case 'A':
                aumento = 100;
                break;
            case 'B':
                aumento = 80;
                break;
            case 'C':
                aumento = 60;
                break;
            case 'D':
                aumento = 50;
                break;
            case 'E':
                aumento = 30;
                break;
            case 'F':
                aumento = 10;
                break;
            default:
                aumento = 0;
        }

        if (peso <= 19) {
            aumento += 10;
        }else if (peso <= 49){
            aumento += 50;
        }else if (peso <= 79){
            aumento += 80;
        }else {
            aumento += 100;
        }

        return precioBase + aumento;
    }


}
