/**
 * 
 */
package acadglidAssignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


/**
 * @author nikhil13686
 *
 */
public class Employee {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args) 
	{
		HashMap<Integer,String> objEmployee = new HashMap<Integer,String>(); // creating Employee objects with key value pair
		objEmployee.put(1, "Nikhil Sharma"); // Adding Members with key value mapping
		objEmployee.put(2, "Lakhvinder Singh");
		objEmployee.put(3, "Hima Bindu Pokala");
		objEmployee.put(4, "Ramya Narendran");
		objEmployee.put(5, "Atul Khandelwal");
		objEmployee.put(6, "Abhishek Garg");
		objEmployee.put(7, "Somya Prasad");
		objEmployee.put(8, "David Emery");
		objEmployee.put(9, "Manmeet Singh");
		objEmployee.put(10, "Khyati Desai");
		System.out.println("Here are the top ten Employees from Core Java Batch of ACADGLID");
		Collection<String> temp = objEmployee.values();
		for (Iterator<String> iterator = temp.iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
			
		}
	}

}
