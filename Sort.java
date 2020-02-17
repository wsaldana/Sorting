/**
 * @author Walter Saldaña
 * 
 * Clase que implementa los distintos metodos de Sorting
 * No tiene atributos pero sus metodos requieren parametros
 */

import java.util.*;

public class Sort<E>{
    /**
     * Contructor sin parametros
    */
    public Sort(){}

    //-------------------------------------------------------------
    
    public void selection(Comparable data[]){
        int numUnsorted = data.length;
        int index;
        int max;
        while (numUnsorted > 0){
            max = 0;
            for (index = 1; index < numUnsorted; index++){
                if (data[max].compareTo(data[index]) < 0) max = index;
            }
            swap(data,max,numUnsorted-1);
            numUnsorted--;
        }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    //------------------------------------------------------
    
    private void merge(Comparable data[], Comparable temp[], int low, int middle, int high){
        int ri = low; 
        int ti = low; 
        int di = middle; 
        while (ti < middle && di <= high){
            if (data[di].compareTo(temp[ti]) < 0) {
                data[ri++] = data[di++]; 
            }else {
                data[ri++] = temp[ti++]; 
            }
        }
        while (ti < middle){
            data[ri++] = temp[ti++];
        }
    }

    private void mergeSortRecursive(Comparable data[], Comparable temp[], int low, int high){
        int n = high-low+1;
        int middle = low + n/2;
        int i;
        if (n < 2) return;
        for (i = low; i < middle; i++){
            temp[i] = data[i];
        }
        mergeSortRecursive(temp,data,low,middle-1);
        mergeSortRecursive(data,temp,middle,high);
        merge(data,temp,low,middle,high);
    }

    public void mergeSort(Comparable data[]){
        int n = data.length;
        mergeSortRecursive(data,new Comparable[n],0,n-1);
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }


    //----------------------------------------------------

    public void quickSort(Comparable data[]){
        int n = data.length;
        quickSortRecursive(data,0,n-1);
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    private void quickSortRecursive(Comparable data[],int left,int right){
        int pivot;
        if (left >= right) return;
        pivot = partition(data,left,right);
        quickSortRecursive(data,left,pivot-1);
        quickSortRecursive(data,pivot+1,right);
    }

    private int partition(Comparable data[], int left, int right){
        while (true){
            while (left < right && data[left].compareTo(data[right]) < 0) right--;
            if (left < right) swap(data,left++,right);
            while (left < right && data[left].compareTo(data[right]) < 0) left++;
            if (left < right) swap(data,left,right--);
            else return right;
        }
    }

    //----------------------------------------------------

    public void radixSort(Comparable data[]){
        for (int i = 0; i < 6; i++){
            bucketPass(data,i);
        }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    public void bucketPass(Comparable data[], int d){
        int i,j;
        int value;
        Vector<Vector<E>> bucket = new Vector<Vector<E>>(10);
        bucket.setSize(10);
        for (j = 0; j < 10; j++) bucket.set(j,new Vector<E>());
        int n = data.length;
        for (i = 0; i < n; i++){
            value = data[i];
            j = digit(value,d);
            bucket.get(j).add(value);
        }
        i = n;
        for (j = 9; j >= 0; j--){
            while (!bucket.get(j).isEmpty()){
                i--;
                bucket.remove(j);
            }
        }
    }

    public int digit(int n, int d){
        if (d == 0) return n % 10;
        else return digit(n/10,d-1);
    }


    //---------------------------------------------------------

    public void bubble(Comparable data[]){
        int n = data.length;
        int numSorted = 0; 
        int index; 
        while (numSorted < n){
            for (index = 1; index < n-numSorted; index++){
                if (data[index-1].compareTo(data[index]) > 0){
                    swap(data,index-1,index);
                }
            }
            numSorted++;
        }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }  
    }

    //-------------------------------------------------------------

    public void swap(Comparable data[], int i, int j){
        Comparable<E> temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}