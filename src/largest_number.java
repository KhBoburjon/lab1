import java.util.Scanner;
public class largest_number {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int largest2= Integer.MIN_VALUE;
        for(int count=1;count<=10;count++)
        {
            System.out.printf("Please,enter the number %d:",count);
            int number=input.nextInt();
            if(number>largest)
            {
                largest2=largest;
                largest=number;
            } else if (number>largest2)
            {
                largest2=number;
            }
        }
        System.out.printf("The largest number is %d\n",largest);
        System.out.printf("The second largest number is %d ",largest2);
    }
}
