package br.dev.nunes.conversor.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import br.dev.nunes.conversor.model.Temperatura;


public class TelaConversor {

    private JTextField txtCelsius;
    private JTextField txtFahrenheit;
    private JTextField txtKelvin;

    public void criarTelaConversor() {
        
    	
        //JFrame
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        
        //painel de conteúdo
        Container container = frame.getContentPane();
        container.setLayout(null);
        
        
        //componentes
        JLabel labelCelsius = new JLabel("Celsius:");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel labelKelvin = new JLabel("Kelvin:");
        
        
        txtCelsius = new JTextField();
        txtFahrenheit = new JTextField();
        txtFahrenheit.setEditable(false); 		//resultado
        txtKelvin = new JTextField();
        txtKelvin.setEditable(false);     		//resultado
        
        
        JButton buttonConverter = new JButton("Converter");
        JButton buttonLimpar = new JButton("Limpar");
        
        
        //tamanho/posição dos campos
        labelCelsius.setBounds(230, 20, 150, 30);
        txtCelsius.setBounds(180, 40, 150, 30);
        
        
        labelFahrenheit.setBounds(10, 100, 150, 30);
        txtFahrenheit.setBounds(90, 100, 110, 30);
        
        
        labelKelvin.setBounds(320, 100, 150, 30);
        txtKelvin.setBounds(370, 100, 110, 30);
        
        
        buttonConverter.setBounds(100, 150, 100, 40);
        buttonLimpar.setBounds(330, 150, 100, 40);
        
        
        //componentes no container
        container.add(labelCelsius);
        container.add(txtCelsius);
        container.add(labelFahrenheit);
        container.add(txtFahrenheit);
        container.add(labelKelvin);
        container.add(txtKelvin);
        container.add(buttonConverter);
        container.add(buttonLimpar);
        
        
        //action listener dos botoes
        buttonConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                converter();
                
            }
            
            
        });
        
        
        buttonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpar();
                
            }
            
            
        });
        
        frame.setVisible(true);
        
    }
    
    //exceção para numeros (caso alguem tentar escrever uma palavra no campo "celsius")
    private void converter() {
        try {
        	
            double celsius = Double.parseDouble(txtCelsius.getText());
            Temperatura temp = new Temperatura();
            temp.setCelsius(celsius);
            
            
            double fahrenheit = temp.converterParaFahrenheit();
            double kelvin = temp.converterParaKelvin();
            
            
            txtFahrenheit.setText(String.format("%.1f", fahrenheit));
            txtKelvin.setText(String.format("%.2f", kelvin));
            
            //apenas formatos numéricos
        } catch (NumberFormatException ex) {
            txtFahrenheit.setText("Erro");
            txtKelvin.setText("Erro");
            
        }
        
    }
    
    private void limpar() {
        txtCelsius.setText("");
        txtFahrenheit.setText("");
        txtKelvin.setText("");
        
    }
    
    public static void main(String[] args) {
        new TelaConversor().criarTelaConversor();
    }
    
}