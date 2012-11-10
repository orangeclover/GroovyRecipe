def matching_length(str, regexp){
    println "matching_length() regexp is " +  regexp.getClass().getName()
    result = 0
    m = (~"$regexp").matcher(str)
    m.find()
    m.each{ chunk ->
        result += chunk.size()
    }
    return result
}

def unmatching_length(str, regexp){
    println "unmatching_length() regexp is " +  regexp.getClass().getName()
    return str.length() - matching_length(str, regexp)
}


/* 空白類文字以外は何文字か？ */
println unmatching_length("abc d eee ff\n", /\s/)


/* 空白類文字は何文字か？ */
//d println matching_length("abc d eee ff\n", /\s/)
//d println matching_length("abc d eee ff", /\s/)
//d println matching_length("", /\s/)
// ※空白が12個書いてある
//d println matching_length("            \n", /\s/)
//d println matching_length("            ", /\s/)

/* 「も」は何文字か？ */
//d println matching_length("すももももももももものうち", /も+/)


/* 空白類文字以外は何文字か？ */
//d println unmatching_length("abc d eee ff\n", /\s/)
//d println unmatching_length("abc d eee ff", /\s/)
//d println unmatching_length("", ~/\s/)
// ※空白が12個書いてある
//d println unmatching_length("            \n", /\s/)
//d println unmatching_length("            ", /\s/)

/* 「も」以外は何文字か？ */
//d println unmatching_length("すももももももももものうち", /も+/)



/* 
    補足
    Rubyのsplit(//)は、1文字に分割する処理
    each()メソッドで1文字ずつ分割した。
 */
