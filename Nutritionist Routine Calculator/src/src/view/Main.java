/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.view;
/**
 *
 * @author oneide
 */



import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
        private static final long serialVersionUID = 1L;

	public Main() {
        // Configurações da Janela
        setTitle("NutriSoft - Menu");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new GridLayout(3, 1));

        // Componentes
        JButton btnImc = new JButton("IMC");
        JButton btnGastoCalorico = new JButton("Gasto Calórico");
        JButton btnRecomendacoes = new JButton("Recomendações");

        // Ações dos botões
        btnImc.addActionListener(e -> {
            TelaIMC TelaIMC = new TelaIMC();
            TelaIMC.setVisible(true);
        });

        btnGastoCalorico.addActionListener(e -> {
            TelaGastoCalorico TelaGastoCalorico = new TelaGastoCalorico();
            TelaGastoCalorico.setVisible(true);
        });
        
        btnRecomendacoes.addActionListener(e -> {
        	TelaRecomendacoes TelaRecomendacoes = new TelaRecomendacoes();
        	TelaRecomendacoes.setVisible(true);
        });

        // Adicione os componentes a janela
        add(btnImc);
        add(btnGastoCalorico);
        add(btnRecomendacoes);

        // Exibir a janela para o usuário
        setVisible(true);
    }
}