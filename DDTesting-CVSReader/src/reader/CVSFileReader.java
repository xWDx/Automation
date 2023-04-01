package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class CVSFileReader {
	
	public ArrayList<String> getData() throws Exception {
		ArrayList<String> dataRead = new ArrayList<String>();
		File archivo = new File("src/ejemplo-uno.csv");
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String st;
		
		while((st=br.readLine())!= null) dataRead.add(st);
		return dataRead;
		
	}

}
