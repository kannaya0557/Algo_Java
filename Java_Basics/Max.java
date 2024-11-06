public class Max {
public static void main(String[] args) {
    int arr[]={1,2,45,23,12,67,4534};
    System.out.println(max(arr));
    for(int arr1:arr)
    {
        System.out.print(arr1+" ");
    }
}
static int max(int[] arr)
{
    int maxValue=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>maxValue)
        {
            maxValue=arr[i];
        }
        
    }
    return maxValue;
}
}
