package Map;

public class Students {
    private int id;
    private String name;
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Students(int id, String name, String email, String phone){
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

}
