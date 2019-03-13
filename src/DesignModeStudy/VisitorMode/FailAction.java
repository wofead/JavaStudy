package DesignModeStudy.VisitorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:13
 * @Description
 * @Version 1.0
 */
public class FailAction extends ActionVisitor {
    @Override
    public void getManAction() {
        System.out.println("男人失败");
    }

    @Override
    public void getWomenAction() {
        System.out.println("女人失败");

    }
}
