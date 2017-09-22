/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s13ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S13ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("INGRESE EL NUMERO DEL ESTUDIANTE");
        int[] puntaje = new int [input.nextInt()];
        char[] grado = new char [puntaje.length];
        
        //
        System.out.println("Ingrese" + puntaje.length + " puntajes:");
        for  (int i = 0; i < puntaje.length; i++){
            puntaje[i] = input.nextInt();
        }
        
        //Get grades
        getGrado(puntaje,grado);
        
        for (int i = 0; i < puntaje.length; i++){
            System.out.println("Estudiante" + i + "puntaje es" +
                    puntaje[i] + "y el grado es" + grado[i]);
        }
    }
    
    public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	/** Method getGrade assigns grades based on grading scheme */
	public static void getGrado(int[] puntaje, char[] grado) {
		int best = max(puntaje);
		for (int i = 0; i < puntaje.length; i++) {
			if (puntaje[i] >= best - 10)
				grado[i] = 'A';
			else if (puntaje[i] >= best - 20)
				grado[i] = 'B';
			else if (puntaje[i] >= best - 30)
				grado[i] = 'C';
			else if (puntaje[i] >= best - 40)
				grado[i] = 'D';
			else
				grado[i] = 'F';
        
        
        }
    }

}