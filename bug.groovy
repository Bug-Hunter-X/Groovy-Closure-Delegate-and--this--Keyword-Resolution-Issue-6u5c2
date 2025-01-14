```groovy
def someMethod(Closure closure) {
  closure.delegate = this
  closure() 
}

someMethod { 
  println this.someProperty  //this will throw MissingPropertyException
}

class MyClass {
  String someProperty = "Some Value"

  void myMethod() {
    someMethod { 
      println this.someProperty //this works fine because 'this' is properly resolved
    }
  }
}
```