package IterationMode;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends AggregateMode {
    private List<Object> items = new ArrayList<>();
    @Override
    public IteratorMode CreateIterator() {
        return new ConcreteIterator(this);
    }
    public int count(){
        return items.size();
    }

    public Object getItems(int index) {
        return items.get(index);
    }

    public void setItems(Object value){
        items.add(value);
    }
}
