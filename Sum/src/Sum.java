// Fig. 5.5: Sum.java
// Summing integers with the for statement.

public class Sum
{
    public static void main(String[] args)
    {
        int total = 0; // initialize total

        // total even integers from 2 through 20
        for ( int number = 2; number <= 20; total += number, number += 2 )
            ; // empty statement
            System.out.printf( "Sum is %d\n", total); // display results
    } // end main
} // end Class Sum
