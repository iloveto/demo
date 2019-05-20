package iterator;

public class Test {
    public static void main(String[] args) {
        Container c = new Container();
        Iterator i = c.getIterator();
        while (i.hasNext()) {
            System.out.println((String)i.next());
        }
    }
}
