/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn1.error;

import java.util.Scanner;

/**
 *
 * @author Adrian Martin Herrera Tuz
 * 4to A
 */
public class MN1Error {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Aprox;
        double Real;
         Scanner teclado = new Scanner (System.in);
         
        System.out.println("Ingrese el valor real");
        Real = teclado.nextDouble();
        
        System.out.println("Ingrese el valor correspondiente al aproximado");
       Aprox = teclado.nextDouble();
       
       ErrorMetodos  ER;
        ER = new ErrorMetodos (Real, Aprox);
        
       
        System.out.println("El error Absoluto es: " + ER.ErrorAbsoluto() + "\n" +
                                    "El error Relativo es: " + ER.ErrorRelativo() + "\n" +
                                     "El error Relativo es: " + "%" + ER.ErrorRelativoPorcentual());
    }
    
}
