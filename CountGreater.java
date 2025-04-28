//Count the number of elements in given array grater than given number x.
import java.util.Scanner;
public class CountGreater{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the value os x: ");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("The number of elements grater than x are:  "+count);
        
    }
}