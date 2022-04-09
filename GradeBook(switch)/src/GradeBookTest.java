// Fig 3.2: GradeBookTest.java
// Creating a GradeBook object and calling its displayMessage method.

public class GradeBookTest
{
    // main method begin program execution
    public static void main(String[] args)
    {
        // create GradeBook object myGradeBook and
        // pass course name to constructor
        GradeBook myGradeBook = new GradeBook( "CS101 Introduction to Java Programming");

        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.inputGrades(); // read grades from user
        myGradeBook.displayGradeReport(); // display report based on grades
    } // end method main
} // end class GradeBookTest
