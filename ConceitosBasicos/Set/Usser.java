package Set;

import java.util.Objects;

public class Usser {
    private int id;

    private String name;


    public Usser() {}


    public Usser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override 
    public String toString() {
        return String.format("{'id': %s, 'name:' %s}", id, name);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Usser user)) return false;
        return this.id == user.getId() && Objects.equals(this.name, user.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

}
