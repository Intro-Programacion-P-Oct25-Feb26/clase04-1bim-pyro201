/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombre = "Jonathan Javier";
        String apellido = "Gualan Jimenez";
        int edad = 21;
        String direccion = "Marcabeli y Huaquillas";
        String universidad = "UTPL"; 
        int ciclo = 1;
        String asignatura = "introduccion a la programacion"; 
        String paralelo = "A";
        
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento)
        
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\t%s\nDireccion:\n\n\t%s\n-------------------\nUniversidad:\t%s\nCiclo:\t%s\nAsignatura:\t%s\nParalelo:\n\t%s\n",
                nombre, apellido, edad, direccion, universidad, ciclo, asignatura, paralelo);
        

    }
}
