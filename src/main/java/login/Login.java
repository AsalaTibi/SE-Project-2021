package login;

import java.io.IOException;

import searchtest.Log;

public class Login {
private Login() {
		
	}

public static void adminlog(String username2, String password2) {
	Log myLog;
String userName = username2;
 try {
		myLog= new Log("log.txt");
		myLog.getLogger().info(userName);
		
	} catch (SecurityException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
String password =password2;
 try {
		myLog= new Log("log.txt");
		myLog.getLogger().info(password);
		
	} catch (SecurityException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}

