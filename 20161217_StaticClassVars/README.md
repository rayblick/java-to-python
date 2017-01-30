# Static Variables

## Quick
### Python
```python
class Person():
    pCount = 0
    def __init__(self, name):
        self.name = name
        Person.pCount += 1
```
### Java
```java
public class Person{
  private String name;
  static int personCount = 0;
  public Person(String name){
    this.name = name;
    personCount++;
  }
}
