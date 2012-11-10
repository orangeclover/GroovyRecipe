cal = Calendar.getInstance()
cal.set(Calendar.DAY_OF_WEEK_IN_MONTH,3)
cal.set(Calendar.DAY_OF_WEEK,2)
println cal.getTime().format("yyyy/MM/dd")


calNG = Calendar.getInstance();
calNG.set(Calendar.WEEK_OF_MONTH,3);
calNG.set(Calendar.DAY_OF_WEEK,2);
println calNG.getTime().format("yyyy/MM/dd")
