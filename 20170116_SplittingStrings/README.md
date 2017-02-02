# splitting strings

## Quick

### Python
```python
"Testing@gmail.com".split('@')[0]
```
### Java
```java
StringTokenizer stl;
String email = "Testing@gmail.com";
stl = new StringTokenizer(email, "@");
System.out.println(stl.nextToken());
```
