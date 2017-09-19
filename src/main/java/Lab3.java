import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *  Counts number of words on a webpage.
 */
public class Lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
/**
 * Prints out words from the URL.
 * @param args get the URL
 */
    public static void main(final String[] args) {
        String rawText = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] spaces = rawText.split(" ");
        String numberOfSpaces = spaces[100];
        System.out.println(numberOfSpaces);
    }

}
