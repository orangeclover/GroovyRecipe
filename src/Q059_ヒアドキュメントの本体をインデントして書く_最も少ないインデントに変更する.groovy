test = """\
    * foo
\t  * buz
        * bar
"""


def rstrip(str){
    str.replaceAll(/\s+\z/,"")
}

def unindent(str, n, tabStop = 8){
    str.split("\n").toList().collect{line ->
        if (tabStop) {
           line.expand(tabStop).replaceAll(/(?m)^ {0,$n}/, "").unexpand(tabStop) 
        } else {
            line.replaceAll(/(?m)^ {0,$n}/, "")
        }
    }.join("\n")
}


def minimumIndent(str){
    
    indents = str.split("\n").toList().collect{line ->
         /*タブを空白に変換
           行末の空白類を削除、
           先頭からの空白を検索 find()はrubyのslice()の代わり
           サイズを取得 */
         rstrip(line.expand()).find(/\A */).size()
    }
    /* indents は[4, 10, 8]のようなリストになっている */
    indents.min()
}

def unindent_auto(str){
    unindent(str, minimumIndent(str))
}

println test
println unindent_auto(test)


