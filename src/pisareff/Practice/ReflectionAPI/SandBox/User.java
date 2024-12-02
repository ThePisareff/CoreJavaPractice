package pisareff.Practice.ReflectionAPI.SandBox;

public class User extends Person implements Comparable<User> {

    private String name;

    public User(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
