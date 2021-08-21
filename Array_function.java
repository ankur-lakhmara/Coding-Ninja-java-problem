package Coding_Ninja_Array;

import java.util.Scanner;

public class Array_function {
    public static void printArray(int []arr){
        int n = arr.length;
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int []takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Enter element at "+i+"th position");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[]args){
        int arr[] = takeInput();
        printArray(arr);
    }
}
