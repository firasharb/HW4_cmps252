import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


public interface Downloader {
	void downloadHtmlToFile(String url, String file);
}

class DownloaderClass implements Downloader {

	@Override
	public void downloadHtmlToFile(String url, String file) {
		URL website;
		try {
			website = new URL("https://www-banner.aub.edu.lb/catalog/schd_" + url + ".htm");
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(file);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
