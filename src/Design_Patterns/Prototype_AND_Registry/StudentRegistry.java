package Design_Patterns.Prototype_AND_Registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> m1 = new HashMap<String, Student>();
    void RegisterStudent(String name, Student s){
        m1.put(name, s);
    }
    Student getStudent(String key){
        return m1.get(key).copy();
    }
}
