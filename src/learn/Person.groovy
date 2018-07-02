package learn

class Person {

    def name
    def age

    String toString(){//注意方法的类型String，因为我们要覆盖的方法为String类型
        "$name,$age"
    }

}


