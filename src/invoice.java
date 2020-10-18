import java.util.Scanner;

public class invoice {
    String Number;
    String Description;
    int Quantity;
    double Price;

    Scanner input = new Scanner(System.in);

    public void Invoice()
    {
        Description = "Nothing";
        Number = "#000000";
        Price = 0;
        Quantity = 0;
    }

    public void Set_Description()
    {
        System.out.println("Write description : ");
        Description = input.nextLine();
    }

    public String Get_Description()
    {
        return Description;
    }

    public String Get_Number()
    {
        return Number;
    }

    public void Set_Number()
    {
        System.out.println("Write Number of the product : ");
        Number = input.nextLine();
    }

    public int Get_Quantity()
    {
        return Quantity;
    }

    public void Set_Quantity()
    {
        System.out.println("Enter the quantity : ");
        Quantity = input.nextInt();
    }

    public double Get_Price()
    {
        return Price;
    }

    public void Set_Price()
    {
        System.out.println("Enter the Price : ");
        Price = input.nextDouble();
    }

    public void Get_Invoice_Amount()
    {
        Set_Quantity();
        Set_Price();

        double Amount = Quantity * Price;

        if (Quantity < 0)
        {
            System.out.println(0);
        }
        else if (Price < 0)
        {
            System.out.println(0.0);
        }
        else {
            System.out.println("Amount is : " + Amount);
        }
    }

}
