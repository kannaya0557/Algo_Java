import java.util.*;
public class Multi_Dimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       int[][] arr1={{1,2,3},
    {4,5,6,},
{7,8,9}};
System.out.println(Arrays.deepToString(arr1));
for(int rows=0;rows<arr1.length;rows++)
{
for(int col=0;col<arr1[rows].length;col++)
{
System.out.print(arr1[rows][col]+" ");
}
System.out.println(" ");
}
        int[][] arr=new int[3][4];

for(int row=0;row<arr.length;row++)
{
    for(int col=0;col<arr[row].length;col++)
    {
        arr[row][col]=sc.nextInt();
    }
}
for(int[] newarr:arr)
{
System.out.println(Arrays.toString(newarr));
}
    }
    
}
