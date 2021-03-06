##Abstract Factory
**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

![Abstract factory pattern diagram](https://raw.githubusercontent.com/VladislavPovedyuk/JavaGoFPatternsExamples/master/AbstractFactory/src/diagram/abstract-factory-class-diagram.jpg "Abstract Factory")

**Applicability:** Use the Abstract Factory pattern when
* a system should be independent of how its products are created, composed and represented
* a system should be configured with one of multiple families of products
* a family of related product objects is designed to be used together, and you need to enforce this constraint
* you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations

##Adapter
**Intent:** Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

![Adapter pattern diagram](https://raw.githubusercontent.com/VladislavPovedyuk/JavaGoFPatternsExamples/master/Adapter/src/diagram/adapter-class-diagram.jpg "Adapter")

**Applicability:** Use the Adapter pattern when
* you want to use an existing class, and its interface does not match the one you need
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.

##Bridge
**Intent:** Decouple an abstraction from its implementation so that the two can vary independently.


![Bridge pattern diagram](https://raw.githubusercontent.com/VladislavPovedyuk/JavaGoFPatternsExamples/master/Bridge/src/diagram/bridge-class-diagram.jpg "Bridge")

**Applicability:** Use the Bridge pattern when
* you want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example, when the implementation must be selected or switched at run-time.
* both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independently
* changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
* you have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies
* you want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.

##Builder
**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

![Builder pattern diagram](https://raw.githubusercontent.com/VladislavPovedyuk/JavaGoFPatternsExamples/master/Builder/src/diagram/builder-class-diagram.jpg "Builder")

**Applicability:** Use the Builder pattern when
* the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
* the construction process must allow different representations for the object that's constructed

##Chain of responsibility
**Intent:** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

![Chain of Responsibility pattern diagram](https://raw.githubusercontent.com/VladislavPovedyuk/JavaGoFPatternsExamples/master/ChainOfResponsibility/src/diagram/chain-of-responsibility-class-diagram.jpg "Chain of Responsibility")

**Applicability:** Use Chain of Responsibility when
* more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
* you want to issue a request to one of several objects without specifying the receiver explicitly
* the set of objects that can handle a request should be specified dynamically