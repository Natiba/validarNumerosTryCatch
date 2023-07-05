package validarnumerocontrycatch;

import javax.swing.JOptionPane;
import static validarnumerocontrycatch.Validar.isNumeric;

public class ValidarNumeroConTryCatch {

    public static void main(String[] args) {

        // Quiero validar si lo ingresado es un numero
        
        String cadena = JOptionPane.showInputDialog(null, "Ingrese un numero por favor");
        int numero;

        if (isNumeric(cadena) == true) {
            numero = Integer.parseInt(cadena);
            System.out.println( numero + " es un número" );
        } else {
            System.out.println(cadena + " No es un número");
        }

    }

}

// Explicacion

// Usando la posible excepcion que lanza la funcion Integer.parseInt(), basta encerrar en un try/catch la conversion
// de la cadena a numero.

// Cuando la excepcion de tipo NumberFormatException ocurra, entonces determinamos que la conversion ha 
// fallado y por lo tanto la cadena que se intento convertir, no es un numero, retornando FALSE. En caso contrario 
// nos retorna un TRUE.