s1 = "abc"
s2 = "abc"
s3 = new String("abc")
s4 = s3
s5 = s3
s6 = new String("abc")
s7= new String("abc")
assert s1==s2
assert s4==s5
assert s6==s7
assert s1.equals(s2)
assert s4.equals(s4)
assert s6.equals(s7)

assert !s6.is(s7)

assert "蛙の子" == "蛙の子"
assert "蛙の子" != "蛙"

assert "Content".compareToIgnoreCase("CONTENT") == 0
assert "Content".find(/(?i)CONTENT/) == "Content"




assert ("abc" > "xyz")?true:false == false
assert ("abc" < "xyz")?true:false == true

