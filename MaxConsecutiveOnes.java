import java.util.Scanner;
public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
         System.out.println("Enter the elements: ");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int count=0;
         int maxcount=0;
         for(int i=0;i<n;i++){
            if (arr[i]==1){
                count++;
            }
            else{
                 maxcount= Math.max(maxcount,count);
                count=0;
                
            }
         }
         System.out.println(maxcount);

    }
}