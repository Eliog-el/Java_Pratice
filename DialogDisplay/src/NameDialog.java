// Fig. 3.18: NameDialog.java
// Basic input with a dialog box.

import javax.swing.*;

public class NameDialog
{
    public static void main( String[] args )
    {
        // prompt user to enter name
        String name = JOptionPane.showInputDialog( "What is your name?" );

        // create the message
        String message = String.format( "Welcome, %s, to Java Programing!", name );

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog( null, message );
    } // end method main
} // end class NameDialog
