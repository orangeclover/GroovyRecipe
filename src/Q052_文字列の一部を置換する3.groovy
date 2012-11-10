result = ['N','a','m','a','z','u']
println result
result[1..1] = 'u'

println result


/*
result = "Numa-"
result[0..1] = 'k'
println result

Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.putAt() is applicable for argument types: (groovy.lang.IntRange, java.lang.String) values: [0..1, k]
Possible solutions: putAt(java.lang.String, java.lang.Object), getAt(groovy.lang.IntRange), getAt(groovy.lang.IntRange), getAt(java.lang.String), getAt(groovy.lang.Range), getAt(groovy.lang.Range)
*/

/*
result = "Numa-"
result[0,1] = 'k'
println result
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.putAt() is applicable for argument types: (java.util.ArrayList, java.lang.String) values: [[0, 1], k]
Possible solutions: putAt(java.lang.String, java.lang.Object), getAt(java.lang.String), getAt(groovy.lang.EmptyRange), getAt(groovy.lang.EmptyRange), getAt(groovy.lang.Range), getAt(groovy.lang.Range)
*/