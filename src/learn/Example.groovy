package learn

class Example {

    static void main(String[] args){
        new File("src/learn/test.txt").eachLine {
            line -> println("line: $line")
        }
    }
}

