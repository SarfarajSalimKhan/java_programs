class A
{
    static int a;
    A ( )
    {
	a = 0;
    }
    A ( int num )
    {
        a = num;
    }
    static int methodA ( )
    {
	return a;
    }
}

class B extends A
{
    static int b;
    B ( )
    {
	b = 0;
    }
    B ( int num )
    {
        b = num;
    }
    static int methodB ( )
    {
	return b;
    }
}

class C extends A
{
    int c;
    C ( )
    {
        c = 0;
    }
    C ( int num )
    {
	c = num;
    }
    int methodC ( )
    {
	return c;
    }
}

class D extends B
{
    int d;
    D ( )
    {
	d = 0;
    }
    D ( int num )
    {
	d = num;
    }
    int methodD ( )
    {
	return d;
    }
    public static void main ( String args [ ] )
    {
        D d = new D ( 20 );
	System.out.println ( "Value of variable d: " + d.methodD ( ) );
	System.out.println ( "Value of variable b: " + d.methodB ( ) );
	C c = new C ( 30 );
	System.out.println ( "Value of variable c: " + c.methodC ( ) );
	System.out.println ( "Value of variable a: " + d.methodA ( ) );
    }
}