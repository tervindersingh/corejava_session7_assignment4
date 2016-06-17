public class StringIndexExceptionExample {

    	public static void main(String[] args) 
	{
		try
		{
	        String str = "India is the great country";
	        System.out.println("Length: " + str.length());
		char ch = str.charAt(50);
		System.out.println(ch);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("You have tried to access character at the location which is not existed in the string");
		}
		finally
		{
			System.out.println("please enter write value");
		}
    	}

}
