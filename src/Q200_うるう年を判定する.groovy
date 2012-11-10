import java.util.GregorianCalendar

def isLeapYear(y){
  println y
  println ((y % 4==0) && (y % 100!=0) || ( y % 400==0))
  println (((y & 3)==0) && (!("$y" ==~ /.*00$/ )) || ((y & 15)==0))
  println new GregorianCalendar().getInstance().isLeapYear(y)
}


isLeapYear(1900)
isLeapYear(2000)
isLeapYear(2008)
isLeapYear(2009)
isLeapYear(2100)

gregorianCalendar= new GregorianCalendar()
gregorianCalendar.isLeapYear(1900)
gregorianCalendar.isLeapYear(2000)
gregorianCalendar.isLeapYear(2008)
gregorianCalendar.isLeapYear(2009)
gregorianCalendar.isLeapYear(2100)


