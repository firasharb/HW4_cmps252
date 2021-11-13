import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class HW4 {

	public static void main(String[] args) {
		var t1 = LocalTime.parse("14:52");
		var d = LocalDate.parse("1999-01-22");
		
		System.out.println(t1);
		
		boolean check = new File("./", "A.htm").exists();
		if(!check) { 
			for(int i = 0; i < 26; i++) { 
				char letter = (char) (65 + i);
				Downloader d1 = new DownloaderClass();
				d1.downloadHtmlToFile(letter + "", letter + ".htm");
				
				HtmlToCsv c = new HtmlToCsvClass();
				c.htmlToCsv(letter + ".htm", letter + ".csv");
			}
		}
		else { 
			System.out.println("File already exists!");
			
			LocalTime t = LocalTime.of(18, 00);
			System.out.print(t);
		}
	}
}