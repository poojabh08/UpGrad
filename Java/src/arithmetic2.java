public class arithmetic2 {
    public static void main(String[] args)
    {
        int a =23456;
        for (int i=a; i>0 ; i/=10)
        {
            System.out.println(i%10);
        }
    }
}
