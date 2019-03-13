package DataStruct.ChainOfResponsibility;

/**
 * @Author: jow
 * @Date: 2019/3/9 22:48
 * @Description
 * @Version 1.0
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这个对象连成一条链，并且沿着这条链传递该请求，直到有一份对象
 * 处理它位置
 * 请求
 * 职位 传递
 */
public class ChainOfResponsibilityTest {
    public void test(){
        ChainEmployee employee = new ChainEmployee("Jow");
        TeamLeader teamLeader = new TeamLeader("石榴");
        ProjectManager projectManager = new ProjectManager("蔡旭");
        CFO cfo = new CFO("老孟");
        projectManager.setSuperior(cfo);
        teamLeader.setSuperior(projectManager);
        AskForLeave askForLeave = new AskForLeave();
        askForLeave.setRequester(employee);
        askForLeave.setCount(3);
        teamLeader.handlerRequest(askForLeave);
        AskForRaise askForRaise = new AskForRaise();
        askForRaise.setCount(3000);
        askForRaise.setRequester(employee);
        teamLeader.handlerRequest(askForRaise);
    }
}
