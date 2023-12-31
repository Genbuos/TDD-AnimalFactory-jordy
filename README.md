# TDD-AnimalFactory

__this is a pretty big lab. important to get it done.__

_remember, make your last commit message "finished" after you have figured it all out_

* **Objective:**
    * To create tests that ensure expected behavior of each class:
        * Cat
        * Dog
        * AnimalFactory
        * CatHouse
        * DogHouse
* **Purpose:**
    * To establish familiarity with Test-Driven-Development (TDD) practices.
* **Getting context:**
	* Click [here](https://github.com/Zipcoder/TDD-AnimalFactory/blob/master/README-TDDPatterns.md) to gain more familiarity with TDD-structured programming.

## Getting Started

* You probably already have IntelliJ installed, right?
* Begin by opening the project via its `pom.xml` with IntelliJ.
    * [How do I install IntelliJ](https://github.com/Zipcoder/Maven.TDD-AnimalFactory/blob/master/README-InstallingIntelliJ.md)?
* Continue by opening the `test.java.rocks.zipcodewilmington` package and completing each of the `TODO`s.

### CatTest
* Create tests for `void setName(String name)`
    * ensure that when `.setName` is invoked on an instance of `Cat`, the `name` field is being set to the respective value.
* Create tests for `setBirthDate(Date birthDate)`
    * ensure that when `.setBirthDate` is invoked on an instance of `Cat`, the `birthDate` field is being set to the respective value.
* Create tests for `String speak()`
    * ensure that when `.speak` is invoked on an instance of `Cat`, the value `"meow!"` is returned.
* Create tests for `void eat(Food food)`
    * ensure that when `.eat` is invoked on an instance of `Cat`, the `numberOfMealsEaten` is increased by 1.
* Create tests for `Integer getId()`
    * ensure that when `.getId` is invoked on an instance of `Cat`, the respective `id` value is returned.
* Create test to check Animal inheritance; google search `java instanceof keyword`
    * ensure that a `Cat` is an `instanceof` an Animal 
* Create test to check Mammal inheritance; google search `java instanceof keyword`
    * ensure that a `Cat` is an `instanceof` a Mammal

### DogTest
* Create tests for `void setName(String name)`
    * ensure that when `.setName` is invoked on an instance of `Dog`, the `name` field is being set to the respective value.
* Create tests for `setBirthDate(Date birthDate)`
    * ensure that when `.setBirthDate` is invoked on an instance of `Dog`, the `birthDate` field is being set to the respective value.
* Create tests for `String speak()`
    * ensure that when `.speak` is invoked on an instance of `Dog`, the value `"bark!"` is returned.
* Create tests for `void eat(Food food)`
    * ensure that when `.eat` is invoked on an instance of `Dog`, the `numberOfMealsEaten` is increased by 1.
* Create tests for `Integer getId()`
    * ensure that when `.getId` is invoked on an instance of `Dog`, the respective `id` value is returned.
* Create test to check Animal inheritance; google search `java instanceof keyword`
    * ensure that a `Dog` is an `instanceof` an Animal 
* Create test to check Mammal inheritance; google search `java instanceof keyword`
    * ensure that a `Dog` is an `instanceof` an Mammal
 

### AnimalFactoryTest
* Create Test for `Animal createDog(String name, Date birthDate)`
    * ensure that when `.createDog` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.
* Create Test for `Animal createCat(String name, Date birthDate)`
    * ensure that when `.createCat` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.

### CatHouseTest
* Create tests for `void add(Cat cat)`
    * ensure that when `.add` is invoked on the `CatHouse`, a respective `Cat` object can be retrieved from the house.  
* Create tests for `void remove(Cat cat)`
    * ensure that when `.remove` is invoked on the `CatHouse`, a respective `Cat` object can no longer be retrieved from the house.
* Create tests for `void remove(Integer id)`
    * ensure that when `.remove` is invoked on the `CatHouse`, a `Cat` object with the respective `id` can no longer be retrieved from the house.
* Create tests for `Cat getCatById(Integer id)`
    * ensure that when `.getCatById` is invoked on the `CatHouse`, a `Cat` with the respective `id` is returned.
* Create tests for `Integer getNumberOfCats()`
    * ensure that when `.getNumberOfCats()` is invoked on the `CatHouse`, the respective number of `Cat` objects is returned.
 
### DogHouseTest
* Create tests for `void add(Dog dog)`
    * ensure that when `.add` is invoked on the `DogHouse`, a respective `Dog` object can be retrieved from the house.  
* Create tests for `void remove(Integer id)`
    * ensure that when `.remove` is invoked on the `DogHouse`, a respective `Dog` object can no longer be retrieved from the house.
* Create tests for `void remove(Dog dog)`
    * ensure that when `.remove` is invoked on the `DogHouse`, a `Dog` object with the respective `id` can no longer be retrieved from the house.
* Create tests for `Dog getDogById(Integer id)`
    * ensure that when `.getCatById` is invoked on the `DogHouse`, a `Dog` with the respective `id` is returned.
* Create tests for `Integer getNumberOfDogs()`
    * ensure that when `.getNumberOfDogs()` is invoked on the `DogHouse`, the respective number of `Dog` objects is returned.

## Now...

_Why is this lab important?_

## Java Inheritance

Java inheritance makes things easier for a programmer by allowing them to reuse code and create more flexible and modular programs. Inheritance allows a subclass to inherit properties and methods from a superclass, which can save time and effort when writing code.

By using inheritance, programmers can create a hierarchy of classes that share common properties and behaviors. This can make the code easier to understand and maintain, as changes made to the superclass will automatically be inherited by the subclasses. In addition, inheritance can help to reduce code duplication, as common properties and behaviors can be defined in the superclass and reused by the subclasses.

Inheritance also allows for __polymorphism__, which is the ability of objects to take on multiple forms. This means that a subclass can be treated as an instance of its superclass, which can make the code more flexible and adaptable to changing requirements. For example, a program that uses inheritance can easily add new subclasses without having to modify the existing code.

