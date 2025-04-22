public class MaxRange{
    public static void main(String[] args) {
        int[] arr={5,6,98,65,100};
        System.out.println(maxRange(arr,1,3));

    }
    static int maxRange(int[] arr,int start ,int end){
    int maxr=arr[start];
    for (int i =start;i<=end;i++){
        if( arr[i]>maxr){
            maxr=arr[i];
        }
    }
    return maxr;

    }
}
