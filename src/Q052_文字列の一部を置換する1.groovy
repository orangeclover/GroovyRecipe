ai = "あいあいあい"
println "置換前:" + ai
println "置換後  :" + ai.replaceFirst(/あい/,"愛")

println "置換しても元の文字列には影響はにない" + ai

println ""
println "置換後  :" + ai.replaceAll(/あい/,"愛")




println ""
test="abcdefg"
println "置換前:" + test
println "置換後 :" + test.tr("acg","ACG")


println ""
println "置換前:" + ai
println "置換後:" + ai.tr("い","お")


println ""
println "置換前:" + ai
println "置換後:" + ai.tr("あい","愛")
