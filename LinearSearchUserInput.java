package ArrayEx;
import java.util.Scanner;

public class LinearSearchUserInput {
    public static void main(String[] args) {
        int i,n,c=0,search,arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in element");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("enter element: " +n);
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
            System.out.println("Enter value need to find: ");
            search=sc.nextInt();

            for(i=0;i<n;i++){
                if(arr[i]==search){
                    System.out.println(search+"is present on index pos" +c);
                break;
                }
            }
            if (c==n)
                System.out.println(search+"isn't present on index pos" +c);

    }
}
