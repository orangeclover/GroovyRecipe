Groovy_in_Action_english ="[Papaerback] [Dierk Koenig (Author), Andrew Glover (Author), Paul King (Author), Guillaume Laforge (Author), Jon Skeet (Author), James Gosling (Foreword)] Groovy, the brand-new language for the Java platform, brings to Java many of the features that have made Ruby popular."


println "1.空白類文字を区切りにして分ける"
Groovy_in_Action_english.split().each{ word ->
        println word
}


println "2. 記号なども区切りにして分ける"
println "2-1. 単語構成文字:[a-zA-Z_0-9]だけで成り立っているものを単語とみなす"
println "2-1-1. matcherを使う"
(Groovy_in_Action_english =~/\w+/).each{ word ->
        println word
}

println "2-1-1. splitを使う (指定するのは区切り文字だから正規表現が逆転する)"
Groovy_in_Action_english.split(/\W+/).each{ word ->
        println word
}


println "2-2. 単語構成文字だけ、または、記号（非空白文字と非単語構成文字の組み合わせ）で成り立っている2つを単語とみなす"
(Groovy_in_Action_english =~/\w+|[^\s\w]+/).each{ word ->
        println word
}

