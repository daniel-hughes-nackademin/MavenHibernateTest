import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private String color;


    public Person(int id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.color = hairColor;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
