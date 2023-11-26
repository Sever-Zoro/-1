import java.util.Scanner;
 class Main {
     public static void start() {
         while (true) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Кальулятор:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Факториал");
            System.out.println("6. Квадратный корень");
            System.out.println("7. Возведение в тепень");
            System.out.print("Введите вариант: ");
            int menu = scan.nextInt();
            if (menu == 1) {
                System.out.print("Введите первое число: ");
                int n1 = scan.nextInt();
                System.out.print("Введите первое число: ");
                int n2 = scan.nextInt();
                int gav = Calculator.sum(n1, n2);
                System.out.println(gav);
            }
            else if (menu == 2) {
              System.out.print("Введите первое число: ");
              int n1 = scan.nextInt();
              System.out.print("Введите второе число: ");
              int n2 = scan.nextInt();
              int SSSR = Calculator.sub(n1, n2); 
              System.out.println(SSSR);
            }
            else if (menu == 3) {
            System.out.print("Введите первое число:");
             int n1 = scan.nextInt();
             System.out.print("Введите второе число: ");
             int n2 = scan.nextInt();
             int SSS = Calculator.mul(n1, n2);
             System.out.println(SSS);
            }
            else if (menu == 4) { 
                try {
              System.out.print("Введите первое число:");
              int n1 = scan.nextInt();
              System.out.print("Введите второе число: ");
              int n2 = scan.nextInt();
              int SS = Calculator.div(n1, n2); 
              System.out.printf("%d / %d = %d", n1, n2, SS);
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
            }
            else if ( menu == 5) {
              System.out.print("Введите степень факториала: ");
              int num = scan.nextInt();
              long res = Calculator.fact(num);
              System.out.printf("%d! = %d", num, res);
            }
            else if (menu == 6) {
                System.out.print("Введите число: ");
                double num = scan.nextDouble();
                double res = Calculator.sqrt(num);
                System.out.printf("sqrt(%f) = %f", num, res);
            }
            else if (menu ==7) {
            System.out.print("Введите число: ");
            double num = scan.nextDouble();
            System.out.print("Введите степень: ");
            int pow = scan.nextInt();
            double res =Calculator.pow(num, pow);
            System.out.printf("%f^%d = %f", num, pow, res);
            }
            else {
                System.out.println("Вы ввели не корректное значение меню.");
            }
         }
        }
    public static void main(String[] args) {
        start();
   } 
} 

 class Calculator {
    public static int sum(int nam1, int nam2) {
        return nam1 + nam2;
    }
    public static int sub(int nam1, int nam2) {
        return nam1 - nam2;
    }
    public static int mul(int nam1, int nam2) {
        return nam1 * nam2;
    }
    public static int div(int nam1, int nam2) throws Exception {
        if (nam2 == 0) {
            throw new Exception("Делить на ноль нельзя!!!!!!!!!!!!!!!!!!!");
        }
        return nam1 / nam2;
    }
    public static long fact(long number) {
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }
    public static double pow(double number, int pow) {
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * number;
        }
        return result;
    }
}
