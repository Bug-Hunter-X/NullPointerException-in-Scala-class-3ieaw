```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  val result = obj.myMethod(10) 
  println(result) // Output: 15
}
```