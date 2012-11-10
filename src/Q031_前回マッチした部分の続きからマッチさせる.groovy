m1 = (~/\w+/).matcher("abc def ghi jkl")
m1.find()
assert m1[0] == "abc"

assert m1[1] == "def"

assert m1[2] == "ghi"

assert m1[3] == "jkl"

m2 = (~/\w+/).matcher("abc def ghi jkl")
m2.find()

m2.each{println it}
