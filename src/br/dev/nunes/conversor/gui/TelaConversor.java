package br.dev.nunes.conversor.gui;


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaConversor {

	public void criarTela(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		
		// Criar o JFrame
		JFrame frame = new JFrame("Conversor");
		frame.setSize(300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		// Criar o painel de conteúdo
		Container container = frame.getContentPane();
		container.setLayout(null);
		
		
		// Criar os componentes
		JLabel labelConvertendo = new JLabel("Convertendo de celsius: ");
		JLabel labelFahrenheit = new JLabel("Fahrenheit : ");	
		JLabel labelKelvin = new JLabel("Kelvin: ");
		JTextField txtConvertendo = new JTextField();
		JTextField txtFahrenheit = new JTextField();
		JTextField txtKelvin = new JTextField();
		JButton buttonConverter = new JButton("Converter");
		JButton buttonLimpar = new JButton("Limpar");
		
		
		// Definir posições e tamanhos dos componentes
		labelConvertendo.setBounds(20, 20, 150, 30);
		txtConvertendo.setBounds(170, 20, 100, 30);
		labelFahrenheit.setBounds(20, 60, 150, 30);
		txtFahrenheit.setBounds(170, 60, 100, 30);
		labelKelvin.setBounds(20, 100, 150, 30);
		txtKelvin.setBounds(170, 100, 100, 30);
		buttonConverter.setBounds(20, 140, 100, 30);
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		
		
			
	}
		
	
	
	
	
}
