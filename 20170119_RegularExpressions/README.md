# Regular Expressions

## Quick
### Python
```python
import re
re.match(r"(.*)(@)(.*)", "test@gmail.com")
```
### Java
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
String email = "Testing@gmail.com";
String pattern = "(.*)(\\@)(.*)";
Pattern r = Pattern.compile(pattern);
Matcher m = r.matcher(email);
```
