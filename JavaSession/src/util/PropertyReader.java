package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Sameer on 8/30/2016.
 */
public class PropertyReader{

    public static Map<String ,String> getTestData(String fileName){
        Map<String ,String> testDataMap = new HashMap<String, String>();
        Properties properties;
        try {
            properties = new Properties();
            InputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/resource/"+fileName+".properties");
            properties.load(inputStream);
            for (int i=0;i<properties.keySet().size();i++) {
                testDataMap.put(properties.keySet().toArray()[i].toString(),properties.values().toArray()[i].toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return testDataMap;
    }
}
