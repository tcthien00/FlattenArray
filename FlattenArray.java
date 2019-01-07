import java.lang.reflect.Array;

/**
 * @author thientruong
 * @version 1.0
 * tcthien@gmail.com
 * https://www.linkedin.com/in/thientruong/
 */
public class FlattenArray {

	/**
	 * This method flattens an array of arbitrarily nested arrays of integers into a flat array of integers,
	 * then prints the flattened array to the console.
	 * A clean and efficient way to do this is to recursively call this method for every item in the array.
	 * @param object
	 */
    private static void flatten(Object object) {
    	if (object==null) {
            System.out.println("Object is null!");
    		return;
    	}
    	// If object is an array, go thru all items in the array, and
    	// flatten each (as necessary when the item is another array)
    	if (object.getClass().isArray()) {
            for (int i = 0; i < Array.getLength(object); i++) {
                flatten(Array.get(object, i));//recursive call for item i
            }
        } else {//print the item (if it is NOT an array itself)
            System.out.print(object + ",");
        }
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize an array of integers
        int[][][] array = 	{
	        					{	{ 1, 2, 3, 4 },
	        						{ 5, 6, 7 },
	        						{ 8, 9 },
	        						{ 10 }
	        					},
	        					{	{ 11, 12 },
	        						{ 13, 14, 15 },
	        						{ 16, 17, 18, 19 } 
	        					},
	        					{	{ 20, 21 },
	        						{ 22, 23, 24 },
	        						{ 25, 26, 27, 28 },
	        						{ 29, 30, 31, 32, 33 }
	        					} 
        					};

        // flatten the array and print it to the console
        flatten(array);
        System.out.println();
        flatten(null);
	}

}
