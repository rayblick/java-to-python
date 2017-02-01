# Document Strings

## Quick
### Python
#### Create
```python
"""
This is a string added to the top of the module.
"""
class Foo():
# do something
```
#### Access 
```python
import DocStringExample
help(DocStringExample)
# or
DocStringExample.__doc__
```
  
### Java
#### Create module
```java
/**
 * 
 * This is a string added to the top of the module.
 * <p>
 * Use HTML tags.
 *
 */
public class Foo{
// do something
}
```
#### Create class and docs
```bash
javac DocStringExample.java
javadoc DocStringExample.java
```
#### Output
```bash
allclasses-frame.html    index-all.html           allclasses-noframe.html  
index.html               constant-values.html     jquery                   
resources                deprecated-list.html     member-search-index.zip  
script.js                DocStringExample.class   overview-tree.html       
search.js                DocStringExample.html    package-frame.html       
stylesheet.css           DocStringExample.java    package-list             
type-search-index.zip    package-summary.html     help-doc.html            
package-tree.html
```

### NB: Comment strings
```
# Python comment
// Java comment
""" Python multiline comment """
/* Java multiline comment */
```
