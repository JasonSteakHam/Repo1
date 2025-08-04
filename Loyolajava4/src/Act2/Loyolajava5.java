
package Act2;

import java.util.Scanner;

public class Loyolajava5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name: ");
        String ename = sc.nextLine();
        System.out.println("Enter Hourly Rate: ");
        float hrate = sc.nextFloat();
        System.out.println("Enter Total Hours Worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("--------------Wage Summary--------------");
        System.out.print("Employee: "+ename);
        System.out.print("Hourly Rate: "+hrate);
        System.out.print("Hours Worked: "+hours);
        System.out.print("Gross Weekly Wage: "+(hours*hrate));
        System.out.print("SSS Contribution(10%): "+(hours*hrate)*0.1);
        System.out.print("----------------------------");
        System.out.print("Net Weekly Wage: "+((hours*hrate)-((hours*hrate)*0.1)));
      }
    
}
