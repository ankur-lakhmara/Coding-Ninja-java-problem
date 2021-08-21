package Coding_Ninja_Array;

import java.util.Scanner;

public class Find_largest_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the element at "+i+"th position");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int j = 1; j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println("The greatest element is " + max);
    }
}
