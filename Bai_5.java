public class Bai_5
{
    public static void main(String[] args)
    {
        int a=3, b=2, c=9, tg;
        if(a>b && a<c)
            tg = a;
        else if(b>a && b<c)
            tg = b;
                else tg=c;
        System.out.println("Trung gian la: "+tg);
    }

}