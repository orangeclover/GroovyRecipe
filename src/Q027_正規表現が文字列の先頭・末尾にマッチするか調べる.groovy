assert (~/\Aa/).matcher("aiueo").find() == true
assert (~/\Ao/).matcher("aiueo").find() == false
assert (~/\Aあ/).matcher("あいうえお").find() == true

assert (~/o\z/).matcher("aiueo").find() == true
assert (~/a\z/).matcher("aiueo").find() == false
assert (~/あ\z/).matcher("あいうえお").find() == false


assert "abc\ndefg\nhi\n".find(~/\Ad./) == null
assert "abc\ndefg\nhi\n".find(~/^d./) == null

assert "abc\ndefg\nhi\n".find(~/..$/) == "hi"
assert "abc\ndefg\nhi\n".find(~/..\Z/) == "hi"
assert "abc\ndefg\nhi\n".find(~/..\z/) == null



