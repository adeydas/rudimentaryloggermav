package ws.abhis.utdwrkshp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoggerTest extends TestCase {
	public LoggerTest (String testName) {
		super (testName);
	}
	
	public static Test suite() {
		return new TestSuite(LoggerTest.class);
	}
	
	public void testLogging() {
		Logger objLogger = new Logger("testLog.dat");
		String ret = objLogger.log("This is a test log message");
		assertTrue(ret.equals("Success"));
	}
}
