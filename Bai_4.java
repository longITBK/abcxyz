public class Bai_4
{
    public static void main(String[] args)
    {
        double a=2, b=1, c=5, d=1, e=-1, f=2, x, y;
        x = (b*f - e*c)/(b*d - e*a);
        y = (c - a*x)/b;
        System.out.println("Tap nghiem la: ");
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
    }
}