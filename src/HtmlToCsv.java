import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public interface HtmlToCsv {
	void htmlToCsv(String htmlFile, String csvFile); //reads htmlFile and converts it to CSV and writes the CSV to csvFile
}

class HtmlToCsvClass implements HtmlToCsv {
	public void htmlToCsv(String htmlFile, String csvFile) {
		 File in = new File(htmlFile); 
		 try {
			org.jsoup.nodes.Document doc = Jsoup.parse(in, null);
			FileWriter writer = new FileWriter(csvFile);
			
			//Getting the table element rows
			Element table = doc.select("table").get(1);
			Elements rows = table.select("tr");
			
			int i = 0;
			for(Element row : rows) { 
				Elements cells = row.getElementsByTag("td");
				for (Element cell : cells) {
//					if(i++ > 0) {
						writer.write(cell.text().concat(", "));
//					}
					
	            }
				writer.write("\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
