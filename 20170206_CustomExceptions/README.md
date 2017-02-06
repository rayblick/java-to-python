# Custom Exceptions

## Quick
### Python
```python
class MyException(Exception):
    def __init__(self, err):
        self.errors = err
```
### Java
```java
public class MyException extends Exception{
  public MyException(String msg){
    super(msg);
  }
}
```
