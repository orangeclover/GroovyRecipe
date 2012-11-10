def IsNumberString(s) {
    try {
        new Integer(s)
        return "integer"
    } catch(e) { 
        try {
            new Float(s)
            return "float"
        } catch(ex) {
            return "string"
        }
    }
}

println IsNumberString("12")
println IsNumberString("1.23")
println IsNumberString("ab")