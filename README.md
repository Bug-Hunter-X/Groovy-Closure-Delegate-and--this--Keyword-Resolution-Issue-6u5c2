# Groovy Closure Delegate and Unexpected 'this' Behavior

This example demonstrates a common issue in Groovy when using closures and the `delegate` property.  The unexpected resolution of the `this` keyword within a closure can lead to runtime errors.

The `bug.groovy` file shows the problem:  the `this` keyword in the first `someMethod` call doesn't resolve to the expected object.  The `bugSolution.groovy` demonstrates a correction.

## How to Reproduce

1.  Run `bug.groovy`.
2.  Observe the `MissingPropertyException`.
3.  Run `bugSolution.groovy` to see the corrected behavior.

## Solution

The solution lies in understanding the scope of `this` within closures.  Properly setting the `delegate` and ensuring correct context is crucial. The corrected code in `bugSolution.groovy` illustrates the solution.