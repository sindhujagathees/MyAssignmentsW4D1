package week4.day1;

public class JavaConnection implements DatabaseConnection {
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
	

	public static void main(String[] args) {
		JavaConnection options=new JavaConnection();
		options.connect();
		options.disconnect();
		options.executeUpdate();

	}

}
