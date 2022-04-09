public class OldInteger
{
    public static void main(String[] args)
    {
        for ( int i = 1 ; i <= 99; i += 2  )
        {
            System.out.printf( "%d ", i );
        }

        System.out.println("");

        int i = 1;

        while ( i <= 20 )
        {
            System.out.print( i );

            if ( i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++i;
        }

        for ( int j = 1; j <= 20; ++j)
        {
            System.out.print( j );

            if (j % 5 == 0)
                System.out.println();
            else
                System.out.print( '\t' );
        }
    }
}
