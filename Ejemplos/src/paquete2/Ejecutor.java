/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("edificio central");
        edf1.establecerCostos(10000);
//        System.out.println(edf1);
        
        Edificio edf2 = new Edificio("edificio sur");
        edf2.establecerCostos(20000);
        
        Edificio edf3 = new Edificio("edificio norte");
        edf3.establecerCostos(30000);
        
        Edificio edf4 = new Edificio("edificio secundario");
        edf4.establecerCostos(20000);
        
        Edificio[] edificios = new Edificio[4];
        edificios[0] = edf1;
        edificios[1] = edf2;
        edificios[2] = edf3;
        edificios[3] = edf4;
        
//        for (int i = 0; i < edificios.length; i++) {
//            System.out.printf("Edificio %s\n%s\n", (i+1), edificios[i]);
//        }
        
        Empresa emp1 = new Empresa();
        emp1.establecerNombre("Empresa de hojas");
        emp1.establecerEdificios(edificios);
        emp1.establecerCostoBienesInmuebles();
        emp1.obtenerEdificios();
        emp1.obtenerCostoBienesInmuebles();
        
        //System.out.printf("%.2f\n", emp1.obtenerCostoBienesInmuebles());
        // Crear un objeto de tipo Empresa:
        System.out.printf("%s\n", emp1);
        
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
