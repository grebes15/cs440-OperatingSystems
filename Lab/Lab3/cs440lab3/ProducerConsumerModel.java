import java.io.*;
import java.io.File;
import com.beust.jcommander.JCommander;


public class ProducerConsumerModel
{

    // NOTE: you must implement the command line processing for 
    // this class.  Currently, all variables are hard coded to 
    // some default values.

    // command line arguments : 
    // [ debug? ] [ number data items ] [ number of consumers ]

    public static void main(String[] args)
    {

        parameters param = new parameters();
        //call the parameters file
        new JCommander(param, args);
        //call the JCommander the parse the command line




        // the debugging flag which will determine whether
        // or not we produce output when running experiment
        boolean debugOutput = param.debug;//true;

        // the maximum number of consumers inside our model
        
        int totalConsumerNumber = param.totalConsumerNumber; //set the totalConsumeNumber equal to the parameter being called to use jcommander

        // the number of data items that we should produce
        // and consume in this execution of the model
        
        int totalDataItemsNumber = param.totalDataItemsNumber;//set the totalDataItemsNumber equal to the parameter being called to use jcommander

        // create a CubbyHole that both the Producer and 
        // and the Consumer will use to store data items
        
        CubbyHole cubbyHole = new CubbyHole(debugOutput);

        // create the only producer as a single thread and
        // then get it started on producing numbers
        Producer producer = 
            new Producer(cubbyHole, 1, totalDataItemsNumber);
        producer.start();

        // this is the single Consumer variable that we will
        // use to start each of the Consumer threads
        Consumer consumerSource;

        // create all of the different consumer threads
        for(int i = 0; i < totalConsumerNumber; i++)
        {

            consumerSource = new Consumer(cubbyHole, i);
            consumerSource.start();

        }

        // wait for the producer to finish and then terminate
        // the process (note: this would not always work if the 
        // Consumer threads had "tasks" that took a long time 
        // to complete)

        try
        {

            producer.join();
            System.exit(1);

        }

        catch(InterruptedException e)
        {

            e.printStackTrace();

        }

    }

}
