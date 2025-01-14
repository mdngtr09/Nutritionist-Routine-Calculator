/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.model;

/**
 *
 * @author oneide
 */

public class CalculoGastoCalorico {
    public static double calcularGastoBasal(String sexo, double peso, double altura, int idade) {
        if (sexo.equalsIgnoreCase("Homem")) {
            return 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
        } else {
            return 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
        }
    }

    public static double calcularGastoBasalTotal(double gastoBasal, String nivelAtividade) {
        switch (nivelAtividade) {
            case "Sedentário" -> {
                return gastoBasal * 1.2;
            }
            case "Leve" -> {
                return gastoBasal * 1.375;
            }
            case "Moderado" -> {
                return gastoBasal * 1.55;
            }
            case "Ativo" -> {
                return gastoBasal * 1.725;
            }
            case "Extremamente Ativo" -> {
                return gastoBasal * 1.9;
            }
            default -> throw new IllegalArgumentException("Nível de atividade inválido.");
        }
    }
}