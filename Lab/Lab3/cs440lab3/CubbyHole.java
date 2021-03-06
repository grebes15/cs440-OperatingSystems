public class CubbyHole 
{
    private int contents;
    private boolean available = false;
    private boolean debug = true;

    public CubbyHole(boolean debugOutput)
    {

	debug = debugOutput;

    }

    public synchronized int get(int who) 
    // public int get(int who) 
    {
    
	while ( available == false ) 
	{
		try 
		    {
			wait();
		    } 

		catch (InterruptedException e) 
		    { e.printStackTrace(); }

	}
       
	available = false;

	if( debug )
	    {
		
		System.out.println("Consumer " + who + " got: " + contents);
        
	    }
//all threads are being notified with the notifyall method
	notifyAll();
        return contents;
    
    }

    public synchronized void put(int who, int value) 
			    //public void put(int who, int value) 
    {
    	
        while (available == true) 
  	    {
		try 
		    {
		
			wait();
		    
		    } 

		catch (InterruptedException e) 
		    { e.printStackTrace(); }
	    }
        
	contents = value;
        available = true;

	if( debug )
	    {

		System.out.println("Producer " + who + " put: " + contents);

	    }

        notifyAll();
    
    }

}
