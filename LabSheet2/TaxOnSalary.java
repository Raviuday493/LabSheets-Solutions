package prog;
import java.io.IOException;
import java.util.Scanner;
class TaxOnSalary{
	private double salary;
	private boolean isPANsubmitted;
	
	public double getsalary() {
		return salary;
	}
	
	public boolean getisPANsubmitted() {
		return isPANsubmitted;
	}
	
	public TaxOnSalary(boolean isPANsubmitted) {
		this.isPANsubmitted = isPANsubmitted;
		this.salary=1000.00;
	}
	public 	TaxOnSalary() {
		this.isPANsubmitted = false;
		this.salary = 0.0;
	}
	
	public void inputSalary() {
    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter salary: ");
    this.salary = sc.nextDouble();
}
	
	public double calculateTax() {
		if(salary<180000 && isPANsubmitted==true) {
			return 0.0;
		}
		else if(salary<180000 && isPANsubmitted==false) {
			return 0.05*salary;
		}
		else if (salary >= 180000 && salary < 500000) {
            return 0.10 * salary;
        } else if (salary >= 500000 && salary < 1000000) {
            return 0.20 * salary;
        } else {
            return 0.30 * salary;
        }
	}
	
}

public class Tax {
public static void main(String[] args) throws IOException{
	TaxOnSalary tax1 = new TaxOnSalary(true);
	TaxOnSalary tax2 = new TaxOnSalary();
	
	System.out.println("Enter salary for tax1: ");
    tax1.inputSalary();

    System.out.println("Enter salary for tax2: ");
    tax2.inputSalary();
    
    double taxPayable1 = tax1.calculateTax();
    double taxPayable2 = tax2.calculateTax();
    
    System.out.println("Tax for tax1 = " + taxPayable1);
    System.out.println("Tax for tax2 = " + taxPayable2);
}
}
