package ws.abhis.utdwrkshp;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Logger {
	private String path;
	private int loggingLevel;
	
	public Logger(String path, int loggingLevel) {
		this.path = path;
		this.loggingLevel = loggingLevel;
	}
	
	public String log (String logMessage, int loggingFlag) {
		WriteFile objWriteFile = new WriteFile();
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	
    	if(this.loggingLevel == 1) {
    		//development
    		logMessage = sdf.format(cal.getTime()).toString() + " " + logMessage + "\n\n";
    		try {
    			objWriteFile.writeToFile(this.path, logMessage);
    		} catch (Exception e) {
    			return e.getMessage();
    		}
    	} else if (this.loggingLevel == 2) {
    		//production
    		if(loggingFlag != 1) {
    			logMessage = sdf.format(cal.getTime()).toString() + " " + logMessage + "\n\n";
    			try {
    				objWriteFile.writeToFile(this.path, logMessage);
    			} catch (Exception e) {
    				return e.getMessage();
    			}
    		}
    	}
		return "Success";
	}
}
