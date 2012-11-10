//Dateクラスで来月の1日の前日を求める方法

//今月
d = new Date()
println new Date(d.year,d.month+1,1-1).date


//来月
d = new Date()
println new Date(d.year,d.month+2,1-1).date


//再来月
d = new Date()
println new Date(d.year,d.month+3,1-1).date


//月指定(2012年2月)

d = new Date("2012/2/1")
println new Date(d.year,d.month+1,1-1).date

//CalendarクラスのgetActualMaximumメソッドを使う方法
//今月
println Calendar.getInstance().getActualMaximum(Calendar.DATE)


//来月(2010年1月)
cal = Calendar.getInstance()
cal.add(Calendar.MONTH,1);cal.getActualMaximum(Calendar.DATE)

//再来月
cal = Calendar.getInstance(); cal.add(Calendar.MONTH,2)
cal.getActualMaximum(Calendar.DATE)

//月指定(2012年2月)
cal = Calendar.getInstance()
cal.set(Calendar.YEAR,2012)
cal.set(Calendar.MONTH,Calendar.FEBRUARY)
println cal.getActualMaximum(Calendar.DATE)

