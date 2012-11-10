println "abcde".getBytes()

"abcde".getBytes().each(){
    println it
}

"abcde".each(){ 
    println it.getBytes()
}