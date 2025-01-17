//Creating the Nullpointer to demonstrate the null pointer exception 
public class NullPointer{

	public static void demostrateException(String str){
		// Generate a NullPointerException
        try {
            System.out.println("The length of the string is: " + getLength(str));
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object. " + e.getMessage());
        }
		
	}
    public static void main(String[] args){
        String str = null; // A string variable is declared but not initialized
        
		demostrateException(str); 
    }

    // Method to get the length of a string
    public static int getLength(String str){
        // This will throw NullPointerException if str is null
        return str.length();
    }
}