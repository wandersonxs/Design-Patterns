package behavioral.iterator;

public class NameIterator implements MyIterator{

    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return  names[index++];
        }
        return null;
    }
}
