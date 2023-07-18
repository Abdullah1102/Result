import java.util.Scanner;
public class Marksheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Your Standard");
        int std = sc.nextInt();

        System.out.println("Enter your English Marks");
        int eng = sc.nextInt();

        System.out.println("Enter your Hindi Marks");
        int hin = sc.nextInt();

        System.out.println("Enter your Marathi Marks");
        int mar = sc.nextInt();

        System.out.println("Enter your Maths Marks");
        int mat = sc.nextInt();

        System.out.println("Enter your Science Marks");
        int sci = sc.nextInt();

        float sum = (eng + hin + mar + mat + sci)*100.0f/500.0f;

        System.out.println( name + " Your Percenatge is " + sum);

    }

}
