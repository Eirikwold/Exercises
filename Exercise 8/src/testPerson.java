public class testPerson {

    public static void main(String[] args) {
     Student student1 = new Student("Jon", "Kirkegata 24","JAVA", 2019, 5000.0);
     Student student2 = new Student("Mark", "Kirkegata 24","JAVA", 2019, 5000.0);
     Student student3 = new Student("Bruce", "Kirkegata 24","JAVA", 2019, 5000.0);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

     Staff staff1 = new Staff("Hank","Kirkegata 24", "Høyskolen Kristiania", 70000.0 );
     Staff staff2 = new Staff("Frank","Kirkegata 24", "Høyskolen Kristiania", 70000.0 );

        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
    }
}
