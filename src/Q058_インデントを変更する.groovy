if( GroovySystem.getVersion() < "1.7.3" ) {
    println "Groovy 1.7.3以上が必要です"
    return
}


test = """\
a
 b
c
    d
        e
\tf
			g
"""




def indentNotab(str,n){
    str.replaceAll(/(?m)^/, " " *n)
}


def indent(str,n, tabStop = 8){
    str.split("\n").toList().collect{line ->
        if (tabStop){
           (" " * n  + line.expand(tabStop)).unexpand(tabStop)
        } else {
           (" " * n ) + line
        }
    }.join("\n")
}

def indent2(str,n, tabStop = 8){
    retStr = ""
    str.eachLine{line ->
        if (tabStop){
          retStr += (" " * n  + line.expand(tabStop)).unexpand(tabStop) + "\n"
        } else {
          retStr += (" " * n ) + line + "\n"
        }
    }
    return retStr
}


def unindentNotab(str, n){
    str.replaceAll(/(?m)^ {0,$n}/, "")
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
def unindent2(str, n, tabStop = 8){
    retStr = ""
    str.eachLine{line ->
        if (tabStop) {
            retStr += line.expand(tabStop).replaceAll(/(?m)^ {0,$n}/, "").unexpand(tabStop) + "\n"
        } else {
            retStr += line.replaceAll(/(?m)^ {0,$n}/, "") + "\n"
        }
    }
    return retStr
}


println test
println indentNotab(test,8)
println indent(test, 8)
println indent2(test, 8)

println unindentNotab(test,8)
println unindent(test,8)
println unindent2(test,8)

println test.stripIndent(8)
