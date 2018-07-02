package learn


//我们可以使用默认构造方法实例化Person类：
def person1 = new Person()
person1.name ='KK'
person1.age=20
println person1

//也可以用groovy的风格做同样的事：

def person2 = new Person(['name':'gg','age':22])
println person2


