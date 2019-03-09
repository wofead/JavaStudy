package ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:35
 * @Description
 * @Version 1.0
 */
public class ChainEmployee extends Manager
{
    public ChainEmployee(String name) {
        super("员工",name,1);
    }

    @Override
    public void handlerRequest(RequestMode request) {

    }
}
