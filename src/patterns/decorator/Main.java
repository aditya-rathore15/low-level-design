package patterns.decorator;

/*
 * Decorator Pattern
 *
 * Intent:
 * A decorator adds behavior to an object without changing its class. Use it when you need to layer on extra functionality at runtime.
 *
 * When to Use:
 * - Behavior needs to be added at runtime.
 * - Multiple combinations of features are required.
 * - Inheritance would lead to too many subclasses.
 *
 * Key Idea:
 * A decorator implements the same interface as the object it wraps,
 * adds behavior before/after delegating the call, and can be chained
 * with other decorators.
 *
 * Benefits:
 * - Follows the Open/Closed Principle.
 * - Favors composition over inheritance.
 * - Behaviors can be combined dynamically.
 */
public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource();

        source = new EncryptionDecorator(source);
        source = new CompressionDecorator(source);

        source.writeData("Learning Decorators!");

        System.out.println(source.readData());
    }
}
