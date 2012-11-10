str1 = "xxxあxxxx"

str2 = str1.replaceFirst(/あ/) { s -> s + "いうえお" }
println str1
println str2

str1 = str1.replaceFirst(/あ/) { s -> s + "いうえお" }
println str1

str3 = "あいうえお"
str4 = str3.replaceFirst(/(?m)\A.{3}/){ s -> s + "inserted" }
println str3
println str4

str3 = str3.replaceFirst(/(?m)\A.{3}/){ s -> s + "inserted" }
println str3

chars = ["inserted"]
println chars.size()
println chars.class

/*
chars = "あいうえお".split()
chars[3.."inserted".size()] = "inserted".split()
println chars.join("")

Caught: groovy.lang.MissingMethodException: No signature of method: [Ljava.lang.String;.putAt() is applicable for argument types: (groovy.lang.IntRange, [Ljava.lang.String;) values: [3..8, [inserted]]
Possible solutions: putAt(java.lang.String, java.lang.Object), putAt(java.lang.Integer, java.lang.Object), getAt(groovy.lang.IntRange), getAt(java.lang.Integer), getAt(java.lang.String), getAt(groovy.lang.EmptyRange)
        at Q062_文字列の途中に文字列を挿入する.run(Q062_文字列の途中に文字列を挿入する.groovy:24)
*/

str4 = "あいうえお"
str5 = sprintf("%s%s%s", str4[0..3], "inserted", str4[4..-1])

println str4
println str5

str4 = sprintf("%s%s%s", str4[0..3], "inserted", str4[4..-1])
println str4