/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese la identifiacion del estudiante: ");
        String identificacion = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        
        System.out.println("Ingrese el número de créditos: ");
        int numCreditos = entrada.nextInt();
        
        System.out.println("Ingrese el costo de los créditos: ");
        double costoCredito = entrada.nextDouble();
        
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(numCreditos);
        estudiante.establecerCostoCredito(costoCredito);
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudiante);
    }
}
