/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.model;

import static java.lang.Math.pow;

/**
 *
 * @author oneide
 */
public class CalculoIMC {
    public static double calcularIMC(double peso, double altura) {
        return peso / pow(altura, 2);
    }

    public static String analisarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 40) {
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }
    }
}