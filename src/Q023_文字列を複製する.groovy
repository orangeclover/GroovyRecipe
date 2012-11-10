str1  = "This is a String"
str2  = new String(str1)
str3 = str1

assert str1 == str2
assert str1 == str3
assert !str1.is(str2)
assert str1.is(str3)


str1 = "This is another string"

assert str1 != str3
assert !str1.is(str3)
