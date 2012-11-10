
str1 = "1)\t今日の昼食\nうに\n"
println str1
println str1.replaceFirst(/\s+/,"")
println str1.replaceAll(/\s+/,"")



str2 = "2)goooooooooooooogle"
println str2
println str2.minus("o")
println str2.replaceAll(/o/,"")


str3 = "3)gggooogle"
println str3
println str3.replaceAll(/g+/,"g")



str4 = "4)マルチバイト文字も使える。すごい！！！！"
println str4
println str4.replaceAll(/！+/,"！")


str5 = "5)aaax"
println str5
println str5.replaceAll(/(?m)(?s).\z/,"")

str6 = "6)aaa\n"
println str6
println str6.replaceAll(/(?m)(?s).\z/,"")

str7 = "7)aaa\r\n"
println str7
println str7.replaceAll(/(?m)(?s).\z/,"")
/*
[[http://d.hatena.ne.jp/orangeclover/20100117/1263730971:title=正規表現が文字列の先頭・末尾にマッチするか調べる (マルチラインモード含む)]
*/


str8 = "8)goooooooooooooogle"
println str8
try {
    str8[1..10]= ""
    println str8
}catch(groovy.lang.MissingMethodException e){
}


/*
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.putAt() is applicable for argument types: (groovy.lang.IntRange, java.lang.String) values: [1..10, ]
        at Q054_文字列の一部を取り除く.run(Q054_文字列の一部を取り除く.groovy:42)

[[http://d.hatena.ne.jp/orangeclover/20110303/1299102908:title=Groovyで文字列を置換する] の最後でもはまったけど
なんでだ？
*/


/*
1)      今日の昼食
うに

1)今日の昼食
うに

1)今日の昼食うに
2)goooooooooooooogle
2)gooooooooooooogle
2)ggle
3)gggooogle
3)gooogle
4)マルチバイト文字も使える。すごい！！！！
4)マルチバイト文字も使える。すごい！
5)aaax
5)aaa
6)aaa

6)aaa
7)aaa

7)aaa
8)goooooooooooooogle
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.putAt() is applicable for argument types: (groovy.lang.IntRange, java.lang.String) values: [1..10, ]
        at Q054_文字列の一部を取り除く.run(Q054_文字列の一部を取り除く.groovy:44)*/