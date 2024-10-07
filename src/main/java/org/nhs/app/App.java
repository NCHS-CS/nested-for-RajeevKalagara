public class App
{
    public static void main(String args[])
    {
        /*for(int i = 1; i <= 5; i++)
        {
            for(int count = 1; count <=4; count++)
            {
                System.out.print(i);
            }
            System.out.println();
        }*/

       practice1();
       System.out.println();
       practice2();
       System.out.println();
       practice3();

    }

    public static void practice1()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void practice2()
    {
        for(int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(".");
            }

            for(int k = 1; k <=i; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void practice3()
    {
        for(int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(".");
            }

            System.out.print(i);

            for(int k = 1; k <i; k++)
            {
                System.out.print(".");
            }

            
            System.out.println();
        }
    }
}