package funciones;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		Double base = Double.valueOf(JOptionPane.showInputDialog("Ingrese la base en CM"));
		Double altura = Double.valueOf(JOptionPane.showInputDialog("Ingrese la altura en CM"));
		Double area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area + " centimetros cuadrados");
	}

}
