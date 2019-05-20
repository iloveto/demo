package list.removeDuplicate;

public class People {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object var1) {
        People a = (People) var1;
        return this.name.equals(a.name)&&this.id==a.id;
    }

    @Override
    public int hashCode(){
        String str = id+name;
        return str.hashCode();
    }
}
