assert "This is a String".length() == "This is a String".size()
assert "This is a String".getBytes("SJIS").size() == "This is a String".getBytes("UTF-8").size()

assert "いろはにほへと".length() == "いろはにほへと".size()
assert "いろはにほへと".getBytes("SJIS").size() != "いろはにほへと".getBytes("UTF-8").size()
