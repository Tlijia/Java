/*数字金字塔*/
package java_ex1.t1;
import java.util.Scanner;
public class Java_ex1T1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number for n:");
        int n=input.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
                System.out.print("  ");
            for(;j>0;j--)
                System.out.print(j+" ");
            for(k=2;k<=i;k++)
                System.out.print(k+" ");
            System.out.println("\n");
        }
    }
    
}
