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

