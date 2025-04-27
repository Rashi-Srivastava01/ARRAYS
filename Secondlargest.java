import java.util.Arrays;
import java.util.Scanner;
public class Secondlargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

        }
    }
    System.out.println("The largest is:" +largest);
    Arrays.sort(arr);
    int secondlar=arr[n-2];
    for(int i=n-2;i>=0;i--){
        if(arr[i]>secondlar && largest!=secondlar){
            secondlar=arr[i];
        }
    }
    System.out.println("The smallest is:" +secondlar);



            }
        }

    