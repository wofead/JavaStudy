package DesignModeStudy.IterationMode;

public class ConcreteIterator extends IteratorMode {
    private ConcreteAggregate aggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
    }
    @Override
    public Object first() {
        return aggregate.getItems(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current ++;
        if (current < aggregate.count()){
            ret = aggregate.getItems(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
