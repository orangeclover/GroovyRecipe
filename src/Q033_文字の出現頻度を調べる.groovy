def char_stat(str){
    table = [:]
    m = (~/(?m)./).matcher(str)
    m.find()
    m.each { word ->
        table[word] = table.get(word,0) + 1
    }
    list = table.keySet().toList().sort()
    list.sort {table[it]}
    statistic = "\n"
    list[-1..-10].each { word->
        println word.padLeft(2) + ':' + table[word] + "\n"
    }
}


pie = "3.141592653589793238462643383279"
char_stat(pie)