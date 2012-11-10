new Float("10")
Integer.decode("10")
Long.decode("10")
new BigInteger("10")

new Float("1.2")
try {
    Integer.decode("1.2")
}catch (java.lang.NumberFormatException e){
}
try {
    Long.decode("1.2")
}catch (java.lang.NumberFormatException e){
}
try {
    new BigInteger("1.2")
}catch (java.lang.NumberFormatException e){
}

try {
    new Float("0x10")
}catch (java.lang.NumberFormatException e){
}

Integer.decode("0x10")
Long.decode("0x10")
try {
    new BigInteger("0x10")
}catch (java.lang.NumberFormatException e){
}

new Float("010")
Integer.decode("010")
Long.decode("010")
new BigInteger("010")
