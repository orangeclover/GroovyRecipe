assert "aaaccc" =~ /(?:aaa)|(?:bbb)/
assert "bbbccc" =~ /(?:aaa)|(?:bbb)/
assert !("cccddd" =~ /(?:aaa)|(?:bbb)/)


re1 = /aaa/
re2 = /bbb/

m1 = ("aaaccc" =~ "${re1}|${re2}")
assert m1.find() == true
assert m1[0] == "aaa"

m2= ("bbbccc" =~ "${re1}|${re2}")
assert m2.find() == true
assert m2[0] == "bbb"

m3 = "cccddd" =~ "${re1}|${re2}"
assert m3.find() == false


