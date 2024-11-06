public class Swap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        swap(arr, 1, 4);
        for(int arr1:arr)
        {
            System.out.print(arr1 +" ");
        }
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
