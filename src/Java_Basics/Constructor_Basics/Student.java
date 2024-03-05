package Java_Basics.Constructor_Basics;

public class Student {
    private int id;
    String name;
    protected double psp;
    public int age;
    int gradYear;
    Exam exam;

    Student(){
        this.id = 5;
        this.name = "Something";
        this.age = 40;
        this.exam = new Exam(40);
    }

    Student(int id , String name){
        this.id = id;
        this.name = name;
        this.exam = new Exam(30);
    }

    Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.gradYear = other.gradYear;
        // exam : ref var which is pointing to an object
//        this.exam = other.exam;

        this.exam = new Exam(other.exam);
    }


    void print(){
        System.out.println("Student : " + name + " with psp : " + psp + " and age : " + age + " and id is" + id);
    }

    void attendClass(){
        System.out.println("Attending the class!");
    }

    void setId(int x){
        if(x < 0){
            throw new RuntimeException("Id is invalid");
        }
        id = x;
    }

    int getId(){
        return id;
    }
}