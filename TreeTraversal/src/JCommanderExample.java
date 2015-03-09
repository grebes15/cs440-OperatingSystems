

import com.beust.jcommander.Parameter; 

public class JCommanderExample { 


	@Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity") 

	Integer verbose = 1; 

	@Parameter(names = "-groups", description = "Comma-separated list of group names to be run") 

	String groups; 

	@Parameter (names = {"-directory","-d"}, description = "Root directory for stats")
	String root;

	@Parameter (names = {"-levels","-l"}, description = "Number of levels to traverse")
	Integer levels = 0;

	@Parameter(names = "-debug", description = "Debug mode") 


	private boolean debug = false; 


} 
