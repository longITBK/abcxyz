import java.lang.Math;
public class Bai_3
{
    public static void main(String[] args)
    {
        double a=3, b=4.5, c=-2, denta, x1, x2;
        denta = b*b - 4*a*c;
        if (denta < 0)
            System.out.println("PT vo nghiem!");
        else
        {
            x1 = (-1*b+Math.sqrt(denta))/(2*a);
            x2 = (-1*b-Math.sqrt(denta))/(2*a);
            System.out.println("X1= "+x1);
            System.out.println("X2= "+x2);
        }
    }
}