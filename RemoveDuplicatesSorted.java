import java.util.Scanner;
public class RemoveDuplicatesSorted{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an Array: ");
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<=1){
            System.out.println("No dupicates");
        }
        int a=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){//it means it's unique
                arr[a]=arr[i];//store it in arr[1]
                a++;//increment it
            }
        }
        System.out.println("The new sorted array by removing all duplicates- ");
        for(int i=0;i<a;i++){
            System.out.println(arr[i] + " ");
        }
    }
   
}