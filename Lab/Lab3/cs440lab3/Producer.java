public class Producer extends Thread 
{

    private CubbyHole cubbyhole;
    private int number;
    private int maxTimes;

	long startTime = System.currentTimeMillis();//show the start time


    public Producer(CubbyHole c, int number, int maxTimes) 
    {
    
	cubbyhole = c;
        this.number = number;
	this.maxTimes = maxTimes;
	
    }

    public void run() 
    {
        
	for (int i = 0; i < maxTimes; i++) 
	    {
		cubbyhole.put(number, i);
		
		try 
		    {
		    
			sleep((int)(Math.random() * 100));
		    } 
		
		catch (InterruptedException e) 
		    { e.printStackTrace(); }
	    }

	long timeSpend = System.currentTimeMillis() - startTime;

	System.out.println("Producer done.");
	System.out.println("Terminating model.");

	System.out.println("Time Spend: " + (float)(timeSpend/1000.00) + " seconds"); //display the time spend in seconds
    }
}
