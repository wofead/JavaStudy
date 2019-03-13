package DataStruct.ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:29
 * @Description
 * @Version 1.0
 */
public class ProjectManager extends Manager {
    public ProjectManager(String name) {
        super("项目经理", name,3);
    }

    @Override
    public void handlerRequest(RequestMode request) {
        if (request.level < super.level){
            if (request.type == 1 && request.count < 8){
                System.out.println(String.format("%s 批准了 %s %s,数量是%d",super.name,request.manager.name,request.name,request.count));
            }
        }else{
            super.superior.handlerRequest(request);
        }
    }
}
