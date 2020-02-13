import static org.junit.Assert.*;  
import org.junit.Test;
  
public class TestSort {  
  
    @Test  
    public void selection(){  
        Sort mySort = new Sort();
        assertEquals([1,1,2,3,3,6,7,9],mySort.selection([3,7,3,1,9,6,1,2]));
    } 
    
    @Test  
    public void mergesort(){  
        Sort mySort = new Sort();
        assertEquals([1,1,2,3,3,6,7,9],mySort.mergesort([3,7,3,1,9,6,1,2]));
    } 

    @Test  
    public void quicksort(){  
        Sort mySort = new Sort();
        assertEquals([1,1,2,3,3,6,7,9],mySort.quicksort([3,7,3,1,9,6,1,2]));
    } 

    @Test  
    public void radixsort(){  
        Sort mySort = new Sort();
        assertEquals([1,1,2,3,3,6,7,9],mySort.radixsort([3,7,3,1,9,6,1,2]));
    } 

    @Test  
    public void bubble(){  
        Sort mySort = new Sort();
        assertEquals([1,1,2,3,3,6,7,9],mySort.bubble([3,7,3,1,9,6,1,2]));
    } 
}  