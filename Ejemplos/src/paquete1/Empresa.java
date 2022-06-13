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
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }

    public void establecerCostoBienesInmuebles() {
        double costo = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) {
            costo = costo + obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = costo;
    }

    public void establecerCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            suma = suma + obtenerVehiculos()[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    
    public void establecerCostoTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    
    public double obtenerCostoTotalBienes(){
        return costoTotalBienes;
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

        cadena = String.format("%s Total de inmuebles: %.2f\n",
                cadena, obtenerCostoBienesInmuebles());
        
        cadena = String.format("\n%s\n Lista de Vechículos\n", cadena);
        
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            cadena = String.format("%s %d. %s %S (%.2f)\n", cadena, (i + 1),
                    obtenerVehiculos()[i].obtenerTipo(),
                    obtenerVehiculos()[i].obtenerMatricula().toUpperCase(),
                    obtenerVehiculos()[i].obtenerValor());
        }
        
        cadena = String.format("%s Total inmuebles: %.2f\n",
                cadena, obtenerCostoVehiculos());
        
        cadena = String.format("\n%s \nTotal bienes: %.2f", cadena,
                obtenerCostoTotalBienes());

        return cadena;
    }

}
