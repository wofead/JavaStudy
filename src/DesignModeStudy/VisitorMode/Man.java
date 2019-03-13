package DesignModeStudy.VisitorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:07
 * @Description
 * @Version 1.0
 */
public class Man extends PersonVisitor {
    @Override
    public void getConclusion(ActionVisitor actionVisitor) {
        actionVisitor.getManAction();
    }
}
