def takeNbytes(str, n) {
    buf = ''
    str = str.toList().each { c ->
        if ( buf.getBytes().size() + c.getBytes().size() <= n ) {
            buf += c
        }
    }
    return buf

}

println takeNbytes("あいうえお", 2)
println takeNbytes("あいうえお", 3)
println takeNbytes("あいうえお", 4)
println takeNbytes("あいうえお", 5)
println takeNbytes("あいうえお", 6)
println takeNbytes("abcdef", 5)