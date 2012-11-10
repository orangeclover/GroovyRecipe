@Grab('commons-lang:commons-lang:2.6')
import org.apache.commons.lang.WordUtils

"aBcDeFg".toUpperCase()
"aBcDeFg".toLowerCase()



str = "this is a pen"
WordUtils.capitalize(str)

text=""
str.split().each{word -> 
    text += word[0].toUpperCase() 
    text += word.size() > 1 ? word[1 .. word.size() - 1] + " " : " " 
}
println text


str = "aBcDeFg"
swapStr = ""
m = (~/./).matcher(str)
m.find()
m.each{ it-> 
    swapStr += (Character.isUpperCase(it as char) ? Character.toLowerCase(it as char) :  Character.toUpperCase(it as char))
}
println swapStr


"ａｉｕｅｏ".toUpperCase()
"ａｉｕｅｏ".toLowerCase()
