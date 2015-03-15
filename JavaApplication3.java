/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Random;

/**
 *
 * @author BMB
 */
public class JavaApplication3 {
    public static void BubbleSort(int [] dizi)
    {        
        int ComparSana=0;
        int SwapSana = 0;
        int temp;   // Yer değiştirmede kullanılacak geçici değişken
        for (int i=1; i<dizi.length; i++)
        {
            for(int j=0; j<dizi.length-i; j++)
            {
                ComparSana++;
                if (dizi[j] > dizi [j+1])
                {
                    SwapSana++;
                    temp = dizi [j];
                    dizi [j] = dizi [j+1];
                    dizi [j+1] = temp;
                }
            }
        }
        System.out.println("BUBBLE Comparision sayisi: "+ComparSana);
        System.out.println("BUBBLE Swap sayisi: "+SwapSana);
    }

 
    public static void selectionSort1( int [] A ) {
    int i;
    int ComparSana=0;
    int SwapSana = 0;
    for( i = A.length-1; i >= 0; i-- ) {
        
      int maxIndex = 0;
      int j;
      for( j = 0; j < i; j++ ) {
	ComparSana++; 
	/* inner loop invariant: for all k < j, A[maxIndex] >= A[k] */

	if( A[maxIndex] < A[j] ){
	  maxIndex = j;
          SwapSana++;
        }
      }

    
    }
            System.out.println("SelectionSort Comparision sayisi: "+ComparSana);
        System.out.println("SelectionSort Swap sayisi: "+SwapSana);
  }
   
  
    
    public static void shellsort( int [ ] a )
    {
        int ComparSana=0;
        int SwapSana = 0;
        for( int gap = a.length / 2; gap > 0;
                     gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) ){
            SwapSana++;
            ComparSana++;
            for( int i = gap; i < a.length; i++ )
            {
                int tmp = a[ i ];
                int j = i;
                ComparSana++;
                for( ; j >= gap && (tmp < a[ j - gap ] ); j -= gap ){
                    ComparSana++;
                    SwapSana++;
                    a[ j ] = a[ j - gap ];
                }
                a[ j ] = tmp;
            }
        }
        
        System.out.println("Shell Comparision sayisi: "+ComparSana);
        System.out.println("Shell Swap sayisi: "+SwapSana);
    }
    
        public static void intInsertionSort (int [] a) { 
            int ComparSana=0;
            int SwapSana = 0;
            for (int i=1; i < a.length; i++) {
                ComparSana++;
                int temp = a[i];
                int j;
                for (j = i - 1; j >= 0 && temp < a[j] ; j--){
                    ComparSana++;
                    SwapSana++;
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }

            System.out.println("InsertionSort Comparision sayisi: "+ComparSana);
            System.out.println("InsertionSort Swap sayisi: "+SwapSana);
        }
        
    public static void swapReferences( int [ ] a, int index1, int index2 )
    {
        int tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int nn = 500;
        int [ ] arr1 = new int[ nn ];
        //int[] arr1 = {10,34,2,56,7,67,88,42,62,72};

        for (int i = 0; i < nn; i++) {
            arr1[i] = random.nextInt(500); 
        }
        //int[] arr2 = doSelectionSort(arr1);
        selectionSort1(arr1);
        for (int i = 0; i < nn; i++) {
            arr1[i] = random.nextInt(500); 
        }
        BubbleSort(arr1);
        for (int i = 0; i < nn; i++) {
            arr1[i] = random.nextInt(500); 
        }
        intInsertionSort(arr1);
        for (int i = 0; i < nn; i++) {
            arr1[i] = random.nextInt(500); 
        }
        shellsort(arr1);
        
        System.out.println("");
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }
        
        
    }
}