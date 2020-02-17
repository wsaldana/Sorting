import static org.junit.Assert.*;  
import org.junit.Test;
  
public class TestSort {  
  
    Comparable[] a ={3,7,3,1,9,6,1,2};

    @Test  
    public void selection(){  
        Sort mySort = new Sort();
        assertNull(mySort.selection(a));
    } 
    
    @Test  
    public void mergesort(){  
        Sort mySort = new Sort();
        assertNull(Sort.mergeSort(a));
    } 

    @Test  
    public void quicksort(){  
        Sort mySort = new Sort();
        assertNull(Sort.quickSort(a));
    } 

    @Test  
    public void radixsort(){  
        Sort mySort = new Sort();
        assertNull(Sort.radixSort(a));
    } 

    @Test  
    public void bubble(){  
        Sort mySort = new Sort();
        assertNull(mySort.bubble(a));
    } 
}  