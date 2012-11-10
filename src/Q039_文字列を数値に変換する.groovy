def lowerOrUpper(c) {
    if (Character.isLowerCase((char)c)) { 
        return "Lower"
    } else {
        return "Upper"
    }
}
assert lowerOrUpper('A') == "Upper"
assert lowerOrUpper('a') == "Lower"
