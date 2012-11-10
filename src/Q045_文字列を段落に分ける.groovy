Groovy_in_Action_japanese =
"""Groovyとは「Javaのためのスクリプト言語」ですが、その一言だけで語れるものではありません。公式サイトでは、「GroovyはJavaプラットフォームのためのアジャイルで動的な言語である。PythonやRuby、Smalltalkなどの言語から多くの機能を取り入れ、Java開発者が Java風の構文を使ってこれらを利用できるようにしている」と述べられています。これは、どういうことでしょうか?
GroovyはJava(とGroovy自体)で書かれており、そのコードはJavaバイトコードにプリコンパイルすることも可能です。つまり、Groovyでプログラムを書くということは、特別な種類のJavaプログラムを書いているということにほかなりません。
Groovy はJava仮想マシンの上で実行され、Javaのライブラリを利用します。また、その構文はJavaと整合性を備えています。このような「Javaとの親和性」を持ちつつも、RubyやPythonのような動的言語の特長も有しているのがGroovyなのです。
そして、Java言語自体に次いで、GroovyはJavaプラットフォーム上で2番目の標準言語にもなりました。さらに、「Groovy版Ruby on Rails」とも呼べる「Grails」というWebフレームワークの開発も進んでいます(本書でも、1章を割いて紹介しています)。
Groovyの魅力はまだまだありますが、ここに挙げただけでも、Java開発者であればGroovyを試さない理由はないでしょう。"""


Groovy_in_Action_english=
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


j = Groovy_in_Action_japanese.split(/\n/)
println j
println j.length
println ""

e = Groovy_in_Action_english.split(/\n\n/)
println e
println e.length
println ""

e_strict  = Groovy_in_Action_english.split(/\n[ \t\r\f]*\n/)
println "----------"
println e_strict
println e_strict.length
println ""