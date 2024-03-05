package Java_Basics.Constructor_Basics;

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student(1 , "Mohit");

        Student s3 = s1; //Shallow copy
        Student s2 = new Student(s1); //Deep Copy
        s2.exam.exam_id = 100;
        System.out.println(s);
    }

}
