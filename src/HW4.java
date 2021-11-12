import java.time.LocalDate;
import java.time.LocalTime;

public class HW4 {

	public static void main(String[] args) {
		var t1 = LocalTime.parse("14:52");
		var d = LocalDate.parse("1999-01-22");
		
		System.out.println(t1);
		Downloader d1 = new DownloaderClass();
		d1.downloadHtmlToFile("C", "C.htm");
		
		HtmlToCsvClass c = new HtmlToCsvClass();
		c.htmlToCsv("C.htm", "C.csv");
	}
}