package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jow
 * @Date: 2019/3/10 1:06
 * @Description
 * @Version 1.0
 */
public class WebsiteFactory {
    private HashMap<String,Website> websiteMap = new HashMap<String, Website>();
    public Website getWebSite(String key){
        if (!websiteMap.containsKey(key)){
            websiteMap.put(key,new Website(key));
        }
        return websiteMap.get(key);
    }
    public int getWebsiteCount(){
        return websiteMap.size();
    }

}
