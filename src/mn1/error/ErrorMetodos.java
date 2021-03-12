/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn1.error;

/**
 *
 * @author Adrian Martin Herrera Tuz
 * 4to A
 */
public class ErrorMetodos {
private double ValorReal;
private double ValorAprox;
    public ErrorMetodos(double Real, double Aprox) {
   ValorReal = Real;
    ValorAprox = Aprox;
    }
    // metodos
    //Para calcular el error absoluto
    double ErrorAbsoluto() {
        double EAbsoluto = Math.abs(ValorAprox - ValorReal);
        return EAbsoluto;
    }
//Para calcular el error relativo
    double ErrorRelativo() {
        double ERelativo = ErrorAbsoluto() / ValorReal;
        return ERelativo;
    }
//Para calcular el error relativo porcentual
    double ErrorRelativoPorcentual() {
        double ERelativoPorcentual = ErrorRelativo() * 100;
        return ERelativoPorcentual;
    }
    
}
