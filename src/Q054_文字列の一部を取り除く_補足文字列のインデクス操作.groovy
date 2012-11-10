/*
str8 = "8)goooooooooooooogle"
println str8
str8[1..10]= ""
println str8
Caught: groovy.lang.MissingMethodException: No signature of method: Q054_文字列の一部を取り除く.String() is applicable for argument types: (java.lang.String) values: [8)goooooooooooooogle]
StringのGDKでは[](subscript operator)に対応するputAt()が実装されていないので使えないようです。getAt()はあるので、参照専用ということですね。
一旦Listに変換すれば、putAt()が定義されているので[]による更新ができます。

*/


//toList()でバラしてjoin()

str8 = "goooooooooooooogle"
str8 = str8.toList()
str8[1..14] = ''
str8 = str8.join()
println str8


//StringBufferをつかう
str8 = "goooooooooooooogle"
str8 = str8 << ''
str8[1..14] = ''
str8 = str8.toString()
println str8


//取り除きたいところ以外を取得1
str8 = "goooooooooooooogle"
str8 = str8[(0..<str8.size())-(1..14)]
println str8

//取り除きたいところ以外を取得2
str8 = "goooooooooooooogle"
str8 = sprintf("%s%s", str8[0..0], str8[15..-1])
println str8



str8 = "goooooooooooooogle"
println str8.class
println str8.getClass().getName()

str8 = str8 << ''
println str8.class
println str8.getClass().getName()



