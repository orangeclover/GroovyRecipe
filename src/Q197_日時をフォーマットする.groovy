println new java.text.SimpleDateFormat("yyyy/MM/dd(E)").format(new Date())
println new java.text.SimpleDateFormat("h:mm a").format(new Date())
println new java.text.SimpleDateFormat("EEE, MMM d, ''yy", Locale.US).format(new Date())
println new java.text.SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US).format(new Date())
println new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date())


println new Date().format("yyyy/MM/dd(E)")
println new Date().format("h:mm a")
println new Date().format("EEE, MMM d, ''yy")
println new Date().format("EEE, d MMM yyyy HH:mm:ss Z")
println new Date().format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
try {
    println new Date().format("EEE, MMM d, ''yy", Locale.US)
} catch(MissingMethodException e) {
}

