package DesignModeStudy.FlyWeight;

/**
 * @Author: jow
 * @Date: 2019/3/10 1:14
 * @Description
 * @Version 1.0
 */
public class FlyweightTest {
    public void test(){
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website fx = websiteFactory.getWebSite("博客");
        fx.use(new UserWebsite("Jow"));
        Website fq = websiteFactory.getWebSite("搜索");
        fx.use(new UserWebsite("Penny"));
        Website fw = websiteFactory.getWebSite("博客");
        fx.use(new UserWebsite("Pony"));
        Website fr = websiteFactory.getWebSite("博客");
        fx.use(new UserWebsite("Honey"));
        Website ft = websiteFactory.getWebSite("搜索");
        fx.use(new UserWebsite("Jax"));
        websiteFactory.getWebsiteCount();

    }
}
