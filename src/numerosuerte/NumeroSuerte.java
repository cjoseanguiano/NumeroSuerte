/*
Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
Número de la suerte: 28
 */
package numerosuerte;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroSuerte {

    public static void main(String[] args) {

        int dia;
        int mes;
        int amo;
        int suerte;
        int v1, v2, v3, v4, v5;
        int resultado;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Mes"));
        amo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Año"));

        if (dia > 0 && dia <= 31) {
            System.out.println("DIA");
        } else {
            System.out.println("Verifica DIA");
            return;
        }
        if (mes > 0 && mes <= 12) {
            System.out.println("MES");
        } else {
            System.out.println("Verifica MES");
            return;

        }
        if (amo > 0 && amo < 2017) {
            System.out.println("AÑO");
        } else {
            System.out.println("Verifica AÑO");
            return;

        }
        suerte = dia + mes + amo;
        v1 = suerte / 1000;
        v2 = suerte / 100 % 10;
        v3 = suerte / 10 % 10;
        v4 = suerte % 10;

        resultado = v1 + v2 + v3 + v4;
        System.out.println("Numero suerte " + resultado);
    }

}
