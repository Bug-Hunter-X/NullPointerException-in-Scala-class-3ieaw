# NullPointerException in Scala Class

This repository demonstrates a common error in Scala: the `NullPointerException`.

## Description
The `MyClass` class has a field `x` of type `Int`.  While the provided example doesn't cause a `NullPointerException`, it's easy to modify it to do so.  If `x` were allowed to be `null`, accessing it would cause this exception.  This example highlights the importance of proper null handling in Scala.

## How to Reproduce
1. Clone the repository.
2. Compile and run the Scala code (MyClass.scala). The program will run without errors.
3. Modify `MyClass` to make `x` nullable (e.g., `val x: Int = null`).  Then, running the program will result in a `NullPointerException`.

## Solution
The solution is to prevent `x` from being `null`.  This can be done by:
*  Using `Option[Int]` instead of `Int` to explicitly represent the possibility of a missing value.
*  Using a default value for `x`.
*  Ensuring that `x` is never assigned `null`.

This example underscores the significance of null safety in Scala development.