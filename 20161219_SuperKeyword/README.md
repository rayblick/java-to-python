# Super Keyword

## Quick
### Python
```python
class Point3d(Point):
    def __init__(self, x, y, z):
        super(Point3d, self).__init__(x, y)
        self.z = z
```

### Java
```java
public class Point3D extends Point{
  public int z;
  public Point3D(int x, int y, int z){
    super(x, y);
    this.z = z;
    }
}
```
