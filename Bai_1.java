public class Bai_1
{
    public static void main(String[] args)
    {
        int a=5, b=4, c=9, max;
        max = a;
        if (b>max) 
            max=b;
        else if (c>max) 
                max=c;
        System.out.println("Max la: "+max);
    }
}