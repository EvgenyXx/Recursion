import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random  random = new Random();
       int [] array = new int[]{2,5,7,9,3,4};


       ReverseArray(array,0 );




    }
    public static void ReverseArray (int [] arr , int index ) {
        if (index < arr.length){

            ReverseArray(arr,index +1);
            System.out.println(arr[index]);
        }
    }
}
