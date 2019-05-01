public class Person {
    String name;
    String address;

    Person() {

    }

    public Person(String name, String address){
        this.address = address;
        this.name  = name;
    }

//Getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

//Setter
    public void setAddress(String address){
        this.address = address;
    }

//TO STRING METHOD

    public String toString(){
        return "name= " + name +",address= " + address;
    }

}
