# Design Pattern

[![Join the chat at https://gitter.im/design-p/Lobby](https://badges.gitter.im/design-p/Lobby.svg)](https://gitter.im/design-p/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)

##### 该项目包含了所列举的设计模式
* [代码实现](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern) 
* [类图源文件](https://github.com/ToryZhou/design-pattern/tree/master/src/main/resources/uml)
* [单元测试](https://github.com/ToryZhou/design-pattern/tree/master/src/test/java/com/job/designpattern)

##### 原则
- 单一职责原则，就一个类而言，应该仅有一个引起它变化的原因
- 开放-封闭原则，软件实体（类、模块、函数等等）可以扩展，但是不可以修改
- 依赖倒转原则，高层模块不应该依赖低层模块，都应该依赖抽象。抽象不应该依赖细节，细节应该依赖抽象
- 里氏代换原则，子类必须能替换掉它们的父类型
- 迪米特法则，也叫最少知识原则，如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用
- 合成/聚合复用原则(CARP)，尽量使用合成/聚合，尽量不要使用类继承 

##### 设计模式种类
1. [简单工厂模式(Simple Factory)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/simplefactory),  
它是由一个工厂对象决定创建出哪一种产品类的实例，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一。  
![Simple Factory](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/SimplefactoryUml.png)

2. [策略模式(Strategy)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/strategy), 
它定义了算法家族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化，不会影响到使用算法的客户。  
![Strategy](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/StrategyUml.png)

3. [装饰模式(Decorator)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/decorator), 
动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。  
![Decorator](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/DecoratorUml.png)

4. [代理模式(Proxy)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/proxy), 
为其他对象提供一种代理以控制对这个对象的访问。  
![Proxy](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/ProxyUml.png)

5. [工厂方法模式(Factory Method)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/factorymethod), 
定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到它的子类。  
![Factory Method](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/FactoryMethodUml.png)

6. [原型模式(Prototype)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/prototype), 
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。  
![Prototype](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/PrototypeUml.png)

7. [模板方法模式(Template Method)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/templatemethod), 
定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可以重定义该算法的某些特定步骤。  
![Template Method](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/TemplatemethodUml.png)

8. [外观模式(Facade)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/facade), 
又叫门面模式，为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。  
![Facade](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/FacadeUml.png)

9. [建造者模式(Builder)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/builder), 
又叫生成器模式，将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。  
![Builder](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/BuilderUml.png)

10. [观察者模式(Observer)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/observer), 
又叫发布-订阅模式(Publish/Subscribe), 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。  
![Observer](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/ObserverUml.png)

11. [抽象工厂模式(Abstract Factory)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/abstractfactory), 
提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。  
![Abstract Factory](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/AbstractfactoryUml.png)

12. [状态模式(State)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/state), 
当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。  
![State](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/StateUml.png)

13. [适配器模式(Adapter)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/adapter), 
将一个类的接口转换为客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。  
![Adapter](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/AdapterUml.png)

14. [备忘录模式(Memento)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/memento), 
在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可将该对象恢复到原先保存的状态。  
![Memento](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/MementoUml.png)

15. [组合模式(Composite)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/composite), 
将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。  
![Composite](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/CompositeUml.png)

16. [迭代器模式(Iterator)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/iterator), 
提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。  
![Iterator](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/IteratorUml.png)

17. [单例模式(Singleton)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/singleton), 
保证一个类仅有一个实例，并且提供一个访问它的全局访问点。  
![Singleton](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/SingletonUml.png)

18. [桥接模式(Bridge)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/bridge), 
将抽象部分与它的实现部分分离，使它们都可以独立地变化。  
![Bridge](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/BridgeUml.png)

19. [命令模式(Command)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/command), 
将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。  
![Command](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/CommandUml.png)

20. [职责链模式(Chain of Responsibility)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/chainofresponsibility), 
使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，知道有一个对象处理它为止。  
![Chain of Responsibility](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/ChainofresponsibilityUml.png)

21. [中介者模式(Mediator)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/mediator), 
又叫调停者模式，用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。  
![Mediator](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/MediatorUml.png)

22. [亨元模式(Flyweight)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/flyweight), 
运用共享技术有效地支持大量细粒度的对象。  
![Flyweight](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/FlyweightUml.png)

23. [解释器模式(Interpreter)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/interpreter), 
给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。  
![Interpreter](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/InterpreterUml.png)

24. [访问者模式(Visitor)](https://github.com/ToryZhou/design-pattern/tree/master/src/main/java/com/job/designpattern/visitor), 
表示一个作用于某对象结构中的各元素的操作。可以在不改变各元素的类的前提下定义作用于这些元素的新操作。  
![Visitor](https://github.com/ToryZhou/design-pattern/raw/master/src/main/resources/uml/VisitorUml.png)
```
说明：
UML类图使用 Idea PlantUML plugin
同时需要下载安装 [graphviz](https://graphviz.gitlab.io/download/)
需要安装graphviz到默认目录 [参考说明](http://plantuml.com/graphviz-dot)
```