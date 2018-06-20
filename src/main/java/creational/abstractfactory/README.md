# Abstract Factory

## Job
Delegate creation of an object to implementors of an interface
 or children of an abstract class.

## Use Case
* Providing a contract for future implementors to create an object with complex initiation logic. 
(Common with Java EE specifications that don't yet have implementations)
* Provide advanced features, such as caching in this case to clients while
 allowing for a default implementation to exist without such features.
