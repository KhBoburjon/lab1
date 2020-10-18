import java.util.Scanner;
public class BMI {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double BMI;
        System.out.print("Height: ");
        double height=input.nextDouble();
        System.out.print("Weight: ");
        double weight=input.nextDouble();
        BMI=weight/(height*height);
        System.out.println("BMI="+BMI);
        if(BMI<=18.5)
        {
            System.out.println("Your category is underweight.");
        }
        else if (18.5<=BMI&&BMI<=24.9)
        {
            System.out.println("Your category is normal.");
        }
        else if(25<=BMI&&BMI<=29.9)
        {
            System.out.println("Your category is normal.");
        }
        else
            System.out.println("Your category is obese.");
    }
}
