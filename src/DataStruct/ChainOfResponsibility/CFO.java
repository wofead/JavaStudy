package DataStruct.ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:29
 * @Description
 * @Version 1.0
 */
public class CFO extends Manager {
    public CFO(String name) {
        super("CFO",name, 4);
    }

    @Override
    public void handlerRequest(RequestMode request) {
        if (request.level < super.level){
            if (request.type == 1 && request.count < 10){
                System.out.println(String.format("%s 批准了 %s %s,数量是%d",super.name,request.manager.name,request.name,request.count));
            }else if (request.type == 2 && request.count < 3000){
                System.out.println(String.format("%s 批准了 %s %s,数量是%d",super.name,request.manager.name,request.name,request.count));
            }
        }else{
            if (super.superior != null)
            super.superior.handlerRequest(request);
            else System.out.println(String.format("%s 驳回了 %s %s,数量是%d",super.name,request.manager.name,request.name,request.count));
        }
    }
}
