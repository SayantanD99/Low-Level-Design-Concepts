package Design_Patterns.Singleton;
public class Main {
    public static void main(String[] args) {
        DB_Conn d1 = DB_Conn.getInstance();
        DB_Conn d2 = DB_Conn.getInstance();
        d1.increment_c();

        System.out.println(d2.getC());
        System.out.println(d1.getC());

    }
}