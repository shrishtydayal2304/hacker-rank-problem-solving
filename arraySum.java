import java.util.Scanner;

public class Sum{
    private static Scanner sc;
    public static void main(String[] args) 
    {
        int Size, i, Sum = 0;
        sc = new Scanner(System.in);
     
//System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();    
        
        int [] a = new int[Size];
        
       // System.out.print( + Size  );
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }   

        for(i = 0; i < Size; i++)
        {
            Sum = Sum + a[i]; 
        }        
        System.out.println( + Sum);
    }
}
