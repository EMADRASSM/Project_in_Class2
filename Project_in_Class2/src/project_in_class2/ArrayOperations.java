/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author youse
 */
public class ArrayOperations {
 
    int numOfElements ;
    int[] arr ;

    public ArrayOperations() {
        
        numOfElements = 0 ;
        arr = new int[5];
    }
    
   public int addElement(int elem)
    {
      if(numOfElements < arr.length)
      {
        arr[numOfElements] = elem;
        numOfElements++;
        return 0 ; 
      }
      else
        return -1 ; 
    } 
    
   public int addSortElement (int elem)     // القيمة المضافة ستكون في المكان المناسب 
    {
        if (numOfElements < arr.length)
        {
            int i = numOfElements ; 
            while ( i > 0 && elem < arr[i-1])
            {
                arr[i] = arr[i-1] ; 
                i-- ; 
            
            }
            arr[i] = elem ; 
            numOfElements++ ;
            return 0 ;  
        }
        else
            return -1 ;
    }
  
   
    public int deleteElement ()
    {
        if(numOfElements > 0 )
        {
            arr[numOfElements -1] = -1 ; //Integer.MIN_VALUE;
            numOfElements--;
            return 0 ;        
        }
        else
            return -1 ; 
    
    }
    
    public int deleteSortElement(int index)
    {
        if (index < numOfElements && index >= 0)
        {
            int i = index;
            for ( i = index; i < numOfElements -1 ; i++) {   // to shift number
                arr[i] = arr[i+1];
                
        }
           
            arr[i] =  -2 ;// Integer.MIN_VALUE ;
            numOfElements--;
            return 0 ; 
        }
        else
            return -1;
    
    }
   
    
      public int sequentialSearch (int key)         /// For Search for element
    {
        int index = -1 ;
        boolean found = false ;
       
        for (int i = 0;  i < numOfElements ; i++) {
            
            if(arr[i] == key)
            {
                found = true ;
                index = i ;
                
            }   
             
        }
        return index ;
    }
   
      
      
      
      
      
      
      
    public static void main(String[] args) {
        
        ArrayOperations test = new ArrayOperations() ;
        
        Scanner in = new Scanner(System.in);
        System.out.println("input elements");
        
//        for (int i = 0 ; i < 7 ; i++) {         /// For add Element to an array
//           
//           if (test.addElement(in.nextInt())== 0)
//             
//                System.out.println("added sucessfully");
//           else
//                System.out.println("array is full");
//           
//            System.out.println(Arrays.toString(test.arr));
//            
//        }
 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
//         for (int i = 0 ; i < 7 ; i++) {
//           
//           if (test.addSortElement(in.nextInt())== 0)      // insertion Sort
//             
//                System.out.println("added sucessfully");
//           else
//                System.out.println("array is full");
//           
//            System.out.println(Arrays.toString(test.arr));
//               
//            
//        }
   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
//        for (int i = 0 ; i < 7 ; i++) {                   /// For add Element to an array and delete it
//           
//           if (test.addElement(in.nextInt())== 0)
//             
//                System.out.println("added sucessfully");
//           else
//                System.out.println("array is full");
//           
//            System.out.println(Arrays.toString(test.arr));
//                
//        }
//        
//          for (int i = 0 ; i < 7 ; i++) {
//      
//            if (test.deleteElement()== 0)
//             
//                System.out.println("delete sucessfully");
//           else
//                System.out.println("array is empty");
//           
//            System.out.println(Arrays.toString(test.arr));
//                                         
//        }
   
       
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
//        for (int i = 0 ; i < 7 ; i++) {
//           
//           if (test.addElement(in.nextInt())== 0)
//             
//                System.out.println("added sucessfully");
//           else
//                System.out.println("array is full");
//           
//            System.out.println(Arrays.toString(test.arr));
//                
//        }
//        
//        
//        
//        System.out.println("Please enter index element that you want to delete : ");
//        
//
//            if (test.deleteSortElement(in.nextInt())== 0)
//             
//                System.out.println("delete sucessfully");
//           else
//                System.out.println("array is empty");
//           
//            
//            System.out.println(Arrays.toString(test.arr));
       
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
   
    
    for (int i = 0 ; i < 7 ; i++) {         /// For add Element to an array
           
           if (test.addElement(in.nextInt())== 0)
             
                System.out.println("added sucessfully");
           else
                System.out.println("array is full");
           
            System.out.println(Arrays.toString(test.arr));
            
        }
    
    
        System.out.println("Enter an item that you want to search for : ");   /// For Search for element
         
        if (test.sequentialSearch(in.nextInt())== -1)  
            System.out.println("Not Found");
        else
            System.out.println("Found");
    
    
    }
      
}
