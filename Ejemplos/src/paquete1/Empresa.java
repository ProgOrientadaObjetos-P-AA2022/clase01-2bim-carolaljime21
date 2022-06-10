/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double costo = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) {
            costo = costo + obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = costo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n Lista de Edificios\n",
                obtenerNombre());

        for (int i = 0; i < obtenerEdificios().length; i++) {
            cadena = String.format("%s %d. %s (%.2f)\n", cadena, (i + 1),
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        
        cadena = String.format("%s Total de inmuebles: %.2f", 
                cadena, obtenerCostoBienesInmuebles());

        return cadena;
    }

}
