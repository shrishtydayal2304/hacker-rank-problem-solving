import java.util.Scanner;

public class Sum{
    private static Scanner sc;
    public static void main(String[] args) 
    {
        int Size, i, Sum = 0;
        sc = new Scanner(System.in);
        Size = sc.nextInt();    
        //creating the array 
        int [] a = new int[Size];
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
