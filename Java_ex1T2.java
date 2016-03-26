/*π的近似值 */
package java_ex1.t2;
import javax.swing.*;
public class Java_ex1T2 {

    public static void main(String[] args) {
        String k,q;
        k=JOptionPane.showInputDialog("enter an number for i");
        double i=Double.parseDouble(k);
        double pi=0;
        double j;
        for(j=1;j<=i;j++)
            pi+=Math.pow(-1, j+1)/(2*j-1);
        pi=4*pi;
        JOptionPane.showMessageDialog(null,pi);
    }   
}
