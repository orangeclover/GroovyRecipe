import java.util.regex.Pattern

def validRegexp(pattern){
    try {
        Pattern.compile(pattern)
        true
    } catch (e) {
        false
    }
}

assert validRegexp("aaa*") == true
assert validRegexp("*.") == false
