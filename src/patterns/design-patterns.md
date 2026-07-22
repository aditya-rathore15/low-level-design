# Design Patterns

Design patterns are reusable building blocks for solving common design problems. They are named solutions that naturally emerge when you follow good object-oriented design principles.

Design patterns are broadly divided into three categories:

- **Creational Patterns** – Focus on object creation.
- **Structural Patterns** – Focus on how objects are composed.
- **Behavioral Patterns** – Focus on how objects communicate and interact.

---

# Creational Patterns

Creational patterns control how objects are created. They hide construction details, reduce tight coupling, and make it easy to change implementations without affecting client code.

## Factory Method

A **Factory** is a helper that creates the appropriate object for you, so the client doesn't need to know which concrete class to instantiate.

### When to Use
- Multiple implementations exist.
- The object type is decided at runtime.
- You want to hide object creation logic.

### Benefit
Keeps client code flexible and loosely coupled.

---

## Builder

A **Builder** constructs complex objects step by step without exposing complicated construction logic.

Instead of calling a constructor with many parameters (most of which may be optional), you build the object incrementally.

### Common Uses
- HTTP requests
- Database queries
- Configuration objects
- Objects with many optional fields

### Benefit
Makes object creation readable, flexible, and less error-prone.

---

## Singleton

A **Singleton** ensures that only one instance of a class exists throughout the application.

### Common Uses
- Configuration manager
- Logger
- Connection pool
- Cache manager

### Note
Singletons are often overused.

In many cases, it's better to create one shared object and pass it through constructors (dependency injection). This makes dependencies explicit and improves testability.

### Drawback
- Hidden dependencies
- Harder unit testing
- Global mutable state

---

# Structural Patterns

Structural patterns focus on how objects and classes are connected together.

They help build flexible relationships between objects while reducing tight coupling and making the overall design easier to maintain.

*(Examples include Adapter, Decorator, Facade, Composite, Proxy, and Bridge.)*

---

# Behavioral Patterns

Behavioral patterns focus on how objects communicate and share responsibilities.

They define interaction patterns that make systems more flexible and easier to extend.

*(Examples include Strategy, Observer, Command, State, Chain of Responsibility, and Template Method.)*