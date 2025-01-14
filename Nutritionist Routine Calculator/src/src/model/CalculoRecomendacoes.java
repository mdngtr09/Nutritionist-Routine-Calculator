/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.model;

/**
 *
 * @author oneide
 */

public class CalculoRecomendacoes {
	public static double calcularCarboidratos(double calorias) {
		return calorias * 0.5 / 4;
	}
	
	public static double calcularProteina(double calorias) {
		return calorias * 0.25 / 4;
	}
	
	public static double calcularGordura(double calorias) {
		return calorias * 0.25 / 9;
	}
}
