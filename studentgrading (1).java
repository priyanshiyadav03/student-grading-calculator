
import java.util.Scanner;

public class studentgrading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int avg_percentage;

        // taking input from user to know the number of subjects

        System.out.print("Enter the number of subjects:");

        int subject = sc.nextInt();

        // Taking marks input of all subjects

        for (int i = 1; i <= subject; i++) {

            System.out.println("Enter the marks of subject " + 1);

            int marks = sc.nextInt();

            if (marks < 33) {

                System.out.println("You are failed in subject" + 1);
            }

            else {

                sum += marks;
            }

        }

        // To display the total marks

        System.out.println("The total marks is " + sum);

        // To calculate average percentage

        avg_percentage = sum / subject;

        // To calculate average percentage

        avg_percentage = sum / subject;

        // To display the average percentage

        System.out.println("The average percentge is" + avg_percentage);

        // To calculate grade based on average percentage

        if (avg_percentage >= 80)

        {
            System.out.println("Grade: A");
        }

        if (avg_percentage >= 60 && avg_percentage < 80) {
            System.out.println("Grade: B");

        }

        if (avg_percentage >= 45 && avg_percentage < 60) {
            System.out.println("Grade: C");
        }
        if (avg_percentage >= 33 && avg_percentage < 45) {
            System.out.println("Grade: D");

        }

        if (avg_percentage < 33) {
            System.out.println("Fail");

        }

    }

}
