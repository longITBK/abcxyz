public class Bai_7
{
    public static void main(String[] args)
    {
        int month=9, year=2021, days;
        if (month==2 && year%100==0 && year%400==0)
            days = 29;
        else if(month==1 || month==3 || month==5 || month==8 || month==7 || month==10 || month==12)
                days = 31;
            else days = 30;
        System.out.println("So ngay: "+days);
    }

}