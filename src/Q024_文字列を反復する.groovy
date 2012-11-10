assert "foo" * 5 == "foofoofoofoofoo"

try {
    assert 5 * "foo" == "foofoofoofoofoo"
}catch (groovy.lang.MissingMethodException e){
    println "数値×文字列だと例外になる"
}catch (ex){
    pritnln "なんで！？"
}


