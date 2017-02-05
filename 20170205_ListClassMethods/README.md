# Printing a list of methods from a class

## Quick

### Python
```python
# identify methods from an uninstantiated class
yourClass.__dict__.items():

# Example
from types import FunctionType
print([x for x, y in ListClassMethods.__dict__.items() if type(y) == FunctionType]
```

### Java
```java
// import Method
import java.lang.reflect.Method;

// Create list of Methods
Method[] methods = yourInstatiatedObject.getClass().getDeclaredMethods();

// Example
MethodsForTesting me = new MethodsForTesting(2);
Method[] methods = me.getClass().getDeclaredMethods();
```
