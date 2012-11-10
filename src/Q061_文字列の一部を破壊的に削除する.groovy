str1 = "あいあいあい"

str2 = str1.replaceFirst(/あい/,"")
println str1
println str2

str1 = str1.replaceFirst(/あい/,"")
println str1

str3 = "goooooooooooooogle"
str4 = str3.replaceAll(/o/,"")
println str3
println str4

str3 = str3.replaceAll(/o/,"")
println str3



str5 = "kuma-"
str6 = str5.toList()
str6[0] = ''
str7 = str6.join()


println str5
println str6
println str7


str5 = "kuma-"
str5 = str5.toList()
str5[0] = ''
str5 = str5.join()
println str5