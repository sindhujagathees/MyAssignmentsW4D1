package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection {
	public void connect()
	{
		System.out.println("Connected");
	}
	public void disconnect()
	{
		System.out.println("Disconnected");
		
	}
	public void executeUpdate()
	{
		System.out.println("Executed and updated");
	}
	

	public abstract void executeQuery();

	}


