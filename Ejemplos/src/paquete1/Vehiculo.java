/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author PC
 */
public class Vehiculo {
    
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String t, String m){
        tipo = t;
        matricula = m;
    }
    
    public void establecerTipo(String x){
        tipo = x;
    }
    
    public void establecerMatricula(String x){
        matricula = x;
    }
    
    public void establecerValor(double n){
        valor = n;
    }
    
     public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerMatricula(){
        return matricula;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo: %s\n"
                + "Matricula: %s\n"
                + "Valor: %.2f", tipo,
                matricula,
                valor);
        return cadena;
    }    
}

