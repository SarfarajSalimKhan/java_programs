class A
{
    void validAge ( int age )
    {
	if ( age < 18 )
	{
	    throw new ArithmeticException ( "Age is not valid for admission." );
	}
	else
	{
	    System.out.println ( "Age is valid for admission." );
    	}
    } 
}

public class Main
{
    public static void main ( String args [ ] )
    {
	try
	{
	    int num = 5 / 0;
	}
	catch ( ArithmeticException e )
	{
	    System.out.println ( "Zero Division Error Exception." );
	    System.out.println ( "Exception is : " + e );
	}
	A obj = new A ( );
	obj.validAge ( 17 );
    }
}