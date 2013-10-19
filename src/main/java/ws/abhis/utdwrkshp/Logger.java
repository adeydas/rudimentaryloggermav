package ws.abhis.utdwrkshp;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Logger {
private String path;
	
	public Logger(String path) {
		this.path = path;
	}
	
	public String log (String logMessage) {
		WriteFile objWriteFile = new WriteFile();
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	
    	logMessage = sdf.format(cal.getTime()).toString() + " " + logMessage + "\n\n";
    	
		try {
			objWriteFile.writeToFile(this.path, logMessage);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Success";
	}
}
