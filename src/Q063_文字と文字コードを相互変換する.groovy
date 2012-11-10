printf("%#x%n", (int)"a")

println Integer.toHexString((int)"a")

printf("%#x%n", (int)"cba"[2])

printf("%#x%n", (int)"あ")

printf("%#x%n", (int)"あいう"[0])

printf("%#x%n", (int)"あいう"[1])



println new String((char)Integer.decode("0x61"))

println new String((char)Integer.decode("0x3042"))

println ((Character)Integer.decode("0x61")).toString()

println ((Character)Integer.decode("0x3042")).toString()


codes = []
"aiueo".each{c ->
    codes.add(sprintf("%#x", (int)c))
}
println codes


codes = []
"あいうえお".each{ c ->
    codes.add(sprintf("%#x", (int)c))
}
println codes
