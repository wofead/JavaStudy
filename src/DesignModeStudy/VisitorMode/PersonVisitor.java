package DesignModeStudy.VisitorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:03
 * @Description
 * @Version 1.0
 */
public abstract class PersonVisitor {
    public abstract void getConclusion(ActionVisitor actionVisitor);
}
