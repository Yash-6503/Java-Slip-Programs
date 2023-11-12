import java.io.*;
import java.util.*;

abstract class staff
{
    protected int member_id;
    protected String member_name;
    staff(int sid, String sname)
    {
        member_id=sid;
        member_name=sname;
    }
    abstract void display();
}

class officestaff extends staff
{
    String dept;
    officestaff(int oid, String oname, String odept)
    {
        super(oid, oname);
        dept=odept;
    }
    void display()
    {
        System.out.println(member_id+ "\t" +member_name+ "\t" +dept);
    }
}

public class slip1_q2
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many staff:");
        n=sc.nextInt();
        officestaff s[]=new officestaff[n];
        System.out.println("Enter Staff Details");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter id:");
            int id=sc.nextInt();
            System.out.println("Enter Name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter department:");
            String dept=sc.nextLine();
            s[i]=new officestaff(id, name, dept);
        }
        System.out.println("Staff Details are:");
        System.out.println("ID \t Name \t Department \n");
        for(i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}