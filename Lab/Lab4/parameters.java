import com.beust.jcommander.Parameters;

public class parameters{


	@Parameter (names = {"-totanConsumeNumber","--tcn"}, required = true, description = "total number of consumers")
	Integer totalConsumerNumber;
//goes through the total number of consumers
	@Parameter(names = "-debug", description = "Debug mode") 

//call whether debug mode should be turned on or off
	boolean debug = false; 



}