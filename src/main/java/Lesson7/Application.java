package Lesson7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int res =0;
        int a = 0;
        byte b = 0;
        try {
            System.out.println("Enter a = ");
            a = scanner.nextInt();
            System.out.println("Enter b = ");
            b = scanner.nextByte();
            System.out.println("Enter operation = ");
            String op = scanner.next();
            switch (op.charAt(0)) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
            }
            }catch (InputMismatchException e){
            System.out.println("Ошибка ввода");
        } catch (ArithmeticException e){
            System.out.println("Арифметическая ошибка");
        }System.out.println("Программа отработала: "+res);

        try{
            Thread.sleep(5000);
        } catch (InputMismatchException | InterruptedException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
