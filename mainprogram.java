/*
 * Demonstration program
 */
import java.util.Scanner;
import java.util.Random;
public class SelectionDemonstrator
{
    public static void main (String[]args)
    {
        /*
         * Random portion
         */
        System.out.println("This section shows purely random selection. A random 10-number string is generated and \n compared to the target value, 0123456789.");
        Random schroedinger = new Random();
        Scanner reader = new Scanner (System.in);
        char cont = 'Y';
        char contx = 'Y';
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int ax = 0;
        int bx = 0;
        int cx = 0;
        int dx = 0;
        int ex = 0;
        int fx = 0;
        int gx = 0;
        int hx = 0;
        int ix = 0;
        int jx = 0;
        int countp = 0;
        int countn = 0;
        String contHolder = null;
        while ((cont == 'Y')||(cont == 'y'))
        {
            a = (schroedinger.nextInt(10));
            b = (schroedinger.nextInt(10));
            c = (schroedinger.nextInt(10));
            d = (schroedinger.nextInt(10));
            e = (schroedinger.nextInt(10));
            f = (schroedinger.nextInt(10));
            g = (schroedinger.nextInt(10));
            h = (schroedinger.nextInt(10));
            i = (schroedinger.nextInt(10));
            j = (schroedinger.nextInt(10));
            countp++;
            System.out.printf("%n%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%n",a,b,c,d,e,f,g,h,i,j);
            if ((a == 0)&&(b == 1)&&(c == 2)&&(d == 3)&&(e == 4)&&(f == 5)&&(g == 6)&&(h == 7)&&(i == 8)&&(j == 9))
            {
                System.out.println("Target reached (a miracle has occurred, these chances are astronomically low) after " +countp + " attempts. Now proceeding to next part of demo.");
                cont = 'N';
            }
            else
            {
            System.out.println("The numbers do not equal the target. " +countp + " attempts have been made so far. Do you wish to continue? Enter Y for yes, anything else for no.");
            contHolder = reader.next();
            cont = contHolder.charAt(0);
        }
        }
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        System.out.println("The next section will now simulate cumulative selection. Target is again 0123456789.");
        while ((contx == 'y')||(contx == 'Y'))
        {
            if (ax == 0)
            {
                a = (schroedinger.nextInt(10));
            }
            if (bx == 0)
            {
                b = (schroedinger.nextInt(10));
            }
            if (cx == 0)
            {
                c = (schroedinger.nextInt(10));
            }
            if (dx == 0)
            {
                d = (schroedinger.nextInt(10));
            }
            if (ex == 0)
            {
                e = (schroedinger.nextInt(10));
            }
            if (fx == 0)
            {
                f = (schroedinger.nextInt(10));
            }
            if (gx == 0)
            {
                g = (schroedinger.nextInt(10));
            }
            if (hx == 0)
            {
                h = (schroedinger.nextInt(10));
            }
            if (ix == 0)
            {
                i = (schroedinger.nextInt(10));
            }
            if (jx == 0)
            {
                j = (schroedinger.nextInt(10));
            }
            if (a == 0)
            {
                ax = 3;
                if (b == 1)
                {
                    bx = 3;
                    if (c == 2)
                    {
                        cx = 3;
                        if (d == 3)
                           {
                                dx = 3;
                                if (e == 4)
                                {
                                    ex = 3;
                                    if (f == 5)
                                        {
                                            fx = 3;
                                            if (g == 6)
                                            {
                                                gx = 3;
                                                if (h == 7)
                                                {
                                                    hx = 3;
                                                    if (i == 8)
                                                    {
                                                        ix = 3;
                                                        if (j == 9)
                                                        {
                                                            jx = 3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
            System.out.printf("%n%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%n",a,b,c,d,e,f,g,h,i,j);
            countn++;
            if ((a == 0)&&(b == 1)&&(c == 2)&&(d == 3)&&(e == 4)&&(f == 5)&&(g == 6)&&(h == 7)&&(i == 8)&&(j == 9))
            {
                System.out.println("Target reached after " +countn + " attempts. Now proceeding to next part of demo.");
                contx = 'N';
            }
            else
            {
            System.out.println("The numbers do not equal the target. " +countp + " attempts have been made so far. Do you wish to continue? Enter Y for yes, anything else for no.");
            ;contHolder = reader.next();
            ;contx = contHolder.charAt(0);
        }
        }
    }
}
