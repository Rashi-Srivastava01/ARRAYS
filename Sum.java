
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0;
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++){
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum1=sum1+arr[i];
        }
        System.out.println("The sum of array is: " +sum1);

            
        }
}