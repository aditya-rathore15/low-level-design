package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionPool p1 = DatabaseConnectionPool.getInstance();
        DatabaseConnectionPool p2 = DatabaseConnectionPool.getInstance();

        System.out.println(p1 == p2);
    }
}
