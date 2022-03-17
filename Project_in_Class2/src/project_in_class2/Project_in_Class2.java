/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class2;

/**
 *
 * @author youse
 */
public class Project_in_Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int [] arr = { 11 ,19 , 33 , 44 ,50 } ; 
        
//       print(arr);
//       reverse(arr); 
//       print(arr);
              
//       print(arr);
//       shift_Left(arr); 
//       print(arr);
    
//       print(arr);
//       shift_Right(arr); 
//       print(arr);
    
    
    
    
    }
    
      public static int[] reverse (int[] x )
    {
        int n = x.length -1 ; 
        
        for (int i = 0 ; i < x.length / 2 ; i++) {
            int temp = x[i];
            x[i] = x[n] ;
            x[n] = temp ;
            n-- ; 
            
        }
    return x ; 
    
    }
    
    public static int[] shift_Left (int [] x)
    {
        int n = x[0] ; 
        
        for (int i = 0 ; i < x.length -1 ; i++) {
            x[i] = x[i+1];
            
        }  
        x[x.length -1] = n ;  
    
    return x ; 
    
    }      
      
    public static int[] shift_Right (int [] x)
    {
        int n = x[x.length -1] ; 
        
        for (int i = x.length -1 ; i > 0 ; i--) {
            x[i] = x[i-1];
            
        }  
        x[0] = n ;  
    
    return x ; 
    
    }

    public static void print (int[] arr )
    {
        System.out.print( "[");
        for (int i = 0; i < arr.length; i++) {
          
            if (i != arr.length - 1)
                System.out.print(arr[i] + ",");
             else
                System.out.print(arr[i]);
            
        }
          System.out.print( "]\n" );
    
    }
    
}
