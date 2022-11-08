public abstract class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    void learn(){
        System.out.println("Learn in java");
    }
    void walk(){
        System.out.println("na course"+("java"));
    }
    void eat(){
        System.out.println("sfsfdsf");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
