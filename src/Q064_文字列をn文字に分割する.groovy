println "123456789".findAll(/(?m).{1,4}/)

println "あい\nうえおかきくけ".findAll(/.{1,4}/)

println "あい\nうえおかきくけ".findAll(/(?m).{1,4}/)


def split_nchars(str, n){
    return str.findAll(/(?m).{1,${n}}/)
}


println split_nchars("あいうえおかきくけ", 4)
println split_nchars("あいうえおか", 4)
println split_nchars("あいう", 4)
