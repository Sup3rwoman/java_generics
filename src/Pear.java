public class Pear implements NamePrintable{

    private String name;

    public Pear(String name) {
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
