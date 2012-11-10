println new Date().time


//エポック秒から日時を求める

println new Date(new Date().time + 24*60*60*1000)
d = new Date(1261491708750)
println d
assert d.time == 1261491708750