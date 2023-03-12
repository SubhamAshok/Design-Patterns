# Design-Patterns
## Creational: 
deals with creation of objects
### Factory Method Design Pattern:<br>
- The factory method pattern defines an interface for creating an object but let's subclasses decide which class to instantiate .
- abstracting away the construction of an object from where we use that object (Client)
- Somewhere, the `new` has to be present, Where? Factory. Does substituting one line of code with other make sense? 
- Yes, Benefits of creating a factory: 1. Polymorshism- use factory to create object where-ever needed 2. If there is a business logic to create object, we can encapsulate it