
import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

String str[]=new String[4];
for(int i=0;i<str.length;i++)

{
    str[i]=sc.nextLine();
}
for(String str1: str)
{
System.out.println(str1);
}

        sc.close();
        int[] nums={3,4,5,6};
        System.out.println("Integer array: " + Arrays.toString(nums)); 
      //  System.out.println(Arrays.toString());
    }
}
