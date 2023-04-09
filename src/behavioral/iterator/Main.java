package behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(MyIterator it = nameRepository.getMyIterator(); it.hasNext();){
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
