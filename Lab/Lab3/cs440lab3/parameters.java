
import com.beust.jcommander.Parameter; 

public class parameters { 

	@Parameter (names = {"-totalDataItemsNumber","--tdin"}, required = true, description = "Toal number of data items going to be called")
	Integer totalDataItemsNumber;
//goes through the total number of data items
	@Parameter (names = {"-totanConsumeNumber","--tcn"}, required = true, description = "total number of consumers")
	Integer totalConsumerNumber;
//goes through the total number of consumers
	@Parameter(names = "-debug", description = "Debug mode") 


	boolean debug = false; 


} 
