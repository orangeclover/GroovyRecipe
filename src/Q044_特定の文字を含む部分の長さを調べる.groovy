def matching_length(str, regexp){
    result = 0
    m = (regexp).matcher(str)
    m.find()
    m.each{ chunk ->
        result += chunk.size()
    }
    return result
}

/* 空白類文字は何文字か？ */
println matching_length("abc d eee ff\n", ~/\s/)
println matching_length("abc d eee ff", ~/\s/)
println matching_length("", ~/\s/)
// ※空白が12個書いてある
println matching_length("            \n", ~/\s/)
println matching_length("            ", ~/\s/)

/* 「も」は何文字か？ */
println matching_length("すももももももももものうち", ~/も+/)

/* 
    補足
    Rubyのsplit(//)は、1文字に分割する処理
    each()メソッドで1文字ずつ分割した。
 */
 
