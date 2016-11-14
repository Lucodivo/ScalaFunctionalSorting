package polymorphism

abstract class Animal {
  def makeSound: String
}

class Dog extends Animal {
  override def makeSound = "Woof"
}

class Cat extends Animal {
  override def makeSound = "Meow"
}