
import java.io.PrintWriter;
import com.vladium.utils.IObjectProfileNode;
import com.vladium.utils.ObjectProfileFilters;
import com.vladium.utils.ObjectProfileVisitors;
import com.vladium.utils.ObjectProfiler;

/*
Andreas Landgrebe
March 29, 2014
Laboratory assignment #6
In order to implement this properly, one needs to set their classpath to the jar file that is being asked for the laboratorty assignment
*/

//These are the import statements to properly use the jar file to see the size of the primitive data types that have been declared
public class UseSizeOf{

	public static void main (String [] args){

		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0.0;
		boolean b = true;
		char c = 0;
		//This are all of the data types that are being used to see the size in bytes and bits.

		int[] xArray = new int[0]; //advanced feature I decided to show the size of the Integer array

		String[] sArray = {"StringArray"}; //advanced feature I decided to show the size of the String array


		IObjectProfileNode profile = ObjectProfiler.profile(s); //profile size method for the short primitive data type
        System.out.println("The Short data type size is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        profile = ObjectProfiler.profile(i); //profile size method for the integer primitive data type
        System.out.println("The Integer data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        profile = ObjectProfiler.profile(l); //profile size method for the long primitive data type
        System.out.println("The Long data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

		profile = ObjectProfiler.profile(f); //profile size method for the float primitive data type
        System.out.println("The Float data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        profile = ObjectProfiler.profile(d); //profile size method for the double primitive data type
        System.out.println("The Double data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        profile = ObjectProfiler.profile(b); //profile size method for the boolean primitive data type
        System.out.println("The Boolean data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        profile = ObjectProfiler.profile(c); //profile size method for the char primitive data type
        System.out.println("The Char data type is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");


        //This is the advanced feature I decided to do by showing the size of the interger array with 1 index
        profile = ObjectProfiler.profile(xArray);
        System.out.println("The size of the Integer array is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");

        //This is another advanced feature I decided to do by showing the size of the String array that is declared
        profile = ObjectProfiler.profile(sArray);
        System.out.println("The size of the String array is " + profile.size() + " bytes and " + profile.size() * 8 + " bits");





	}
}