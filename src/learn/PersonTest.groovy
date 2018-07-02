package learn

import org.junit.Assert
import org.junit.Test

class PersonTest {

    @Test
    public void testToString(){
        Person person = new Person()  //注意因为groovy编译Person时默认所有属性为private
        person.setName("ddd")   //所以用set方法设置name属性而不用p.name=”ddd”
        person.setAge('18')
        Assert.assertEquals("ddd,18", person.toString());
    }

    @Test
    void testToString2(){

        Person p=new Person("name":"ddd","age":18)
        Assert.assertEquals("ddd-18", p.toString())

    }


}
