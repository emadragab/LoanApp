import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class CompueArea {

public static void main (String [] args)

{
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter loan amount, e.g.,120000.95: ");
    double loanamount = scanner.nextDouble();
    System.out.println("enter number of years as Integer");
    int numofyears= scanner.nextInt();
    System.out.println("enter interest rate");
    double annualinterest= scanner.nextDouble();
     double monhtlyinterset= annualinterest/1200;
     double p=numofyears * 12 ;
     double m= 1+monhtlyinterset;
    double monthpayment=loanamount*monhtlyinterset/(1-1/Math.pow(m,p));
    double totalpayment=monthpayment*numofyears*12;

    System.out.println("the monthly payment is $"+(int)(monthpayment *100) / 100.0);
    System.out.println("the total payment is $"+(int)(totalpayment*100)/100.0);









}

}
