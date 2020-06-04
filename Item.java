public class Item {

    private String id, name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
