//通算日を求める
println new Date() - new Date(new Date().year,0,1)+1

//通算週
println Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)

