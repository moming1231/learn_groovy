package learn


def var="hello "+

        "world"+

        ",groovy!"

/*def repeat(val, repeat = 6){

    for(i in 0 ..< repeat){

        println "This is ${i}:${val}"

    }

}

repeat(var)*/

//集合
def collect=["a","b","c"]
println collect
//除了声明时往集合中添加元素外，还可以用以下方式向集合中添加元素
collect.add(1);
collect << "come on"
collect[collect.size()]=100.0
println collect
//Collection使用类似数组下标的方式进行检索
println collect[collect.size()-1]
println collect[4]
//groovy支持负索引
println collect[-1]     //索引其倒数第1个元素
println collect[-2]      //索引其倒数第2个元素

//Collection支持集合运算
collect=collect + 5
println collect[collect.size()-1]

collect=collect-'a'         //在集合中减去元素a(第1个)
println collect[0]          //现在第1个元素变成b了

//同样地，你可以往集合中添加另一个集合或删除一个集合
println collect
collect = collect - collect[0..4] //把集合中的前5个元素去掉
println collect[0] //现在集合中仅有一个元素，即原来的最后一个元素

println collect[-1]  //也可以用负索引，证明最后一个元素就是第一个元素