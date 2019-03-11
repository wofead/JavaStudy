package VisitorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:22
 * @Description
 * @Version 1.0
 */
public class VisitorTest {
    public void test(){
        ObjectStructure objects = new ObjectStructure();
        Man man = new Man();
        Women women = new Women();
        objects.addPerson(man);
        objects.addPerson(women);
        FailAction failAction = new FailAction();
        objects.displayAction(failAction);
        SuccessAction sucAction = new SuccessAction();
        objects.displayAction(sucAction);
        LovaAction loveAction = new LovaAction();
        objects.displayAction(loveAction);
    }

}
