Groovy_in_Action_english =
"""Groovy, the brand-new language for the Java platform, brings to Java many of the features that have made Ruby popular. Groovy in Action is a comprehensive guide to Groovy programming, introducing Java developers to the new dynamic features that Groovy provides. To bring you Groovy in Action, Manning again went to the source by working with a team of expert authors including both members and the Manager of the Groovy Project team. The result is the true definitive guide to the new Groovy language.

Groovy in Action introduces Groovy by example, presenting lots of reusable code while explaining the underlying concepts. Java developers new to Groovy find a smooth transition into the dynamic programming world. Groovy experts gain a solid reference that challenges them to explore Groovy deeply and creatively.

Because Groovy is so new, most readers will be learning it from scratch. Groovy in Action quickly moves through the Groovy basics, including:

 * Simple and collective Groovy data types
 * Working with Closures and Groovy Control Structures
 * Dynamic Object Orientation, Groovy style

Readers are presented with rich and detailed examples illustrating Groovy's enhancements to Java, including

 * How to Work with Builders and the GDK
 * Database programming with Groovy

Groovy in Action then demonstrates how to Integrate Groovy with XML, and provides,

 * Tips and Tricks
 * Unit Testing and Build Support
 * Groovy on Windows
 
An additional bonus is a chapter dedicated to Grails, the Groovy Web Application Framework. """


Groovy_in_Action_english.split(/\n/).each {line->
    println "\"" + line + "\""
}

println "\n行頭、行末の空白類を取り除く"
Groovy_in_Action_english.split(/\n/).each {line->
    println "\"" + line.trim() + "\""
}

println "\n\nGで始まる行"
Groovy_in_Action_english.split(/\n/).each {line->
    (line =~/^G.*/).each{ 
        println "\""+ it +"\""
    }
}

