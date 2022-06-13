/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Carolina");
        estudiante.establecerApellidoEstudiante("Alvarado");
        estudiante.establecerIdentificacionEstudiante("1105716938");
        estudiante.establecerEdadEstudiante(18);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        
//        System.out.printf("%s\n - (%.2f)\n",
//                estudiante.obtenerApellidoEstudiante(), 
//                estudiante.obtenerMatriculaDistancia());

          System.out.printf("%s\n", estudiante);   
        
    }
}
