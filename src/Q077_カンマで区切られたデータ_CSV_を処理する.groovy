f = new File("../test/input\\201009気温.csv")
def monthlyList = []
f.splitEachLine(","){ data ->
    println "データ:"+ data
    monthlyList.add(data)
}
println "----------"
println monthlyList

println "----------"
f2 = new File("../test/output/201009気温_save.csv")
f2.write("")
monthlyList[1..-1].each{data ->
    line = data[0]+ "日,平均気温:" + data[1] + ",最高気温:" + data[2] + ",最低気温:" + data[3]
    println line
    f2.append(line + "\n")
}