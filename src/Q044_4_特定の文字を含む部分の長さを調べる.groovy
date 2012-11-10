class test{
    def matching_length(str, regexp){
        def result = 0
        def m = (regexp).matcher(str)
        m.find()
        m.each{ chunk ->
            result += chunk.size()
        }
        return result
    }

    def unmatching_length(str, regexp){
        return str.length() - matching_length(str, regexp)
    }
}
t = new test()
/* 空白類文字以外は何文字か？ */
println t.unmatching_length("abc d eee ff\n", ~/\s/)


/* 空白類文字は何文字か？ */
println t.matching_length("abc d eee ff\n", ~/\s/)
println t.matching_length("abc d eee ff", ~/\s/)
println t.matching_length("", ~/\s/)
// ※空白が12個書いてある
println t.matching_length("            \n", ~/\s/)
println t.matching_length("            ", ~/\s/)

/* 「も」は何文字か？ */
println t.matching_length("すももももももももものうち", ~/も+/)


/* 空白類文字以外は何文字か？ */
println t.unmatching_length("abc d eee ff\n", ~/\s/)
println t.unmatching_length("abc d eee ff", ~/\s/)
println t.unmatching_length("", ~/\s/)
// ※空白が12個書いてある
println t.unmatching_length("            \n", ~/\s/)
println t.unmatching_length("            ", ~/\s/)

/* 「も」以外は何文字か？ */
println t.unmatching_length("すももももももももものうち", ~/も+/)



