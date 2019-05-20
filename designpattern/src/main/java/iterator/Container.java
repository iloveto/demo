package iterator;

public class Container {
    private String[] array = {"Jack", "Tom", "Lucy", "Lily", "LiLei", "HanMei"};

    private class MyItetor implements Iterator{
        int i = 0;
        @Override
        public boolean hasNext() {
            if (i > array.length - 1) {
                return false;
            }else {
                return true;
            }

        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return array[i++];
            }
            return null;
        }
    }

    public Iterator getIterator() {
        return new MyItetor();
    }
}
