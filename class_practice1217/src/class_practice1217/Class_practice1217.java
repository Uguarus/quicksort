/*
 * To change this license heapre, choose License Heapres in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_practice1217;

/**
 *
 * @author 譚峻宜
 */
public class Class_practice1217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers [] = {11,17,19,21,10,5,7,9};
        Quicksort(numbers, 0, numbers.length -1);
         printer(numbers);
    }

    public static void Quicksort(int numbers[], int first, int pre)
    {
            int center = numbers[first];
            int i = first; 
            int j = pre; 
            int stay;
           
            while(i<j)
            {
               while (numbers[i] <= center && i < j) 
                  i++;

               while (numbers[j] > center) 
                  j--;   

               if (i<j) 
               {                                     
                   stay = numbers[i];                  
                   numbers[i]= numbers[j];
                   numbers[j]=stay;
               }
            }

             numbers[first] = numbers[j]; 
             numbers[j] = center;

             if (first < j-1)
                Quicksort(numbers,first,j-1);

             if (j+1 < pre)
                Quicksort(numbers,j+1,pre);
      }
    
    public static void printer(int show[])
    {
        for(int i = 0; i < show.length; i++)
        {
            System.out.println(show[i]);
        }
    }
}
