package Design_Patterns.Prototype_AND_Registry;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Santa";
        s1.batch = "March23";
        s1.age = 25;

        Student s2 = s1.copy();

        System.out.println("Debug");

        IntelligentStudent i1 = new IntelligentStudent();
        i1.name = "Santa Klaus";
        i1.batch = "May23";
        i1.age = 26;
        i1.psp = 100;

        IntelligentStudent i2 = i1.copy();

        System.out.println("Debug");

        StudentRegistry sr = new StudentRegistry();
        fillRegistry(sr);
        Student s3 = sr.getStudent("Student");
        s3.age = 30;
        Student s4 = s3.copy();

        System.out.println("Debug");
    }

    public static void fillRegistry(StudentRegistry sr){
        Student s1 = new Student();
        s1.name = "Santa Claus";
        s1.batch = "March 2023";
        s1.age = 25;

        IntelligentStudent i1 = new IntelligentStudent();
        i1.name = "Santa Klaus";
        i1.batch = "May 2023";
        i1.age = 26;
        i1.psp = 100;

        sr.RegisterStudent("Student", s1);
        sr.RegisterStudent("Intelligent Student", i1);
    }
}
