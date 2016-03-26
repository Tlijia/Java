/*回文素数*/
package java_ex1.t3;

public class Java_ex1T3 {

    public static void main(String[] args) {
        int p,q,i,j,k,n=0;
        for(i=2;n<100;i++)
        {
            p=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    p=1;
            }
            if(p==0)
            {
                q=i;
                k=0;
                while(i!=0)
                {
                    k=k*10+i%10;
                    i=i/10;
                }
                if(k==q)
                {
                    System.out.print(" "+q);
                    n++;
                    if(n%10==0)
                        System.out.print("\n");
                }
                i=q;
            }
                    
        }
    }
}
