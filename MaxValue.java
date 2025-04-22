public class MaxValue{
    public static void main(String[] args) {
        int[] arr={5,6,98,65};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
    int maxvalue=arr[0];
    for (int i =1;i<arr.length;i++){
        if( arr[i]>maxvalue){
            maxvalue=arr[i];
        }
    }
    return maxvalue;

    }
}

