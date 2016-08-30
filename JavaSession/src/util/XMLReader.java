package util;
import java.io.File;
import java.util.Hashtable;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XMLReader {

    public static Map<String, String> getObjectRepo(String fileName){

        Map<String,String> objectMap = new Hashtable<String,String>();
        // read xml
        try {
            File fXmlFile = new File(System.getProperty("user.dir")+"/objectRepo/"+fileName+".xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            NodeList nodeList =doc.getElementsByTagName("element");
            for (int i=0;i<nodeList.getLength();i++){
                Element ele=(Element) nodeList.item(i);
                objectMap.put(ele.getAttribute("name"),ele.getAttribute("locatorType")+"_TBR_"+ele.getAttribute("locatorValue"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return objectMap;
    }
}
