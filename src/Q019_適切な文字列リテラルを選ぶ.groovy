hoge="fuga"

println "$hoge"
println "${hoge}"
println "\$hoge=${hoge}"

println '$hoge'
println '${hoge}'
println "'$hoge'=${hoge}"

println "\""
println "\'"

s1 = """1行目の文字列
2行目の文字列
3行目の文字列です。"""



s2 = """\
1行目の文字列
2行目の文字列
3行目の文字列です。
"""

println "--------------------------"
println s1
println "--------------------------"
println s2
println "--------------------------"