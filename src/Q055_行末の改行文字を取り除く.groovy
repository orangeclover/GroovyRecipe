

println "1)行末の改行文字を取り除く"

def chomp(str){
    str.replaceAll(/(\r|\n)/,"")
}

println chomp(" 1-1)line\n")
println chomp(" 1-2)line\r\n")
println chomp(" 1-3)line\r")
println chomp(" 1-4)line\t\n")
println chomp(" 1-5)line\n")
println chomp(" 1-6)line \n")
println chomp(" 1-7)line")

println "2)末尾の改行と空白類文字を取り除く"
def rstrip(str){
    str.replaceAll(/\s+\z/,"")
}

println rstrip(" 2-1)line\n")
println rstrip(" 2-2)line\r\n")
println rstrip(" 2-3)line\r")
println rstrip(" 2-4)line\t\n")
println rstrip(" 2-5)line\n")
println rstrip(" 2-6)line \n")
println rstrip(" 2-7)line")

