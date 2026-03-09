public class OOPS_03_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Divyanshu";
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called....");
    }
}