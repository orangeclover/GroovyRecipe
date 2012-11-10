println "パターンが含まれるかどうかを調べる"

("a c"=~/[ \t]/).find()
("abc"=~/[ \t]/).find()


println "   全体一致なのでNG"
("a c"==~/[ \t]/)
("abc"==~/[ \t]/)
"a c".matches(/[ \t]/)
"abc".matches(/[ \t]/)
("a c"=~/[ \t]/).matches()
("abc"=~/[ \t]/).matches()


println "   左辺と右辺が逆なのでNG"
(/[ \t]/==~"a c")
(/[ \t]/==~"abc")


(/[ \t]/=~"a c").find()
(/[ \t]/=~"abc").find()




println "   Matcherオブジェクトが返されるのでNG"
("a c"=~/[ \t]/)
("abc"=~/[ \t]/)


println "   マッチした文字列が返されるのでNG"
"a c".find(/[ \t]/)
"abc".find(/[ \t]/)


println "パターンが最初に出現するバイト位置を調べる"
"xxxabcabcabcxxx".indexOf("abc")
"xxxabcabcabcxxx".indexOf(".")
"xxx..........xxx".indexOf(".")

println "パターンが最後に出現するバイト位置を調べる"
"xxxabcabcabcxxx".lastIndexOf("abc")
"xxxabcabcabcxxx".lastIndexOf(".")
"xxx..........xxx".lastIndexOf(".")


println "マッチの詳しい情報を得る"

str = "xxxabcabcabcxxx"
pattern = /abc/
m = (str=~pattern)
m.find()
m.start()
m.end()
m[0]
str.substring( m.start(), str.length() )


m2 = (~pattern).matcher(str)
m2.find()
m2.start()
m2.end()
m2[0]
str.substring( m2.start(), str.length() )



println "1つもの文字列中のすべての候補にマッチさせる"
str2 = "あ\n aadかきe\ne さ0\n0aた\n iiな\n"
m3 = (~/[あ-ん]+/).matcher(str2)
m3.find()
m3.each {println it}


println "パターンを含む行のみを処理する"

str2.findAll(~/.*[あた].*/) { println it}
str2.findAll(~/.*[あた].*/) { line->println line}

println "NG" 
str2.findAll(~/[あた]/) { line->println line}
