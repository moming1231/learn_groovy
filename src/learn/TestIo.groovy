package learn

import org.junit.Test

class TestIo {

    @Test
    void test01(){
        def file = new File("‪E:/TfsData/1000.txt")
        file.eachLine { lien -> println("line: $lien")}

    }


}
