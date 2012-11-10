def unmatching_length(str, regexp){
    result = 0
    m = (regexp).matcher(str)
    m.find()
    m.each{ chunk ->
        result += chunk.size()
    }
    return str.length() - result
}

/* 空白類文字以外は何文字か？ */
println unmatching_length("abc d eee ff\n", ~/\s/)
println unmatching_length("abc d eee ff", ~/\s/)
println unmatching_length("", ~/\s/)
// ※空白が12個書いてある
println unmatching_length("            \n", ~/\s/)
println unmatching_length("            ", ~/\s/)

/* 「も」以外は何文字か？ */
println unmatching_length("すももももももももものうち", ~/も+/)
