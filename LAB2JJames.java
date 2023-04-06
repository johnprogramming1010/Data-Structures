import java.util.Random;//import random class
   public class LAB2JJames{
   public static void Incinsertion(int array[])
   {  
      int n = array.length;  
      for (int j = 1; j < n; j++)
      {  
      int key = array[j];  
      int i = j-1;  
      while ( (i > -1) && ( array [i] > key ) ) //bigger value moving up
      {  
      array [i+1] = array [i];  
      i--;  
      }  
      array[i+1] = key; // Put the key in its proper location
      }  
   }
   public static void Decnisertion( int [ ] num)
   {
      int j;
      int key;
      int i;  

      for (j = 1; j < num.length; j++) // Start with 1 (not 0)
      {
      key = num[ j ];
      for(i = j - 1; (i >= 0) && (num[ i ] < key); i--) // Smaller values are moving up
      {
      num[ i+1 ] = num[ i ];
      }
      num[ i+1 ] = key; // Put the key in its proper location
      }
   }
   public static void main(String[] args)
   {
      int arr[]=new int[6];//creates the int array with size 6
      Random rand = new Random();//creates the object of the random class
      for(int i=0;i<6;i++)
      {
      int n=rand.nextInt(5);//creates the random options from 0 to 5
      arr[i]=n;
      }
      //prints the array
      System.out.println("Array is:");
      for(int i=0;i<6;i++)
      {
      System.out.println(arr[i]);
      }
      Incinsertion(arr);
      //prints the array after sorting
      System.out.println("After sorting in increasing order the Array is:");
      for(int i=0;i<6;i++)
      {
      System.out.println(arr[i]);
      }
      Decnisertion(arr);
      //prints the array after sorting
      System.out.println("After sorting in decreasing order the Array is:");
      for(int i=0;i<6;i++)
      {
      System.out.println(arr[i]);
      }
   }
}