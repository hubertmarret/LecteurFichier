import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public abstract class ALecteurFichier implements ILecteurFichier {
	private ArrayList<String> contenu;
	
	public boolean openAndCheck(String fileName) throws IOException {
		BufferedReader br = null;
		 
		try { 
			br = new BufferedReader(new FileReader(fileName));
			return true;
		}
		
		catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		finally {
			if (br != null) br.close();
		}
	}
	
	public void readFichier(){
		BufferedReader br = null;
		 
		try {
			
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\testing.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				contenu.add(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//if (br != null) br.close(); 
		}
	}
}
