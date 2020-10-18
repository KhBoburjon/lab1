import java.util.Scanner;
public class approximating {
    public static void main(String[] args) {

        double a = 5;
        double b = 3;
        int count=0;
        double sum1=0;
        double sum2=0;
        double summ=0;
        for(int i=1;i<200000;i++){
            sum1+=1/a;
            sum2+= 1/b;
            summ = 4*(1-sum2+sum1);
            if(((int)(summ*100000))==314159&&count<1){
                System.out.println(i-1+" terms we have to use before to get first value that begions with 3.14159");
                count++;
            }
            a+=4;
            b+=4;
        }
        System.out.println("The sum of the first 200000 terms of the series is: "+summ);
    }
}
