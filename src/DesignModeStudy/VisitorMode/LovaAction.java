package DesignModeStudy.VisitorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:13
 * @Description
 * @Version 1.0
 */
public class LovaAction extends ActionVisitor {
    @Override
    public void getManAction() {
        System.out.println("男人恋爱");
    }

    @Override
    public void getWomenAction() {
        System.out.println("女人恋爱");

    }
}
