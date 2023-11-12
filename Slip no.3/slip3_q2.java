import java.io.*;
import java.util.*;

class patient
{
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;
    patient(String patient_name, int patient_age, int patient_oxy_level, int patient_HRCT_report)
    {
        this.patient_name=patient_name;
        this.patient_age=patient_age;
        this.patient_oxy_level=patient_oxy_level;
        this.patient_HRCT_report=patient_HRCT_report;
    }
    void display()
    {
        for(int i=0;i<20;i++)
        System.out.println();
        System.out.println("Patient Name: "+patient_name);
        System.out.println("Patient Age: "+patient_age);
        System.out.println("Patient Oxygen Level: "+patient_oxy_level);
        System.out.println("Patient HRCT report: "+patient_HRCT_report);
    }
}

public class slip3_q2 extends Exception
{
    public static void main(String args[])
    {
        String patient_name;
        int patient_age;
        int patient_oxy_level;
        int patient_HRCT_report;   
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many patients: ");
        n=sc.nextInt();
        patient p[]=new patient[n];
        for(int i=0;i<n;i++)
        {
            System.out.println();
            System.out.println("Enter Patient Name: ");
            sc.nextLine();
            patient_name=sc.nextLine();
            System.out.println("Enter Patient Age: ");
            patient_age=sc.nextInt();
            System.out.println("Enter Patient Oxygen Lavel: ");
            patient_oxy_level=sc.nextInt();
            System.out.println("Enter Patient HRCT report: ");
            patient_HRCT_report=sc.nextInt();
            p[i]=new patient(patient_name, patient_age, patient_oxy_level, patient_HRCT_report);
        }
        try
        {
            for(int i=0;i<n;i++)
            {
                p[i].display();
                if(p[i].patient_oxy_level<95 && p[i].patient_HRCT_report>10)
                    throw new NullPointerException("\n");
            }
        }
        catch(Exception e)
        {
            System.out.println("The patient is covid positive(+) and needs treatement.");
        }
    }
}
