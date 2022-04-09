// Fig. 4.18: DrawPanel.java
// Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Scanner;

public class DrawPanel extends JPanel
{
    // drw an X from the corners of the panel
    public void paintComponent(Graphics g)
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent( g );

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        // draw a line from the upper-left to the lower-right
        g.drawLine( 0, 0, width, height );

        // draw a line from the lower-left to the upper-right
        g.drawLine( 0, height, width, 0 );

//        int counter = 0;
//
//         while ( ++counter <= 10)
//             System.out.printf( "%d ", counter );
////             ++counter;
//
//         System.out.println();

         for ( int counter = 1; counter <= 10; counter++ )
             System.out.printf("%d ", counter );
        System.out.println();

    }// end method paintComponent
} // end class DrawPanel