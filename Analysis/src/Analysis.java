// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
import java.util.Scanner;

public class Analysis
{
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );

        // initializing variable in declaration
        int passes = 0,
                failures = 0,
                studentCounter = 1;
        int result;

        // process 10 student using counter controlled loop
        while ( studentCounter <= 10 )
        {
            // prompt user to enter next result
            System.out.print( "Enter result ( 1 = passed, 2 = failed): " );
            result = input.nextInt();

            // if...else is nested in while statement
            if ( result ==1 )               // if result 1,
                passes = passes + 1;        // increment passes;
            else                            // else result is not 1, so
                failures = failures + 1;    // increment failures

            // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        } // end while

        // termination phase; prepare and display results
        System.out.printf( "passed: %d\nFailed: %d\n", passes, failures );

        // determine if more than eight student passed
        if ( passes > 8)
            System.out.println( "Bonus to instructor!" );
    } // end method main
} // end class Analysis
