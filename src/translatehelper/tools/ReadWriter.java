package translatehelper.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadWriter {
	public static String getText(String content) {
		File file = new File("/dictionary/dictionary.txt");
		System.out.println(file.getAbsolutePath());
		LineNumberReader reader;
		try {
			reader = new LineNumberReader(new FileReader(file));
			String strLine = reader.readLine();
			System.out.println(strLine);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return null;
	}
}
