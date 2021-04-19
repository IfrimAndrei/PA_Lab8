package SQL;

public class Directors {
    private int id;
    private String name;

    @Override
    public String toString( ) {
        return "Directors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId( ) {
        return id;
    }

    public String getName( ) {
        return name;
    }
}
