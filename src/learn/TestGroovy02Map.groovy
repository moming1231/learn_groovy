package learn

import java.security.Key

//Map是“键-值”对的集合，在groovy中，键不一定是String，可以是任何对象(实际上Groovy中的Map就是java.util.Linke dHashMap)。
def map = ['name':'john','age':14,'sex':'boy']
println map

//添加john的体重
map = map + ['weight':25];
//添加john的身高
map.put('length', 1.8);
//添加john的父亲
map.father = 'Keller'
println map

//可以用两种方式检索值
println map['father']  //通过key作为下标索引
println map.length  //通过key作为成员名索引

//  闭包（Closure）
/*map.each({key,value->    //key,value两个参数用于接受每个元素的键/值
    println "$key:$value"})*/

//map.each{println it}     //it是一个关键字，代表map集合的每个元素

//map.each({ println it.getKey()+"-->"+it.getValue()})

def say = {word->
    println "Hi, $word"

}

//调用：
say('groovy')

say.call('groovy&grails')

//Groovy类和java类一样，你完全可以用标准java bean的语法定义一个groovy 类。
// 但作为另一种语言，我们可以使用更groovy的方式定义和使用类，这样的好处是，
// 你可以少写一半以上的javabean代码：
//(1)    不需要public修饰符
//(2)    不需要类型说明
//(3)    不需要getter/setter方法
//(4)    不需要构造函数
//(5)    不需要return
//(6)    不需要()号
/*
Groovy中方法调用可以省略()号（构造函数除外），也就是说下面两句是等同的：

person1.setName 'kk'
person1.setName('kk')
*/



