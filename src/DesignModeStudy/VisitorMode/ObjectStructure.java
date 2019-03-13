package DesignModeStudy.VisitorMode;

import java.util.ArrayList;

/**
 * @Author: jow
 * @Date: 2019/3/10 2:16
 * @Description
 * @Version 1.0
 */
public class ObjectStructure {
    private ArrayList<PersonVisitor> personVisitors = new ArrayList<>();
    public ObjectStructure(){}

    public void addPerson(PersonVisitor personVisitor){
        personVisitors.add(personVisitor);
    }

    public void removePerson(PersonVisitor personVisitor){
        personVisitors.remove(personVisitor);
    }

    public void displayAction(ActionVisitor actionVisitor){
        for (PersonVisitor personVisitor
        :personVisitors){
            personVisitor.getConclusion(actionVisitor);
        }
    }
}
