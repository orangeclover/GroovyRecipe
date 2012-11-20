/*「あ」を含むか？ */
assert "めぐりあい" =~/あ/


/*「あ」と「い」を両方含むか？*/
assert "めぐりあい" =~/(?=.*?あ).*?い/ 
assert "いあいあ" =~/(?=.*?あ).*?い/ 
assert !("IA-64" =~/(?=.*?あ).*?い/)
str ="""
め
ぐ
り
あい
"""
assert !(str =~/((?m)=.*?あ).*?い/)



/* 指定した文字が含まれるか？ */
def rexpAnd (String target,String... regxp){
    for ( re in regxp) {
        if (! (target =~ re)) {
            return false
        }
    }
    return true
    
}

def someMethod(String... re) {
    result = []
    ["ああ", "あい", "あう", "あえ", "あお"].each{ str ->
        if (rexpAnd(str, re)) {
            result<< str
        }
    }
    return result
}


assert someMethod(/う/) == ["あう"]
assert someMethod(/あ/,/い/) == ["あい"]
assert someMethod(/あ/) == ["ああ", "あい", "あう", "あえ", "あお"]
