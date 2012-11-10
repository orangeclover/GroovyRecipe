/*「a」で始まる3文字を取り出す */

"xxxabcffpat".find(/a../)

/* 正規表現がマッチしない場合 */
"xxx".find(/a../)

/* マッチした部分をすべて取り出す */
("static int fact(int n){...}" =~ /\w+/).each{println it}

/* 正規表現の「()」にマッチした部分を取り出す */
/* -Rubyのメソッド名らしき部分を抜き出す*/
("def print(str)" =~/^\s*def\s+([^\s\(]+)/).each{println it[1]}

/* -Javaのメソッド名らしき部分を抜き出す*/
("static int fact(int n){...}" =~/\s+\w+\s+([^\s\(]+)/).each{println it[1]}


/* 正規表現の()が複数あり、マッチした部分を全部まとめて取り出す */
/* -まとめて */
("xxabcfffpatxxx" =~/(abc)(f+)(\w{3})/).each{println it[1..-1]}
/* -各要素 */
("xxabcfffpatxxx" =~/(abc)(f+)(\w{3})/).each{it[1..-1].each{println it}}