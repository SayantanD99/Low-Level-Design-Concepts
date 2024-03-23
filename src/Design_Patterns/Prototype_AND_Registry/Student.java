package Design_Patterns.Prototype_AND_Registry;
public class Student implements Prototype<Student>{
    int age;
    String name;
    String batch;

    private int marks;

    Student(){

    }

    Student(Student s){
        this.name = new StringBuilder(s.name).toString();
        this.batch = new StringBuilder(s.batch).toString();
        this.age = s.age;
        this.marks = s.getMarks();
    }
    public Student copy(){
//        Student s1 = new Student();
//        s1.name = new StringBuilder(this.name).toString();
//        s1.batch = new StringBuilder(this.batch).toString();
//        s1.age = this.age;
        Student s = new Student(this);
        return s;
    }

    public int getMarks() {
        return marks;
    }
}
