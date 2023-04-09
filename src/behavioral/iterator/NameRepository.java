package behavioral.iterator;

public class NameRepository {

    private String[] names = { "Wanderson", "Alex", "Stephany", "Carol"};

    public MyIterator getMyIterator(){
        return new NameIterator(names);
    }

}
