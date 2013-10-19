package ws.abhis.utdwrkshp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public void writeToFile (String path, String text) throws IOException {
		File file = new File (path);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter (file.getName(),true);
		BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
		bufferedWriter.write(text);
		bufferedWriter.close();
	}
}
