public class Staff extends Person {
    String school;
    double pay;

    public Staff(){

    }
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //GETTERS

    public String getSchool(){
        return school;
    }
    public double getPay(){
        return pay;
    }

    //SETTERS

    public void setSchool(String school){
        this.school = school;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    public String toString(){
        return "Staff["+super.toString()+",school="+this.school+"pay="+this.pay+"]";
    }
}
