mm1 = (~/(?m)^d./).matcher("abc\ndefg\nhi\n")
assert mm1.find() == true

mm2 = (~/(?m)\Ad./).matcher("abc\ndefg\nhi\n")
assert mm2.find()  == false

mm3 = (~/(?m)..$/).matcher("abc\ndefg\nhi\n")
assert mm3.find()  == true

mm4 = (~/(?m)..\z/).matcher("abc\ndefg\nhi\n")
assert mm4.find() == false

mm5 = (~/(?m)..\Z/).matcher("abc\ndefg\nhi\n")
assert mm5.find() == true


assert "abc\ndefg\nhi\n".find(~/(?m)^d./) == "de"
assert "abc\ndefg\nhi\n".find(~/(?m)\Ad./) == null
assert "abc\ndefg\nhi\n".find(~/(?m)..$/) == "bc"
assert "abc\ndefg\nhi\n".find(~/(?m)..\z/) == null
assert "abc\ndefg\nhi\n".find(~/(?m)(?s)..\z/) == "i\n"
assert "abc\ndefg\nhi\n".find(~/(?m)..\Z/) == "hi"
assert "abc\ndefg\nhi\n".find(~/(?m)(?s)..\Z/) == "hi"