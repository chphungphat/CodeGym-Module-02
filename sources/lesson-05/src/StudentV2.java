public class StudentV2 {
    private String name;
    private String classes;

    public StudentV2() {
        this.name = "John";
        this.classes = "C02";
    }

    public StudentV2(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
