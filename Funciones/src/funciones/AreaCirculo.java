package funciones;

import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {
		Double radio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia en Centimetros"));
		Double area = Math.PI * (Math.pow(radio,2));
		JOptionPane.showMessageDialog(null, "El area de la circunferencia es: " + area + " centimetros cuadrados");
	}
}
