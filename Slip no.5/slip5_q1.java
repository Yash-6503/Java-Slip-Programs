import java.io.*;
import java.util.*;

class Continent
{
    String continent_name;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Continent Name:");
        continent_name=sc.nextLine();
    }
    void display()
    {
        System.out.println("Continent Name is :"+continent_name);
    }
}

class Country extends Continent
{
    String country_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country Name:");
        country_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Country name is: "+country_name);
    }
}

class State extends Country
{
    String state_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State Name:");
        state_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("State name is: "+state_name);
    }
}

class City extends State
{
    String city_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City Name:");
        city_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("City name is: "+city_name);
    }
}

public class slip5_q1
{
    public static void main(String args[])
    {
        City c=new City();
        c.get();
        c.display();
    }
}