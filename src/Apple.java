import java.util.List;

public class Apple implements NamePrintable{

    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String showName() {
        return name;
    }
}
