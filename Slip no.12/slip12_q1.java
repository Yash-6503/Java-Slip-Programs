import java.util.Scanner;

class College {
    private int cno;
    private String cname;
    private String caddr;

    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    public void displayCollegeDetails() {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

class Department extends College {
    private int dno;
    private String dname;

    public Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    public void displayDepartmentDetails() {
        displayCollegeDetails();
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class slip12_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter College Number: ");
        int cno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter College Name: ");
        String cname = scanner.nextLine();

        System.out.print("Enter College Address: ");
        String caddr = scanner.nextLine();

        System.out.print("Enter Department Number: ");
        int dno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department Name: ");
        String dname = scanner.nextLine();

        Department department = new Department(cno, cname, caddr, dno, dname);
        department.displayDepartmentDetails();

        scanner.close();
    }
}