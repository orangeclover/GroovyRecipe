
def hidePassword(str){
    str.replaceAll(/(Password:)(.*)/) {all, s1, s2 ->
            s1 + '*'*s2.size()
    }
/// クロージャーに3つ指定しないとだめ
}


/*
str.replaceAll(/(Password:)(.*)/ , "$1" + '*'*$2.size())
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
D:\workspace\GroovySample\groovy_SandBox\Q068_文字列の一部を特定の文字列で埋める.groovy: 52: illegal string body character after dollar sign;
   solution: either escape a literal dollar sign "\$5" or bracket the value expression "${5}" @ line 52, column 34.
   str.replaceAll(/(Password:)(.*)/ , "$1" + '*'*$2.size())
                                    ^

1 error
*/


/*
str.replaceAll(/(Password:)(.*)/ , "$1" + '*'*"$2".size())
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
D:\workspace\GroovySample\groovy_SandBox\Q068_文字列の一部を特定の文字列で埋める.groovy: 9: illegal string body character after dollar sign;
   solution: either escape a literal dollar sign "\$5" or bracket the value expression "${5}" @ line 9, column 34.
   str.replaceAll(/(Password:)(.*)/ , "$1" + '*'*"$2".size())
                                    ^

1 error
*/

/*
str.replaceAll(/(Password:)(.*)/ , '$1' + '*'*'$2'.size())
Caught: Assertion failed:

assert result == "Password:********************"
       |      |
       |      false
       Password:**

Assertion failed:
*/

/*
  str.replaceAll(/(Password:)(.*)/, /$1/ + '*'* /$2/.size())
Caught: Assertion failed:

assert result == "Password:********************"
       |      |
       |      false
       Password:**

Assertion failed:

 「$2」が遅延評価されてないっぽいな。仕様？
 なんで？？
*/





result = hidePassword("Password:あいうえおabcdeかきくけこfghij")
assert result == "Password:********************"
println result

