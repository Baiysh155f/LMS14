public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}'+super.toString();
    }
    String singing(){
        return "singing 'Take Me To Church' ";
    }
    String playGitar(){
        return "ggg";
    }
}
