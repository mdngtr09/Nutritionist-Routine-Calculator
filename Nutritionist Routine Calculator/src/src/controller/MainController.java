/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.controller;

/**
 *
 * @author oneide
 */


import src.model.CalculoGastoCalorico;
import src.model.CalculoIMC;
import src.model.CalculoRecomendacoes;


public class MainController {
	// IMC
    public double calcularIMC(double peso, double altura) {
        double alturaMetros = altura / 100;
        return CalculoIMC.calcularIMC(peso, alturaMetros);
    }

    public String analisarIMC(double imc) {
        return CalculoIMC.analisarIMC(imc);
    }

    // Gasto Calórico
    public double calcularGastoBasal(String sexo, double peso, double altura, int idade) {
        return CalculoGastoCalorico.calcularGastoBasal(sexo, peso, altura, idade);
    }

    public double calcularGastoTotal(double gastoBasal, String nivelAtividade) {
        return CalculoGastoCalorico.calcularGastoBasalTotal(gastoBasal, nivelAtividade);
    }
    
    // Recomendações
    public double calcularCarboidratos(double calorias) {
    	return CalculoRecomendacoes.calcularCarboidratos(calorias);
    }
    
    public double calcularProteina(double calorias) {
    	return CalculoRecomendacoes.calcularProteina(calorias);
    }
    
    public double calcularGordura(double calorias) {
    	return CalculoRecomendacoes.calcularGordura(calorias);
    }
}