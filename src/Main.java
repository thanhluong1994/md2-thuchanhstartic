public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"Nam");
        Student s2 = new Student(2,"Long");
        Student s3 = new Student(3,"Quan");
        s1.display();
        s2.display();
        s3.display();
    }
}
