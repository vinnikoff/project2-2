/**
 * Created by VINNI on 08.11.16.
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int balans=1000;
        int withdrawal=100;
        int percent=5;

        System.out.println("INPUT");
        System.out.println("balans" + " " + balans);
        System.out.println("withdrawal" + " " + withdrawal);
        System.out.println("\n");
        System.out.println("OUTPUT");
        pay(balans, withdrawal, percent);
    }

    public static void pay(float balans, float withdrawal, int percent)
    {
        float paypercent=withdrawal*percent/100;
        float payall=withdrawal+paypercent;
        float newbalans = balans-payall;

        if (newbalans<0)
            System.out.println("NO");

        else
            System.out.println("OK" +" " + paypercent + " " + newbalans);
    }
}