package Design_Patterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DB_Conn {
    private static DB_Conn instance = null;

    static Lock  l = new ReentrantLock();

    int c = 0;

    public int getC() {
        return c;
    }

    public void increment_c(){
        this.c+=1;
    }

    private DB_Conn(){

    }

    public static DB_Conn getInstance(){
        if(instance==null){

            l.lock();
            if(instance == null){
                instance = new DB_Conn();
            }
            l.unlock();
        }
        return instance;
    }
}