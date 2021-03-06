public class Student extends Person {
    String program;
    int year;
    double fee;

    public Student() {

    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    //GETTERS
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    //SETTERS

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // To STRING OVERRIDE

    public String toString(){
        return super.toString()+",program= "+this.program+",year= "+this.year+",fee= "+this.fee;
    }
}