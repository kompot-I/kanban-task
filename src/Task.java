public class Task {
    private int id;
    protected String name;
    protected String description;
    private TypeTask status;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
        
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeTask getStatus() {
        return status;
    }

    public void setStatus(TypeTask status) {
        this.status = status;
    }
}
