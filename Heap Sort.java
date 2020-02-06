import java.util.*;
public class Main
{
    public static void main(String[] args) {
                       System.out.println("enter size of array");
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	   
        int inputArray[]=new int[size];
        System.out.println("enter elements of array");
        for(int i=0;i<size;i++)
             inputArray[i]=sc.nextInt();
             
        HeapSort obj = new HeapSort(); 
        obj.sort(inputArray,size); 
  
        System.out.println("Sorted array is"); 
        obj.printArray(inputArray); 
    }
}

class HeapSort
{
    public void sort(int inputArray[],int size) 
    { 
  
        // Build heap
        for (int i = size/ 2 - 1; i >= 0; i--) 
            heapify(inputArray,size, i); 
  
        for (int i=size-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = inputArray[0]; 
            inputArray[0] = inputArray[i]; 
            inputArray[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(inputArray, i, 0); 
        } 
    } 
    
    void heapify(int inputArray[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int left = 2*i + 1; // left = 2*i + 1 
        int right = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (left < n && inputArray[left] > inputArray[largest]) 
            largest = left; 
  
        // If right child is larger than largest 
        if (right < n && inputArray[right] > inputArray[largest]) 
            largest = right; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int temp = inputArray[i]; 
            inputArray[i] = inputArray[largest]; 
            inputArray[largest] = temp; 
  
            // Recursively heapify the affected sub-tree 
            heapify(inputArray, n, largest); 
        } 
    } 
    
    public void printArray(int inputArray[]) 
    { 
        int size =inputArray.length; 
        for (int i=0; i<size; ++i) 
            System.out.print(inputArray[i]+" "); 
    } 
  
}
