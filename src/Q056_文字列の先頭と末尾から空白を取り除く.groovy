/*文字列先頭・末尾の両方の空白類文字を除去 */
println "\tキュッと\r\n".trim()

/*文字列先頭の空白類文字だけ除去 */
def lstrip(str){
    str.replaceAll(/\A\s+/,"")
}
println lstrip("\tキュッと\r\n")


/*文字列先頭・末尾の全角空白文字も取り除く*/
def jstrip(str){
    str.replaceAll(/\A[\s　]+/,"").replaceAll(/[\s　]+\z/,"")
}


def jlstrip(str){
    str.replaceAll(/\A[\s　]+/,"")

}

def jrstrip(str){
    str.replaceAll(/[\s　]+\z/,"")
}

println jstrip ("\t　キュッと\r　\n")
println jlstrip("\t　キュッと\r　\n")
println jrstrip("\t　キュッと\r　\n")