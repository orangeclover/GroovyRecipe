if( GroovySystem.getVersion() < "1.7.7" ) {
    println "Groovy 1.7.7以上が必要です"
    return
}


queue = ["愛","哀","相"]
i=0
println "あいあいあい".replaceFirst(/あい/) { queue[i++] }
i=0
println "あいあいあい".replaceAll(/あい/) { queue[i++] }

queue = ["愛","哀","相"]
println "あいあいあい".replaceFirst(/あい/) { queue.pop() }
queue = ["愛","哀","相"]
println "あいあいあい".replaceAll(/あい/) { queue.pop() }

println ""
println "FrontPage".replaceFirst(/(.)([A-Z])/){it[1] + " " + it[2]}
println "MyToDo".replaceAll(/(.)([A-Z])/){it[1] + " " + it[2]}