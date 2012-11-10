println "1)"
"あいうえお".split(/./).each{println it}

println "2)"
"あいうえお".split(/\./).each{println it}

println "3)"
"あいうえお".split(/\s/).each{println it}

println "4)"
"あいうえお".split(/\w/).each{println it}

println "5)"
"あいうえお".each{println it}