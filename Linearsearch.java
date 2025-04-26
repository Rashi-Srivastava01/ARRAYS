import java.util.Scanner;
public class Linearsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int x=ob.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                System.out.println("Found the number at index: "+i);
                break;
            }
            
        }


    }
}