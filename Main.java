/**
 * @author Walter Saldaña
 * @since 12/02/2020
 * 
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Algoritmos y Estructuras de Datos
 * Sección 20
 * 
 * Programa que implementa distintos tipos de sorting para evaluar su desempeño con un profiler
 */

import java.util.*;

public class Main{
    public static void main(String args[]){

        //Generar los numeros aleatorios y guardarlos en texto
        Generator gen = new Generator();
        gen.create();

        Sort mySort = new Sort();

        List<Integer> lista = new ArrayList<Integer>();
        lista = gen.leer();

        int[] array = new int[lista.size()];
        for(int i=0; i<array.length;i++){
            array[i] = lista.get(i);
        }
        //mySort.selection(array);
        //mySort.merge(array,)

    
    }
}