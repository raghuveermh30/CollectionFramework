package javasessions;

import com.google.gson.JsonObject;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class GenPactTest {

    public static void main(String[] args) throws IOException {

        /*WebDriver driver = new ChromeDriver();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
       File src= screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("PAth"));
        */

        String str = "Raghuveer attending the interview";
        String names = str.replaceAll(" ", "");
        char[] chars = names.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char name : chars) {

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        String value = "";

        Set<String> set = new HashSet<String>();
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character key = it.next();
            value = map.get(key).toString();
            //System.out.println(key + " " +value);
            set.add(value);
        }

        ArrayList<String> al = new ArrayList<String>(set);
        Collections.sort(al);
        //  System.out.println(al);

        String val1 = al.get(al.size() - 2);
        //    System.out.println("Second Highes value " +val1);
        Iterator<Character> it2 = map.keySet().iterator();
           }
}
