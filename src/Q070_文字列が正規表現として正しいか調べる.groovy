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
assert validRegexp(/[\x81-\x9f\xe0-\xef][x400\x73\x80-\xfc]/) == true
assert validRegexp(/[\x81-\x9f\xe0-\xef][x400\x73\x80-\xfc/) == false
assert validRegexp(/[В†-Вс]/) == true
assert validRegexp(/[!-~]/) == true
