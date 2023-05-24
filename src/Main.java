import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        try {
            System.out.println("Division of two number:" + (a / b));
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (b == 0) {
                System.out.println("Exception occur in division");
            } else {
                System.out.println("Division of two number successfully done");
            }
        }

        Voter voter = new Voter();
        try {
            voter.eligible(10);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
