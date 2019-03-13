package DataStruct.ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:17
 * @Description
 * @Version 1.0
 */
public class RequestMode {
    public String name;
    public int level;
    public int count;
    public int type;
    public Manager manager;
    public RequestMode(String name, int level,int type){
        this.level = level;
        this.name = name;
        this.type = type;
    }
    public void setCount(int count){
        this.count = count;
    }

    public void setRequester(Manager manager){
        this.manager = manager;
    }
}
