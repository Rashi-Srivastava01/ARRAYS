
// Given an integer array arr[] and an integer ele the task is to the remove all occurrences of ele from arr[] in-place and return the number of elements which are not equal to ele. If there are k number of elements which are not equal to ele then the input array arr[] should be modified such that the first k elements should contain the elements which are not equal to ele and then the remaining elements

import java.util.Scanner;
public class RemoveAllOccurenceOfElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an Array: ");
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to check");
        int ele=sc.nextInt();
        int k=0;
        for( int i=0;i<n;i++){
            if(arr[i]!=ele){
                arr[k]=arr[i];
                k++;

            }
        }
        System.out.println(k);
    }
}