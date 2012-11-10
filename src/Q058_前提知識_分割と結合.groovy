test = """\
1 aaaaa
2 bbbbb
3 ccccc
4 ddddd
5 eeeee
6 fffff
7 ggggg
"""




println "1)"
test.split("\n").toList().collect{line ->
    println line
}


println "\n2)"
result = test.split("\n").toList().collect{line ->
    line.replaceAll(" ",":")
}.join("")
println result

println "\n3)"
i=0
result = test.split("\n").toList().collect{line ->
    line.replaceAll(" ",":")
}.join("\n")
println result

println "\n4)"
retStr = ""
test.eachLine{line ->
    retStr += line.replaceAll(" ",":") + "\n"
}
println retStr



/*
test.map{line ->
    line.replaceAll(" ",":")
}.join("")
これはエラー
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.map() is applicable for argument types:
*/

/*
result = test.collect{line ->
    println line
}
これだと文字単位になる

1

a
a
a
a
a


2

b
b
b
b
b


3

c
c
c
c
c


4

d
d
d
d
d


5

e
e
e
e
e


6

f
f
f
f
f


7

g
g
g
g
g


*/

/*
test.eachLine{line ->
   line.replaceAll(" ",":")
}.join("\n")

これもエラー
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.join() is applicable for argument types:
*/
