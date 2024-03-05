package Java_Basics.Constructor_Basics;

public class Exam {
    int exam_id;
    ReattemptExam reattemptExam;

    Exam(int id ){
        exam_id = id;
        this.reattemptExam = new ReattemptExam();
    }

    Exam(Exam other){ //Copy constructor
        this.exam_id = other.exam_id;
        this.reattemptExam = other.reattemptExam;
    }
}