def quote_by_backslash(str){
    println str
    str.replaceAll(/['"\\]/){'\\' + it[0]}
}
println quote_by_backslash("1)abc'def\"ghi")
println quote_by_backslash("""2)abc'def\\\"ghi""")
println quote_by_backslash("""3)abc'def\"ghi""")

/*
def quote_by_backslash(str)
    p str
    str.gsub(/['"\\]/){|ch| '\\' + ch}
end


str = "1)abc'def\"ghi"
p str
p quote_by_backslash(str)


"1)abc'def\"ghi"
"1)abc'def\"ghi"
"1)abc\\'def\\\"ghi"
*/

/*
def remove_backslash(str){
    println str
    str.replaceAll(/\\(.)/){it[0]}
}
println remove_backslash("4)abc\'def\\\"ghi")
println remove_backslash("""5)abc\'de\\\"ghi""")

以下のエラーになる
Caught: groovy.lang.MissingMethodException: No signature of method: Q053_文字をエスケープする_エスケープを外す$_remove_backslash_closure2.doCall() is applicable for argument types: (java.lang.String, java.lang.String) values: [\", "]
        at Q053_文字をエスケープする_エスケープを外す.remove_backslash(Q053_文字をエスケープする_エスケープを外す.groovy:12)
        at Q053_文字をエスケープする_エスケープを外す.run(Q053_文字をエスケープする_エスケープを外す.groovy:14)
        
やりたことは、以下のRubyのコードをGroovyで書く場合。どうすればいいだろうか？

def remove_backslash(str)
    str.gsub(/\\(.)/){ $1 }
end
p remove_backslash("abc\'def\\\"ghi") #=> "abc'def\"ghi"

[[http://d.hatena.ne.jp/uehaj/20071010:title=2007-10-10 君ならどう書く？　s///ge]
なんだ、Groovyでも$1ってそのまま使えるのか。

*/

def remove_backslash(str){
    println str
    str.replaceAll(/\\(.)/,/$1/)
}
println remove_backslash("4)abc\'def\\\"ghi")
println remove_backslash("""5)abc\'de\\\"ghi""")


def double_quote(str){
    println str
    str.replaceAll(/['"]/){it[0] + it[0] }
}
println double_quote("6)abc'def\"ghi")


def remove_doubled(str){
    println str
    str.replaceAll(/(['"])\1/,/$1/)
}
println remove_doubled("7)abc''def\"\"ghi")


str = "8)a b \tc\r\n"

println str
println str.inspect()


/*
[D:\workspace\groovy_SandBox]groovy Q053_文字をエスケープする_エスケープを外す.groovy
1)abc'def"ghi
1)abc\'def\"ghi
2)abc'def\"ghi
2)abc\'def\\\"ghi
3)abc'def"ghi
3)abc\'def\"ghi
4)abc'def\"ghi
4)abc'def"ghi
5)abc'de\"ghi
5)abc'de"ghi
6)abc'def"ghi
6)abc''def""ghi
7)abc''def""ghi
7)abc''''def""""ghi
8)a b   c

"8)a b \tc\r\n"
*/