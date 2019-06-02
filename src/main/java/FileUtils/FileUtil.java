package FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static File readFile(String filePath) {
		File file = null;
		if(!StringUtil.isEmpty(filePath)) {			
			file = new File(filePath);			
		}	
		return file;
	}
	
public static String[] readFileContent(File file) {
	
	List<String> list = new ArrayList<String>();
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		 String line = null;
		   while ((line = br.readLine()) != null) {
			   list.add(line);
		   }
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	String[] listArr = new String[list.size()];
	 return  list.toArray(listArr);
	
}
	
	
	
	
}
