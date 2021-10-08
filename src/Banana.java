public class Banana implements NamePrintable{

    private String name;

    public Banana(String name) {
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
