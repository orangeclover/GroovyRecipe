println new Date("2010/1/1")
println new Date("Jun/1/ 2010")
println new Date("Jun 1 2010")
println new Date("1 Jun 2010")

/*
new Date("1 1 2010")
ERROR java.lang.IllegalArgumentException: null

new Date("1/Jun/2010")
ERROR java.lang.IllegalArgumentException: null
*/

println new Date("2009/12/31 23:59:59")
println new Date("Dec 31 2009 23:59:59")
println new Date("Thu Dec 31 2009 23:59:59 +900")
