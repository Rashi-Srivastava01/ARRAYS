
import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
       
        for( int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

        }
    }
    System.out.println(largest);
}}