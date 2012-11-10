if (GroovySystem.getVersion() < "2.0") {
    println "Groovy 2.0 以上が必要"
    System.exit(1)
}

def takeNcols(str, n){

    result = ""
    str.takeWhile {
         if ( (result + it).getBytes("Shift-JIS").size() <= n ) {
            result += it
        }
    }
    return result


}

assert takeNcols("あいうえおabcdeかきくけこfghij",10) == "あいうえお"


