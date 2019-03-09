package ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:24
 * @Description
 * @Version 1.0
 */
public class TeamLeader extends Manager{
    public TeamLeader(String name){
        super("组长",name, 2);
    }
    @Override
    public void handlerRequest(RequestMode request) {
        if (request.level < super.level){
            if (request.type == 1 && request.count < 4){
                System.out.println(String.format("%s 批准了 %s %s,数量是%d",super.name,request.manager.name,request.name,request.count));
            }
        }else{
            super.superior.handlerRequest(request);
        }
    }
}
