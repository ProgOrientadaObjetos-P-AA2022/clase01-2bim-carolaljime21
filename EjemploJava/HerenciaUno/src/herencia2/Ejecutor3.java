/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import java.util.Scanner;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;

public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine();
            cedula = entrada.nextLine()
            edad = nextINt();
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        System.out.println("INGRESO DE DATOS");
        System.out.println("Escoja una opción: ");
        System.out.println("1. Estudiante presencial.");
        System.out.println("2. Estudiante distancia.");
        int op = entrada.nextInt();

        if (op != 1 && op != 2) {
            System.out.println("Opcion no valida");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese la identifiacion del estudiante: ");
            String identificacion = entrada.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            int edad = entrada.nextInt();

            if (op == 1) {
                System.out.println("Ingrese el número de créditos: ");
                int numCreditos = entrada.nextInt();
                System.out.println("Ingrese el costo de los créditos: ");
                double costoCredito = entrada.nextDouble();
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                estudianteP.establecerNombresEstudiante(nombre);
                estudianteP.establecerApellidoEstudiante(apellido);
                estudianteP.establecerIdentificacionEstudiante(identificacion);
                estudianteP.establecerEdadEstudiante(edad);
                estudianteP.establecerNumeroCreditos(numCreditos);
                estudianteP.establecerCostoCredito(costoCredito);
                estudianteP.calcularMatriculaPresencial();
                System.out.printf("%s\n", estudianteP);

            } else {
                if (op == 2) {
                    System.out.println("Ingrese el número de asignaturas: ");
                    int numAsignaturas = entrada.nextInt();
                    System.out.println("Ingrese el costo de las asignaturas: ");
                    double costoAsignaturas = entrada.nextDouble();
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    estudianteD.establecerNombresEstudiante(nombre);
                    estudianteD.establecerApellidoEstudiante(apellido);
                    estudianteD.establecerIdentificacionEstudiante(identificacion);
                    estudianteD.establecerEdadEstudiante(edad);
                    estudianteD.establecerNumeroAsginaturas(numAsignaturas);
                    estudianteD.establecerCostoAsignatura(costoAsignaturas);
                    estudianteD.calcularMatriculaDistancia();
                    System.out.printf("%s\n", estudianteD);
                }
            }
        }
    }
}
