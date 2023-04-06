import java.util.Arrays;
import java.util.Random;
public class HW1 {

// Linear Search

   public static int linerSearch(int[] arr, int key){
      int size = arr.length;
      for(int i=0;i<size;i++){
         if(arr[i] == key){
            return i;
         }
      }
      return -1;
   }
   
// Binary Search

   public int binarySearch(int[] inputArr, int key) {
      int beginning = 0;
      int end = inputArr.length - 1;
      while (beginning <= end) {
         int mid = (beginning + end) / 2;
         if (key == inputArr[mid]) {
            return mid;
         }
         if (key < inputArr[mid]) {
            end = mid - 1;
         } else {
            beginning = mid + 1;
         }
      }
      return -1;
   }

// returns an array with random numbers

   public static int[] getArray(int size, Random random){
   // creates an array
      int[] array = new int[size];
      
   // fills array with random numbers from 1 to 100000
  
      for(int i=0; i<size; i++)
         array[i] = random.nextInt(100000)+1;
      return array;
   }
   
   public static void main(String a[]){
      Random random = new Random();
      long beginningTime;
      long endTime;
      long beginningSeconds;
      long endSeconds;
      int index;
   // sets it up to have 5 options
      for(int i=10; i<=100000; i= i*10){
         int[] array = getArray(i, random);
         int rand = random.nextInt(100000)+1; // element to search

         System.out.println("Searching : "+rand+", Array size is: "+i);
      
         beginningTime = System.nanoTime();
         beginningSeconds = System.currentTimeMillis();
         index = linerSearch(array, rand);
         endTime = System.nanoTime();
         endSeconds = System.currentTimeMillis();

         System.out.println("Time taken to search "+rand+" by LINEAR SEARCH is "+(endSeconds-beginningSeconds)+" milli seconds");
         System.out.println("Time taken to search "+rand+" by LINEAR SEARCH is "+(endTime-beginningTime)+" nannoseconds");
      
         Arrays.sort(array); // sorting for Binary search
      
         beginningTime = System.nanoTime();
         beginningSeconds = System.currentTimeMillis();
         index = linerSearch(array, rand);
         endTime = System.nanoTime();
         endSeconds = System.currentTimeMillis();

         System.out.println("Time taken to search "+rand+" by BINARY SEARCH is "+(endSeconds-beginningSeconds)+" milli seconds");
         System.out.println("Time taken to search "+rand+" by BINARY SEARCH is "+(endTime-beginningTime)+" nannoseconds");
         System.out.println("\n");
      }
   }
}