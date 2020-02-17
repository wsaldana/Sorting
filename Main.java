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
        ArrayList<String> array = gen.leer();

        //Creacion de objeto Sort para accesar a sus metodos

        //SORTS DE INTEGERS
        Sort<Integer> mySort = new Sort<Integer>();
        Comparable<Integer>[] lista = new Comparable[3000];
        for(int i=0;i<lista.length;i++){
            lista[i] = Integer.parseInt(array.get(i));
        }

        //SORTS DE STRINGS
        /*
        Sort<String> mySort = new Sort<String>();
        Comparable<String>[] lista = new Comparable[3000];
        for(int i=0;i<lista.length;i++){
            lista[i] = array.get(i);
        }
        */

        //Seleccionar el tipo de sort

        mySort.selection(lista);
        //mySort.mergeSort(lista);
        //mySort.quickSort(lista);
        //mySort.radixSort(lista);
        //mySort.bubble(lista);
    }
}