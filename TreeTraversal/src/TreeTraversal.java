
import java.io.* ;
import com.beust.jcommander.*;
public class TreeTraversal {

	long noOfFiles;
	long noOfDirectories;
	long sizeOfFiles;
	long minimumSize = 0;
	long maximumSize = 0;
	int maxNoOfLevels;
	int currentLevel = 0;
	
	
	  public void traverse( File file )
	   {
	      if (file.isFile())
	      {
	    	  noOfFiles++;
	    	  sizeOfFiles += file.length();	
	    	  if (minimumSize==0) minimumSize = file.length();	   
	    	  if (file.length()>maximumSize) maximumSize = file.length();
	    	  if (file.length()<minimumSize) minimumSize = file.length();	      }

	      // Check if it is a directory
	      if( file.isDirectory() )
	      {
	    	  noOfDirectories++;
	    	  System.out.println(file.getAbsolutePath()+":"+currentLevel + "/"+ maxNoOfLevels);
	         // Get a list of all the entries in the directory
	         String entries[] = file.list() ;

	         // Ensure that the list is not null
	         if( (entries != null) && (currentLevel<maxNoOfLevels))
	         {
	        	 currentLevel++;
	            // Loop over all the entries in the directory
	            for( String entry : entries )
	            {
	               // Recursive call to traverse
	               traverse( new File(file,entry) ) ;
	            }
		         currentLevel--;
	         }


	      }
	   }


	/**
	 * @param args
	 */
	public static void main(String[] args) {

JCommanderExample jct = new JCommanderExample(); 
new JCommander(jct, args); 

System.out.println("Root " +jct.root); 

TreeTraversal tt = new TreeTraversal();
long startTime = System.currentTimeMillis();
File rootDirectory = new File(jct.root);
if (jct.levels==0){
	tt.maxNoOfLevels = Integer.MAX_VALUE;
} else {
	tt.maxNoOfLevels = jct.levels;
}
tt.traverse(rootDirectory);

long estimatedTime = System.currentTimeMillis() - startTime;
System.out.println("("+tt.sizeOfFiles+"/" +tt.noOfFiles+")" ) ;

System.out.println("Analysis of Directory:   " +rootDirectory.getAbsolutePath()); 
System.out.println("Number of Files:   " +tt.noOfFiles); 
System.out.println("Number of Directories: " +tt.noOfDirectories); 
System.out.println("Average File Size: " +(float) tt.sizeOfFiles/tt.noOfFiles+" Bytes"); 
System.out.println("Minimum File Size: " +tt.minimumSize+" Bytes"); 
System.out.println("Maximum File Size: " +tt.maximumSize+" Bytes"); 
System.out.println("Time spend " +(float) estimatedTime/1000+" Sec."); 

	}

}
