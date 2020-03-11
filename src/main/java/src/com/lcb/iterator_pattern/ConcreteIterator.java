package src.com.lcb.iterator_pattern;

public class ConcreteIterator implements Iterator {
	
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
      
        this.list = list;
    }

    @Override
    public boolean hasNext() {
    	
        if (index >= list.getSize()) {
        	
            return false;
            
        } else {
        	
            return true;
        }
    }

    @Override
    public Object next() {
    	
        Object object = list.get(index);
        index++;
        return object;
    }

}