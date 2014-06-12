/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.chooseYourOwnAdventure.view;

/**
 *
 * @author kristyknapp
 */
public class exchangeSort {
    public static void ExchangeSort ( int [ ] resources )
{
     int i, j, temp;  //be sure that the temp variable is the same "type" as the array
     int size;
     
     size = 5;
     
     for ( i = 0; i < resources.length - 1; i ++ )  
     {
          for ( j = i + 1; j < resources.length; j ++ )
          {
               if( resources[ i ] > resources[ j ] )         //sorting into ascending order
               {
                       temp = resources[ i ];   //swapping
                       resources[ i ] = resources[ j ];
                       resources[ j ] = temp; 
                }           
          }
     }
     
     //display sorted array
     System.out.println("Sorted array is: " + resources[i]);
}
    
    /*
         int i, j, temp;  
     int size;
     
     size = 5;
     
     for ( i = 0; i < resources.length - 1; i ++ )  
     {
          for ( j = i + 1; j < resources.length; j ++ )
          {
               if( resources[ i ] > resources[ j ] )//sorting into ascending order
               {
                       temp = resources[ i ];   //swapping
                       resources[ i ] = resources[ j ];
                       resources[ j ] = temp; 
                }           
          }
     }
     
     //display sorted array
     System.out.print("sorted array is: " + resources[i]);
    */
    
}
