import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Ejecutable implements ActionListener{
	private JFrame  ventana;
	private JTextField caja;
	private JButton boton;
	private JLabel mensaje;
	private JLabel mensaje2;
	private JLabel mensaje3;
	private JLabel mensaje4;
	private JLabel mensaje5;
	private JLabel mensaje6;
	private JLabel mensaje7;
	private JLabel mensaje8;
	private JLabel mensaje9;
	
	public Ejecutable(){
		ventana = new JFrame();
		ventana.setTitle("PALINDROMOS");
		ventana.setSize(300,300);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		configurarVentana();
	}
	
	public void configurarVentana() {
		caja = new JTextField();
		caja.setBounds(90,25,150,20);
		ventana.add(caja);
		
		mensaje5 = new JLabel();
		mensaje5.setText("PALABRA: ");
		mensaje5.setBounds(20,10,300,50);
		mensaje5.setForeground(Color.BLACK);
		ventana.add(mensaje5);
		
		boton = new JButton();
		boton.setText("VERIFICAR");
		boton.setBounds(90,50,150,20);
		boton.addActionListener(this);
		ventana.add(boton);
		
		mensaje = new JLabel();
		mensaje.setText("Palindromo: ");
		mensaje.setBounds(10,80,300,50);
		mensaje.setForeground(Color.BLACK);
		ventana.add(mensaje);
		
		mensaje2 = new JLabel();
		mensaje2.setText("Longitud: ");
		mensaje2.setBounds(10,100,300,50);
		mensaje2.setForeground(Color.BLACK);
		ventana.add(mensaje2);
		
		mensaje3 = new JLabel();
		mensaje3.setText("Inversa: ");
		mensaje3.setBounds(10,120,300,50);
		mensaje3.setForeground(Color.BLACK);
		ventana.add(mensaje3);
		
		mensaje4 = new JLabel();
		mensaje4.setText("Letra moda: ");
		mensaje4.setBounds(10,140,300,50);
		mensaje4.setForeground(Color.BLACK);
		ventana.add(mensaje4);
		
		mensaje6 = new JLabel("");
		mensaje6.setBounds(100,100,300,50);
		mensaje6.setForeground(Color.BLACK);
		ventana.add(mensaje6);
		
		mensaje7 = new JLabel("");
		mensaje7.setBounds(100,120,300,50);
		mensaje7.setForeground(Color.BLACK);
		ventana.add(mensaje7);
		
		mensaje8 = new JLabel("");
		mensaje8.setBounds(100,80,300,50);
		mensaje8.setForeground(Color.BLACK);
		ventana.add(mensaje8);
		
		mensaje9 = new JLabel("");
		mensaje9.setBounds(100,140,300,50);
		mensaje9.setForeground(Color.BLACK);
		ventana.add(mensaje9);
		
		mensaje5 = new JLabel();
		ventana.add(mensaje5);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String palabra = caja.getText();
		String longitud = Integer.toString(palabra.length());
		mensaje6.setText(longitud);
		
		String inversa;
		int longitudInt = Integer.parseInt(longitud);
		inversa="";
		for(int x=(longitudInt-1);x>=0;x--) {
			inversa += palabra.charAt(x);
		};
		mensaje7.setText(inversa);
		
		if(palabra.replace(" ", "").equals(inversa.replace(" ", ""))) {
			mensaje8.setText("Si");
		}else {
			mensaje8.setText("No");
		}
		
		char [] letras;
		int mayorRepeticion  = 0;
		char letraMasRepetida;
		
		letras = palabra.toCharArray();
		
		for(int i=0;i<palabra.length();i++) {
			char letraActual = letras[i];
			int contador =0;
			for(int j=0;j<letras.length;j++) {
				if(letras[j]==letraActual)
					contador++;
			}
			if(mayorRepeticion < contador) {
				mayorRepeticion = contador;
				letraMasRepetida = letraActual;
				String letra = Character.toString(letraMasRepetida);
				mensaje9.setText(letra);
				
			}
		}
	}
	
	public static void main(String[] args) {
		Ejecutable x = new Ejecutable();
	}
}
