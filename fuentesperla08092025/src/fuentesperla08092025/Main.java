/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla08092025;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad_elementos = 5;
        int [] numeros_desordenados = new int [cantidad_elementos];
        int [] numeros_ordenados = new int [cantidad_elementos];
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Por favor ingrese "+cantidad_elementos+ " numeros enteros de manera desordenada");
        
        for(int i = 0; i<numeros_desordenados.length;i++){
            
            System.out.print("Digite el elemento "+(i+1)+": ");
            
            numeros_desordenados[i] = scanner.nextInt();
        }
        
        System.out.println("Usted digitó los siguientes números: ");
        
        for(int j = 0; j<numeros_desordenados.length;j++){
            
            System.out.print(numeros_desordenados[j]+ " ");
            
        }
        
        System.out.println("Los números ordenados son: ");
        
        numeros_ordenados = ordenar(numeros_desordenados);
        
        for (int k=0; k<numeros_ordenados.length; k++){
            System.out.print (numeros_ordenados[k]+ " ");
        }
              

    }
    
    public static int [] ordenar ( int [] arreglo ){
        
        for (int i=0; i < arreglo.length - 1; i++){
            
            //System.out.print(arreglo[i]);
            
            for (int j=0; j < arreglo.length - 1; j++){
                //System.out.print(arreglo[j]);
                
                if (arreglo[j] > arreglo[j+1]){
                    
                    int mayor = arreglo[j];
                    
                    arreglo[j] = arreglo[j+1];
                    
                    arreglo[j+1] = mayor;
                }
            }
        }
        
        //System.out.println();
        return arreglo;
        
        
    }
    
}
