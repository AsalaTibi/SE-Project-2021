package login;

import java.io.IOException;

import searchtest.Log;

public class Login {
private Login() {
		
	}

public static void adminlog(String username2, String password2) {
	Log my_log;
String userName = username2;
 try {
		my_log= new Log("log.txt");
		my_log.logger.info(userName);
		
	} catch (SecurityException e) {
		
	} catch (IOException e) {
		
	}
String password =password2;
 try {
		my_log= new Log("log.txt");
		my_log.logger.info(password);
		
	} catch (SecurityException e) {
		
	} catch (IOException e) {
		
	}

}
}

