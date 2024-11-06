public class MaxRange {
public static void main(String[] args) {
    int arr[]={1,34,456,67,643};
    System.out.println(Maxrange(arr, 2, 3));
}
static int Maxrange(int[] arr,int start,int end)
{
    int maxval=arr[start];
    for (int i = start; i < end; i++) {
        if(arr[i]>maxval)
        {
            maxval=arr[i];
        }
    }
    return maxval;
}
}
