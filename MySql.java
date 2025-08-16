package week4.day1;

public class MySql extends MySqlConnection {
@Override	
public void executeQuery()
{
	System.out.println("Success");
}
public void executeUpdate()
{
	super.executeUpdate();
	System.out.println("executed and updated succesfully");
}
	public static void main(String[] args) {
		MySql options=new MySql();
		options.executeQuery();
		options.executeUpdate();

	}

}
