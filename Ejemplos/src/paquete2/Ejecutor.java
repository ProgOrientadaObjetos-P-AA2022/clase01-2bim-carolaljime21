/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("edificio central");
        edf1.establecerCostos(20000);
//        System.out.println(edf1);

        Edificio edf2 = new Edificio("edificio sur");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("edificio norte");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("edificio secundario");
        edf4.establecerCostos(5000);

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011");
        v1.establecerValor(10000);

        Vehiculo v2 = new Vehiculo("Camioneta", " LCB0011");
        v2.establecerValor(20000);

        Vehiculo v3 = new Vehiculo("Auto", "LBD0012");
        v3.establecerValor(6000);

        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011");
        v4.establecerValor(10000);

        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011");
        v5.establecerValor(25000);

        Edificio[] edificios = new Edificio[4];
        edificios[0] = edf1;
        edificios[1] = edf2;
        edificios[2] = edf3;
        edificios[3] = edf4;

        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = v1;
        vehiculos[1] = v2;
        vehiculos[2] = v3;
        vehiculos[3] = v4;
        vehiculos[4] = v5;

        Empresa emp1 = new Empresa();
        emp1.establecerNombre("Empresa de hojas");
        emp1.establecerEdificios(edificios);
        emp1.establecerVehiculos(vehiculos);
        emp1.establecerCostoBienesInmuebles();
        emp1.establecerCostoVehiculos();
        emp1.establecerCostoTotalBienes();
        emp1.obtenerEdificios();
        emp1.obtenerVehiculos();
        emp1.obtenerCostoBienesInmuebles();
        emp1.obtenerCostoVehiculos();
        emp1.obtenerCostoTotalBienes();

        //System.out.printf("%.2f\n", emp1.obtenerCostoBienesInmuebles());
        // Crear un objeto de tipo Empresa:
        System.out.printf("%s\n", emp1);

        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
