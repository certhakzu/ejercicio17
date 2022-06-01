package com.sofka.test;

import com.sofka.utilities.Electrodomestico;
import com.sofka.utilities.Lavadora;
import com.sofka.utilities.Television;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(30.0, "NEGRO", 'D', 4.4, 3.0);
        electrodomesticos[2] = new Lavadora(25.0, 2.3);
        electrodomesticos[3] = new Lavadora(10.0, 3.1);
        electrodomesticos[4] = new Television();
        electrodomesticos[5] = new Television(50.2, 3.0);
        electrodomesticos[6] = new Television(18.3, 4.2);
        electrodomesticos[7] = new Television(31.0, "AZUL", 'A', 5.2, 42.0, true);
        electrodomesticos[8] = new Lavadora();
        electrodomesticos[9] = new Television();

        for (Electrodomestico electrodomestico : electrodomesticos){
            logger.log(Level.INFO, " {0}", electrodomestico);
        }

        Double sumaElectrodomesticosGenerales = 0.0;
        Double sumaLavadoras = 0.0;
        Double sumaTelevisores = 0.0;

        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Lavadora){
                sumaLavadoras += electrodomestico.precioFinal();
            }else if (electrodomestico instanceof Television){
                sumaTelevisores += electrodomestico.precioFinal();
            }else {
                sumaElectrodomesticosGenerales += electrodomestico.precioFinal();
            }
        }
        Double sumaTotal = sumaElectrodomesticosGenerales + sumaLavadoras + sumaTelevisores;
        String message = "Precio total: " + sumaTotal + " (Generales: " + sumaElectrodomesticosGenerales +
                " Lavadoras: " + sumaLavadoras + " Televisiones: " + sumaTelevisores + ")";
        logger.log(Level.INFO, " {0}", message);
    }
}
