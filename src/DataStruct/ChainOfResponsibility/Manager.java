package DataStruct.ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:14
 * @Description
 * @Version 1.0
 */
public abstract class Manager {
    public String name;
    public String postName;
    public Manager superior;
    public int level;
    public Manager(String postName,String name,int level){
        this.name = name;
        this.name = postName;
        this.level = level;
    }
    public void setSuperior(Manager manager){
        this.superior = manager;
    }
    public abstract void handlerRequest(RequestMode request);
}
