// Fig 3.7: GradeBook.java
// GradeBook class that contains a courseName instance variable
// and methods to set and get its value.

import java.util.Scanner; // program uses class Scanner

public class GradeBook
{
    private String courseName; // (instance variable) course name for this GradeBo

    // constructor initializes courseName with String argument
    public GradeBook( String name )
    {
        courseName = name;// initializes courseName
    } // end constructor

    // method to set the course name
    public void setCourseName( String name )
    {
        courseName = name; //store the course name
    }// end method setCourseName

    // method to retrieve the course name
    public String getCourseName()
    {
        return  courseName;
    } // end method getCourseNam

    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
        // getCourseName to get the name of the course
        System.out.printf( "Welcome to the Grade Book for \n%s!\n\n",
                getCourseName() );
    } // end method displayMessage

    public void determineClassAverage()
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in);

        int total, // sum of grades entered by user
                gradeCounter, // number of grade to be entered next
                grade; // grade value entered by user
                double average; // average of grades

        // initializing phase
        total = 0; // initialize total
        gradeCounter = 0; // initialize loop counter

        // processing phase
        // prompt for input and read grade from user
        System.out.print( "Enter first grade: " );
        grade = input.nextInt();


        while ( grade != -1 ) // loop 10 times
        {
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter by 1

            // prompt for input and read next grade from user
            System.out.print( "Enter next grade or -1 to quit: " );
            grade = input.nextInt();
        } // end while

        //termination phase
        if ( gradeCounter != 0 )
        {
            // calculate average of all grades entered
            average = (double) total / gradeCounter;

            // display total and average (with two digits of precision)
            System.out.printf( "\nTotal of the %d grades entered is %d\n",
                    gradeCounter, total );
            System.out.printf( "Class average is %.2f\n", average );
        } // end if
        else // no grades were entered, so output appropriate message
            System.out.print( "No grades were entered" );
    }// end method determineClassAverage
} // end class GradeBook


