package learn

import javax.naming.Name

//？运算符

/*
在java中，有时候为了避免出现空指针异常，我们通常需要这样的技巧：
if(rs!=null){
    rs.next()
    … …
}

在groovy中，可以使用?操作符达到同样的目的：
rs?.next()
?在这里是一个条件运算符，如果?前面的对象非null，执行后面的方法，否则什么也不做。
*/

//可变参数

int sum(int... var){
    def total =0
    for (i in var)
      total += 1
    return total
}

//我们可以在调用sum时使用任意个数的参数（1个，2个，3个……）：
println sum(1)
println sum(1,2)
println sum(1,2,3)


//定义一个enum：

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

//然后我们在switch语句中使用他

def today = Day.TUESDAY
/*注意，switch和case中可以使用任何对象，
尤其是可以在case中使用List和范围，从而使分支满足多个条件
（这点跟delphi有点象）。*/
switch (today){
    case [Day.SATURDAY, Day.SUNDAY] :
        println("Weekends are cool")
        break

    case Day.MONDAY..Day.FRIDAY:
        println("Boring work day")
        break
    default:
        println('Are you sure this is a valid day?')
}


//同java5一样，groovy支持带构造器、属性和方法的enum：
enum  Planet{
    MERCURY(3.303e+23, 2.4397e6),

    VENUS(4.869e+24, 6.0518e6),

    EARTH(5.976e+24, 6.37814e6),

    MARS(6.421e+23, 3.3972e6),

    JUPITER(1.9e+27,7.1492e7),

    SATURN(5.688e+26, 6.0268e7),

    URANUS(8.686e+25, 2.5559e7),

    NEPTUNE(1.024e+26, 2.4746e7)

    double mass

    double radius

    Planet(double  mass, double radius){
        this.mass = mass
        this.radius = radius
    }

    void printMe(){
        println("${name()} has a mass of ${mass} and a raius of ${radius}")
    }
}

Planet.EARTH.printMe()

/**
 * 这是三目运算符“?:”的简单形式，三目运算符通常以这种形式出现：
 *
 * String displayName = name != null ? name : "Unknown";
 *
 * 在groovy中，也可以简化为（因为null在groovy中可以转化为布尔值false）：
 */
name = null
String displayName = name ? name : 'Unknown'
println(displayName)

//动态性
def msg = "Hello!"
//println(msg.metaClass)
String.metaClass.up = { delegate.toUpperCase()}
println(msg.up())

//msg.metaClass.methods.each { println(it.name)}
//msg.metaClass.properties.each {println(it.name)}

if (msg.metaClass.respondsTo(msg, 'up')){
    println(msg.toUpperCase())
}

if (msg.metaClass.hasProperty(msg, 'bytes')) {

    println msg.bytes.encodeBase64()

}
