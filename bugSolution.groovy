```groovy
def someMethod(Closure closure) {
  closure.delegate = this
  closure.resolveStrategy = Closure.DELEGATE_ONLY //This line fixes the issue
  closure() 
}

someMethod { 
  println this.someProperty  //this will now work correctly
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