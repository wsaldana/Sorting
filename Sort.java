/**
 * @author Walter Saldaña
 * 
 * Clase que implementa los distintos metodos de Sorting
 * No tiene atributos pero sus metodos requieren parametros
 */

import java.util.*;

public class Sort{
    /**
     * Contructor sin parametros
    */
    public Sort(){}

    //-------------------------------------------------------------
    
    public void selection(int[] data){
        int numUnsorted = data.length;
        int index;
        int max;
        while (numUnsorted > 0){
            max = 0;
            for (index = 1; index < numUnsorted; index++){
                if (data[max] < data[index]) max = index;
            }
            swap(data,max,numUnsorted-1);
            numUnsorted--;
        }
    }

    //------------------------------------------------------
    
    private static void merge(int data[], int temp[], int low, int middle, int high){
        int ri = low; 
        int ti = low; 
        int di = middle; 
        while (ti < middle && di <= high){
            if (data[di] < temp[ti]) {
                data[ri++] = data[di++]; 
            }else {
                data[ri++] = temp[ti++]; 
            }
        }
        while (ti < middle){
            data[ri++] = temp[ti++];
        }
    }

    private static void mergeSortRecursive(int data[], int temp[], int low, int high){
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

    public static void mergeSort(int data[], int n){
        mergeSortRecursive(data,new int[n],0,n-1);
    }


    //----------------------------------------------------

    public static void quickSort(int data[], int n){
        quickSortRecursive(data,0,n-1);
    }

    private static void quickSortRecursive(int data[],int left,int right){
        int pivot;
        if (left >= right) return;
        pivot = partition(data,left,right);
        quickSortRecursive(data,left,pivot-1);
        quickSortRecursive(data,pivot+1,right);
    }

    private static int partition(int data[], int left, int right){
        while (true){
            while (left < right && data[left] < data[right]) right--;
            if (left < right) swap(data,left++,right);
            while (left < right && data[left] < data[right]) left++;
            if (left < right) swap(data,left,right--);
            else return right;
        }
    }

    //----------------------------------------------------

    public static void radixSort(int data[]){
        for (int i = 0; i < 6; i++){
            bucketPass(data,i);
        }
    }

    public static void bucketPass(int data[], int d){
        int i,j;
        int value;
        Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
        bucket.setSize(10);
        for (j = 0; j < 10; j++) bucket.set(j,new Vector<Integer>());
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

    public static int digit(int n, int d){
        if (d == 0) return n % 10;
        else return digit(n/10,d-1);
    }


    //---------------------------------------------------------

    public void bubble(int[] data){
        int n = data.length;
        int numSorted = 0; 
        int index; 
        while (numSorted < n){
            for (index = 1; index < n-numSorted; index++){
                if (data[index-1] > data[index]){
                    swap(data,index-1,index);
                }
            }
            numSorted++;
        }
    }

    //-------------------------------------------------------------

    public static void swap(int data[], int i, int j){
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}