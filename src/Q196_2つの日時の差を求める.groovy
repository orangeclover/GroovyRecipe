import org.codehaus.groovy.runtime.TimeCategory
import groovy.time.TimeCategory


//♪もういくつ寝るとお正月
println new Date(new Date().year +1,0,1) - new Date()

println(use(TimeCategory) { new Date("2010/1/1 0:0:0") - new Date() }.days +1)


//年齢
//天皇の誕生日1933/12/23生まれ

println (use(TimeCategory) { new Date() - new Date("1933/12/23") }.days /365)

println ((20091223 - 19331223)/10000)


//時間
//新年までの残り時間
diff = use(TimeCategory) { new Date("2010/1/1 0:0:0") - new Date()  }
println diff.days*24 + diff.hours

//新年までの残り秒
diffSeconds = use(TimeCategory) { new Date("2010/1/1 0:0:0") - new Date() }
println diffSeconds.days*24*60*60 + diff.hours*60*60 + diff.minutes*60 + diff.seconds
