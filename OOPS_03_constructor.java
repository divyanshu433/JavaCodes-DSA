public class OOPS_03_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called....");
    }
}