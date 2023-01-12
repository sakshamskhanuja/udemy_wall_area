## Wall Area

### Description

Write a class with the name <b>Wall</b>. The class needs two fields (instance variables) with name <b>width</b> and <b>height</b> of type <b>double</b>.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters <b>width</b> and <b>height</b> of type <b>double</b> and it needs to initialize the fields. In case the <b>width</b> is less than 0 it needs to set the <b>width</b> field value to 0, in case the <b>height</b> parameter is less than 0 it needs to set the <b>height</b> field value to 0.

Write the following methods (instance methods):

<ul>
<li>Method named <b>getWidth</b> without any parameters, it needs to return the value of <b>width</b> field.</li>
<li>Method named <b>getHeight</b> without any parameters, it needs to return the value of <b>height</b> field.</li>
<li>Method named <b>setWidth</b> with one parameter of type <b>double</b>, it needs to set the value of the <b>width</b> field. If the parameter is less than 0 it needs to set the <b>width</b> field value to 0.</li>
<li>Method named <b>setHeight</b> with one parameter of type <b>double</b>, it needs to set the value of the <b>height</b> field. If the parameter is less than 0 it needs to set the height field value to 0.</li>
<li>Method named <b>getArea</b> without any parameters, it needs to return the area of the wall.</li>
</ul>

### Test Code

```
Wall wall = new Wall(5, 4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
```

### Output

    area= 20.0
    width= 5.0
    height= 0.0
    area= 0.0
