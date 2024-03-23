package Design_Patterns.Prototype_AND_Registry;

public class IntelligentStudent extends Student{
    int psp;

    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent i){
        super(i);
        this.psp = i.psp;
    }

    public IntelligentStudent copy(){
//        IntelligentStudent i1 = new IntelligentStudent();
//        i1.name = this.name;
//        i1.age = this.age;
//        i1.batch = this.batch;
//        i1.psp = this.psp;
        IntelligentStudent i = new IntelligentStudent(this);
        return i;
    }
}
