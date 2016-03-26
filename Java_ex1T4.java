/*数组合并*/
package java_ex1.t4;

import java.util.*;
public class Java_ex1T4 {
    public static int[] merge(int[] list1,int[] list2)
    {
        int[] list3=new int[list1.length+list2.length];
        int i=0,j=0,k=0;
        while(i<list1.length&&j<list2.length)
        {
            if(list1[i]<list2[j])
            {
                list3[k]=list1[i];
                i++;
                k++;
            }
            else
            {
                list3[k]=list2[j];
                k++;
                j++;
            }
        }
            if(i<list1.length)
            {
                for(;i<list1.length;i++)
                {
                    list3[k++]=list1[i];
                }
            }
            if(j<list2.length)
            {
                for(;j<list2.length;j++)
                    list3[k++]=list2[j];
            }
        return list3;
        
    }
    
    public static void main(String[] args) {
        int n1,n2,i;
        System.out.print("Enter the length of array 1:");
        Scanner input = new Scanner(System.in);
        n1=input.nextInt();
        int[] list1=new int[n1];
        System.out.print("enter the data of array1:");
        for(i=0;i<n1;i++)
            list1[i]=input.nextInt();
        System.out.print("Enter the length of array 2 :");
        n2=input.nextInt();
        int[] list2=new int[n2];
        System.out.print("enter the data of array2:");
        for(i=0;i<n2;i++)
            list2[i]=input.nextInt();
        int[] list3;
        list3=merge(list1,list2);
        for(i=0;i<list3.length;i++)
            System.out.print(list3[i]+" ");
    }
}
