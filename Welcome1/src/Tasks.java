import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );


        int c;
        /*
         thisIsVariable,
          q76354,
          number;
        */

        System.out.print( "Enter an integer: " ); // prompt
        c = input.nextInt();

        if ( c != 7)
            System.out.print( "The variable number is not equal to 7\n" );

        System.out.println( "This is a Java program" );

        System.out.println( "This is a Java\nprogram" );

        System.out.printf( "%s\n%s\n", "This is a java", "program" );

        // Calculate the product of three integers
        int x,
                y,
                z,
                result;

        System.out.print( "Enter the first integer: " ); // prompt
        x = input.nextInt();

        System.out.print( "Enter the second integer: " ); // prompt
        y= input.nextInt();

        System.out.print( "Enter the third integer: " ); // prompt
        z = input.nextInt();

        result = x * y * z;

        System.out.printf( "Product is %d\n", result );


//        System.out.println( "*\n**\n***\n****\n*****" );

//        System.out.println("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("**");

//        System.out.print( "*" );
//        System.out.println( "***" );
//        System.out.println( "*****" );
//        System.out.print( "****" );
//        System.out.println( "**" );

        System.out.printf( "%s\n%s\n%s\n", "*", "***", "*****" );
    }

}
