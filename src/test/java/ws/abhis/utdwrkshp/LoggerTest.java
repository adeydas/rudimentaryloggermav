package ws.abhis.utdwrkshp;

import ws.abhis.utdwrkshp.desc.LoggingFlags;
import ws.abhis.utdwrkshp.desc.LoggingLevel;
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
		Logger objLogger = new Logger("testLog.dat", LoggingLevel.DEVELOPMENT);
		String ret = objLogger.log("This is a test log message", LoggingFlags.INFO);
		assertTrue(ret.equals("Success"));
	}
}
