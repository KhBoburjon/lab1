import java.util.Scanner;

public class Sales_commision {
    public static void start(){
        Scanner input = new Scanner(System.in);
        //Default values
        double TotalSalary=200;
        double Item1Value=239.99;
        double Item2Value=139.75;
        double Item3Value=35.49;
        double Item4Value=350.89;
        System.out.println("Please Input number of every Items which is sold");
        System.out.println("Total amount of first item : ");
        int n1= input.nextInt();
        System.out.println("Total amount of second item : ");
        int n2= input.nextInt();
        System.out.println("Total amount of third item : ");
        int n3= input.nextInt();
        System.out.println("Total amount fourth item : ");
        int n4= input.nextInt();
        TotalSalary+= (Item1Value*n1+Item2Value*n2+Item3Value*n3+Item4Value*n4)*0.9;

        System.out.println("Total value is : "+ TotalSalary);


    }
}
