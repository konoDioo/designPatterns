package td2ex3;

public class TestSignleton 
{
	public static void main(String args[])
		{
			Database database;
			database = Database.getInstance("products");
			System.out.println("This is the " +
			database.getName() + " database.");
			database = Database.getInstance("employees");
			System.out.println("This is the " +
			database.getName() + " database.");
		}
}
