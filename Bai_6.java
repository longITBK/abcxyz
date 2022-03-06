public class Bai_6
{
    public static void main(String[] args)
    {
        double a=5, b=19, money;
        if (b<18)
            money = (b-a)*45000;
        else money = (18-a)*45000 + (b-18)*60000;
        System.out.println("So tien phai tra la: "+money);
    }

}