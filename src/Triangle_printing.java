public class Triangle_printing {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

public class Triangle_Printing {
    public static void main(String[] args) {
      for (int i=1;i<=10;i++){
          for(int j=10;j>=i;j--){
              System.out.print(" * ");
          }
          System.out.println();
      }
    }
}
public class Triangle_Printing {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j>=1; j--) {
                if (i>=j){
                    System.out.print(" * ");
                }
                else
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}

public class Triangle_Printing {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(" * ");
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}

