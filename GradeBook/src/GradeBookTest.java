// Fig 3.2: GradeBookTest.java
// Creating a GradeBook object and calling its displayMessage method.
import java.util.Scanner;

public class GradeBookTest
{
    // main method begin program execution
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command window
//        Scanner input = new Scanner( System.in );
//      java.util.Scanner input = new java.util.Scanner( System.in );  //means the same as line 3 & 11

        // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook( "CS101 Introduction to Java Programming");
/*
      // display initial value of courseName
        System.out.printf( "gradeBook1 course name is: %s\nInstructor's name: %s\n",
                gradeBook1.getCourseName() );
        System.out.println();
        // prompt for and input course name
        System.out.println( "Please enter the course name: " );
        String theName = input.nextLine(); // read a line of text
*/
        myGradeBook.displayMessage(); // set the course name
        myGradeBook.determineClassAverage(); // find average of 10 grades
    } // end method main
} // end class GradeBookTest
