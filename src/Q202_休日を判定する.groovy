
/*
 * KtHoliday は以下のクラス
 * http://www.abiru.jp/obsolutes/souko/KtHoliday_Java/KtHoliday.java
 */

def isHoliday(date){
    cal = Calendar.getInstance()
    cal.setTime(new Date(date))
    println date 
    println (!"".equals(KtHoliday.getHolidayName(date))) || (cal.get(Calendar.DAY_OF_WEEK) == 1 ) || (cal.get(Calendar.DAY_OF_WEEK) == 7)
}


def getHolidayName(date){
    println date 
    cal = Calendar.getInstance()
    cal.setTime(new Date(date))

    name =  KtHoliday.getHolidayName(date)
    if (!"".equals(name)) {
        println name
        return
    }
    
    if (cal.get(Calendar.DAY_OF_WEEK) == 1 ) {
        println "日曜日"
        return
    }
    if (cal.get(Calendar.DAY_OF_WEEK) == 7) {
        println "土曜日"
        return
    }
    println "平日"
}

isHoliday("2009/12/28")
isHoliday("2010/1/1")
isHoliday("2010/1/11")
isHoliday("2010/1/15")


getHolidayName("2009/12/28")
getHolidayName("2010/1/1")
getHolidayName("2010/1/11")
getHolidayName("2010/1/15")


